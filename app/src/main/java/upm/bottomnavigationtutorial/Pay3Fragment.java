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
import android.widget.ImageView;

public class Pay3Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Payment");

        //Adds the back arrow

        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        View view = inflater.inflate(R.layout.fragment_pay3, container, false);

        Button btnfinish = view.findViewById(R.id.btn_finish);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_products();
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
        inflater.inflate(R.menu.topbar_pay, menu);
        return;
    }

    private void swap_fragment_products() {
        ProductsFragment productsFragment = new ProductsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, productsFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
