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
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailsFragment extends Fragment {

    boolean isClicked = false;
    boolean isClicked2 = false;
    boolean isClicked3 = false;

    double integerNesquik = 2.5;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Nesquik");

        View view = inflater.inflate(R.layout.fragment_productdetails, container, false);
        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();


        final TextView displayInteger = (TextView) view.findViewById(R.id.priceNesquik);

        final Button gramas1 = view.findViewById(R.id.gramas1);
        final Button gramas2 = view.findViewById(R.id.gramas2);
        final Button gramas3 = view.findViewById(R.id.gramas3);

        final Button btn_addtolist = view.findViewById(R.id.addtolist);


        btn_addtolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_list();
            }
        });

        gramas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();

            }
        });

        gramas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();
            }
        });


        gramas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked3 = !isClicked3;
                int resId = isClicked3 ? R.drawable.color11 : R.drawable.color2;
                gramas3.setBackgroundResource(resId);
                displayInteger.setText("3,5 € ");
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
    private void swap_fragment_list() {
        ListFragment listFragment = new ListFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, listFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
