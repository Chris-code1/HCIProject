package upm.bottomnavigationtutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductDetailsEggsFragment extends Fragment {

    boolean isClicked = false;
    boolean icClickedPack = false;
    String tag=null;
    public ProductDetailsEggsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Eggs");

        View view = inflater.inflate(R.layout.fragment_product_details_eggs, container, false);
        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();


        final TextView displayPrice = (TextView) view.findViewById(R.id.priceEggs);

        final Button small = view.findViewById(R.id.small);
        final Button medium = view.findViewById(R.id.medium);
        final Button large = view.findViewById(R.id.large);
        final Button pack1 = view.findViewById(R.id.pack1);
        final Button pack2 = view.findViewById(R.id.pack2);
        final Button pack3 = view.findViewById(R.id.pack3);
        final Button pack4 = view.findViewById(R.id.pack4);


        //button to change screen

        final Button btn_addtolist = view.findViewById(R.id.addtolist);


        btn_addtolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_list1();
            }
        });

        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tag="small";
                //   if (isClicked) {
                //buttonColor.setBackgroundColor(0xFFA9A9A9);
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                small.setBackgroundResource(resId);
                //      isClicked = false;


                // } else {
                //  buttonColor.setBackgroundColor(0xFFFFA500);
                //small.setBackgroundResource(R.drawable.eggscolor);
                //    isClicked = true;
                //  }

            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //displayIntegerEggs.setText("1 € ");
                tag="medium";
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();


            }
        });

        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //displayIntegerEggs.setText("1,28 € ");
                tag="large";
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();

            }
        });


        pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();

            }
        });
        pack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                icClickedPack = !icClickedPack;
                int resId = icClickedPack ? R.drawable.color11 : R.drawable.color2;
                pack2.setBackgroundResource(resId);
                displayPrice.setText("1,00 € ");

            }
        });
        pack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();


            }
        });

        pack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }





    //function to change fragment to payscreen
    private void swap_fragment_list1() {
        List1Fragment list1Fragment = new List1Fragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, list1Fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
