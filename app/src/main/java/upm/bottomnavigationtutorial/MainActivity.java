package upm.bottomnavigationtutorial;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import br.com.mauker.materialsearchview.MaterialSearchView;


public class MainActivity extends AppCompatActivity {

//    MaterialSearchView msv;
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

            case R.id.filterprod:
                selectedFragment = new FiltersProductsFragment();
                break;
            case R.id.search:
                Toast.makeText(this, "This function is currently not available", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "This function is currently not available", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sort:
                Toast.makeText(this, "This function is currently not available", Toast.LENGTH_SHORT).show();
                return true;
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
                            selectedFragment = new List3Fragment();
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

    public void addArrow(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void removeArrow(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(null);
    }





}
