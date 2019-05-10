package upm.bottomnavigationtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Recipes");
        View view = inflater.inflate(R.layout.fragment_recipes, container, false);

        //find objects in xml file
        ImageView imgthaichicken = view.findViewById(R.id.imgThaiChicken);
        TextView txtthaichicken = view.findViewById(R.id.txtThaiChicken);
        TextView pricethaichicken = view.findViewById(R.id.priceThaiChicken);

        //set listeners on objects and initiate function when called

        imgthaichicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });

        txtthaichicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });

        pricethaichicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });


        return view;
    }

    private void swap_fragment_recipe_details() {
        RecipeDetailsFragment recipeDetailsFragment = new RecipeDetailsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, recipeDetailsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.topbar_recipes, menu);
        return;
    }
}
