package upm.bottomnavigationtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Products");


        //Removes the back arrow
        ((MainActivity) getActivity()).removeArrow();


        View view = inflater.inflate(R.layout.fragment_products, container, false);

        //find objects in xml file to make the whole layout clickable is enough

        LinearLayout layoutNesquick = view.findViewById(R.id.layoutNesquick);
        LinearLayout layoutEggs = view.findViewById(R.id.layoutEggs);



        //set listeners on objects and initiate function when called

        layoutNesquick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_nesquick();
            }
        });


        layoutEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swap_fragment_eggs();
            }
        });


        return view;
    }


//    When clicking on the nesquick layout, change view to product details nesquick

    private void swap_fragment_nesquick() {

        ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, productDetailsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    //    When clicking on the egg layout, change view to product details egg
    private void swap_fragment_eggs() {
        ProductDetailsEggsFragment eggs = new ProductDetailsEggsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, eggs);
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
        inflater.inflate(R.menu.topbar_products, menu);
        super.onCreateOptionsMenu(menu, inflater);
        MenuItem searchProduct = menu.findItem(R.id.search);

        return;
    }
}
