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

public class BestRouteFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Follow the path");

        //Adds the back arrow

        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        View view = inflater.inflate(R.layout.fragment_bestroute, container, false);

        //find buttons in xml file

        Button btn_finish = view.findViewById(R.id.btn_finish);

        // set listeners on buttons and initiate function when clicked
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_pay();
            }
        });

        return view;
    }

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
        inflater.inflate(R.menu.topbar_bestroute, menu);
        return;
    }
}
