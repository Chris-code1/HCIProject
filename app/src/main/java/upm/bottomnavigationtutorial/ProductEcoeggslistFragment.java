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
import android.widget.LinearLayout;

public class ProductEcoeggslistFragment extends Fragment {


    double integerNesquik = 2.5;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Category Eggs");

        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        View view = inflater.inflate(R.layout.fragment_eggslist, container, false);

        LinearLayout linearLayoutEggs = view.findViewById(R.id.linearlayoutEggs);

        linearLayoutEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_eggs();
            }
        });


    return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.topbar_bestroute, menu);
        return;
    }
    //function to change fragment to payscreen

    private void swap_fragment_eggs() {

        ProductDetailsEggsFragment productDetailsEggsFragment = new ProductDetailsEggsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, productDetailsEggsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

}
