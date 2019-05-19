package upm.bottomnavigationtutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilteredChickenFragment extends Fragment {


    public FilteredChickenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_filtered_chicken, container, false);


        //find buttons in xml file

        LinearLayout layout_john = view.findViewById(R.id.layoutJohnsThaiChickenFiltered);





        layout_john.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swap_fragment_john_filtered();
            }
        });

        return view;


    }



    //function to change fragment to payscreen
    private void swap_fragment_john_filtered() {
        RecipeDetailsFragment recipeDetailsFragment = new RecipeDetailsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, recipeDetailsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
