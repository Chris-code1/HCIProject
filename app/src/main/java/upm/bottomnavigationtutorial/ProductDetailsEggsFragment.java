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


        final TextView displayIntegerEggs = (TextView) view.findViewById(R.id.priceEggs);

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
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();
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
               // if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                  //  medium.setBackgroundResource(R.drawable.chipbutton);
                 //   isClicked = false;
                medium.setBackgroundResource(R.drawable.eggscolor);



                // } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                //    medium.setBackgroundResource(R.drawable.eggscolor);
               //     isClicked = true;


               // }

            }
        });

        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //displayIntegerEggs.setText("1,28 € ");
                tag="large";
                //if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                //    large.setBackgroundResource(R.drawable.chipbutton);
                 //   isClicked = false;
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();


               // } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                   // large.setBackgroundResource(R.drawable.eggscolor);
                 //   isClicked = true;


             //   }
            }
        });


        pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //displayIntegerEggs.setText(checkPacksSix());



            }
        });
        pack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayIntegerEggs.setText(checkPacksDoze());

            }
        });
        pack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayIntegerEggs.setText(checkPacksVeinte());

            }
        });

        pack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayIntegerEggs.setText(checkPacksTreinta());
            }
        });

        return view;
    }
    private String checkPacksSix(){
        String text="";
        switch (tag){
            case "small":
                text="0,80 € ";
                break;
            case "medium" :
                text="0,90 € ";
                break;
            case "large":
                text="1,00 € ";
                break;
        }
        return text;
    }


    private String checkPacksDoze(){
        String text="";
        switch (tag){
            case "small":
                text=" 1,00 € ";
                break;
            case "medium" :
                text="1,20 € ";
                break;
            case "large":
                text="1,30 € ";
                break;
        }
        return text;
    }

    private String checkPacksVeinte(){
        String text="";
        switch (tag){
            case "small":
                text=" 1,20 € ";
                break;
            case "medium" :
                text="1,50 € ";
                break;
            case "large":
                text="1,80 € ";
                break;
        }
        return text;
    }

    private String checkPacksTreinta(){
        String text="";
        switch (tag){
            case "small":
                text=" 1,40 € ";
                break;
            case "medium" :
                text="1,70 € ";
                break;
            case "large":
                text="2,10 € ";
                break;
        }
        return text;
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
