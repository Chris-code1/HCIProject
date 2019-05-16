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

public class ListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("List");

        //Removes the back arrow
        ((MainActivity) getActivity()).removeArrow();

        View view = inflater.inflate(R.layout.fragment_list, container, false);


        //find buttons in xml file

        Button btn_pay = view.findViewById(R.id.btn_pay);
        Button btn_findbestroute = view.findViewById(R.id.btn_best_route);


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
        BestRouteFragment BestRouteFragment = new BestRouteFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, BestRouteFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    //function to change fragment to payscreen
    private void swap_fragment_pay() {
        PayFragment payFragment = new PayFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, payFragment);
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
