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
import android.widget.Button;

public class List3Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Your Shopping List");




        //Removes the back arrow
        ((MainActivity) getActivity()).removeArrow();


        View view = inflater.inflate(R.layout.fragment_list3, container, false);


        //find buttons in xml file

        Button btn_pay = view.findViewById(R.id.btn_pay);
        Button btn_findbestroute = view.findViewById(R.id.btn_best_route);

       // final Button buttonColor = view.findViewById(R.id.add1);
        // set listeners on buttons and initiate function when clicked
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_pay();
            }
        });

        btn_findbestroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_bestroute();
            }
        });

        return view;

    }

    //function to change fragment to bestroute screen
    private void swap_fragment_bestroute() {
    }


    //function to change fragment to payscreen
    private void swap_fragment_pay() {
        ProductsFragment productsFragment = new ProductsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, productsFragment);
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
        inflater.inflate(R.menu.topbar_list, menu);
        return;
    }
}
