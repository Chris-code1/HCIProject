package upm.bottomnavigationtutorial;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // On create function calls everything when application opens
    //test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
        bottomnav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ProductsFragment()).commit();

        setTitle(null);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    // Get passed the item and check which item was clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Fragment selectedFragment = null;

        switch (item.getItemId()) {
            case R.id.filter:
                Toast.makeText(this, "Filter selected", Toast.LENGTH_SHORT).show();
                selectedFragment = new FilterFragment();
                break;
            case R.id.search:
                Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sort:
                Toast.makeText(this, "Sort selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.back:
                Toast.makeText(this, "Back selected", Toast.LENGTH_SHORT).show();
                selectedFragment = new ProductsFragment();
                break;
            case R.id.check:
                Toast.makeText(this, "Check selected", Toast.LENGTH_SHORT).show();
                selectedFragment = new ProductsFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFragment).commit();

        return  true;

    }



    // Listeners for the buttons on the bottom navigation bar. When clicking on one of the Icons, opens a new page

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_products:
                            selectedFragment = new ProductsFragment();
                            break;

                        case R.id.nav_recipes:
                            selectedFragment = new RecipesFragment();
                            break;

                        case R.id.nav_list:
                            selectedFragment = new upm.bottomnavigationtutorial.ListFragment();
                            break;

                        case R.id.nav_account:
                            selectedFragment = new AccountFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return  true;
                }
            };
}
