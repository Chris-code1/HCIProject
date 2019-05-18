package upm.bottomnavigationtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Products");


        //Removes the back arrow
        ((MainActivity) getActivity()).removeArrow();


        View view = inflater.inflate(R.layout.fragment_products, container, false);

        //find objects in xml file
        ImageView imgnesquik = view.findViewById(R.id.imgNesquik);
        ImageView eggs = view.findViewById(R.id.imaga2);
        ImageView emptyList = view.findViewById(R.id.emptyList);//Extra to test
        TextView txtnesquik = view.findViewById(R.id.text13);
        TextView pricenesquik = view.findViewById(R.id.priceNesquik);


        //set listeners on objects and initiate function when called

        imgnesquik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });

        txtnesquik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });

        pricenesquik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_recipe_details();
            }
        });

        eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swap_fragment_eggs();
            }
        });
        emptyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swap_fragment_empty();
            }
        });

        return view;
    }



    private void swap_fragment_recipe_details() {
        ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, productDetailsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
    private void swap_fragment_eggs() {
        ProductDetailsEggsFragment eggs = new ProductDetailsEggsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, eggs);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    private void swap_fragment_empty() {
        EmptyListFragment empty = new EmptyListFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, empty);
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
