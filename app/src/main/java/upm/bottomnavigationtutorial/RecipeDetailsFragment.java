package upm.bottomnavigationtutorial;

import android.app.Activity;
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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RecipeDetailsFragment extends Fragment {

    int minteger = 1;
    int minteger2 = 1;
    int minteger3 = 6;
    int minteger4 = 1;
    int minteger5 = 6;
    int minteger6 = 1;


    boolean isClicked = true;

    double firstPrice = 2.60;
    double secPrice = 1.55;
    double treePrice = 1.30;
    double forPrice = 1.50;
    double sixPrice = 2.20;

    double finalTotal=18.55;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Recipe Details");
        View view =  inflater.inflate(R.layout.fragment_recipedetails, container, false);
        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        final TextView displayInteger = (TextView) view.findViewById(R.id.integer_number);
        final TextView displayFirst = (TextView) view.findViewById(R.id.priceIngredient);
        final TextView displaySec = (TextView) view.findViewById(R.id.secondPrice);
        final TextView displayThird = (TextView) view.findViewById(R.id.thirdPrice);
        final TextView displayFor = (TextView) view.findViewById(R.id.forPrice);
        final TextView displaySix = (TextView) view.findViewById(R.id.sixPrice);
        final TextView displayTotal = (TextView) view.findViewById(R.id.totalprecio);

        final Button ButtonFavorite = (Button) view.findViewById(R.id.favoritebutton);


        ButtonFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    ButtonFavorite.setBackgroundResource(R.drawable.save);
                    Toast.makeText(getActivity(), "Recipe Saved",
                            Toast.LENGTH_LONG).show();
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    ButtonFavorite.setBackgroundResource(R.drawable.notsave);
                    Toast.makeText(getActivity(), "Recipe Unsaved",
                            Toast.LENGTH_LONG).show();
                    isClicked = true;


                }
            }
        });


        //button
        Button btn_addtolist = view.findViewById(R.id.addlist);

        btn_addtolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap_fragment_pay();
            }
        });

        //first ingredient
        final Button plusButton = view.findViewById(R.id.plus1);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minteger == 1) {
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }
                else {

                    minteger = minteger + 1;
                    Double Total= firstPrice*minteger;
                    displayInteger.setText(Integer.toString(minteger));
                    displayFirst.setText(Total+ "€");
                    finalTotal=finalTotal+Total;
                    displayTotal.setText(finalTotal+"€");

                }
            }
        });



        final Button plusMenos = view.findViewById(R.id.less1);
        plusMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Total;
                if (minteger > 0) {
                    minteger = minteger - 1;
                    Total= firstPrice*minteger;
                    displayInteger.setText(Integer.toString(minteger));
                    displayFirst.setText(Total+ "€");

                    finalTotal=finalTotal-firstPrice;
                    displayTotal.setText(finalTotal+"€");
                }else if(minteger<0){
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                     Toast.LENGTH_LONG).show();
                }

            }
        });





        //second ingredient
        final TextView displayInteger2 = (TextView) view.findViewById(R.id.integer_number2);
        final Button plusButton2 = view.findViewById(R.id.plus2);
        plusButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minteger2 == 1) {
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }
                else {

                    minteger2 = minteger2 + 1;
                    Double Total = secPrice*minteger2;
                    displayInteger2.setText(Integer.toString(minteger2));
                    displaySec.setText(Total+ "€");
                    finalTotal=finalTotal+Total;
                    displayTotal.setText(finalTotal+"€");


                }
            }

        });

        final Button plusMenos2 = view.findViewById(R.id.less2);
        plusMenos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minteger2 > 0) {
                    minteger2 = minteger2 - 1;
                    Double Total = secPrice*minteger2;
                    displayInteger2.setText(Integer.toString(minteger2));
                    displaySec.setText(Total+ "€");

                    finalTotal=finalTotal-secPrice;
                    displayTotal.setText(finalTotal+"€");


                }else if(minteger2<0){
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }



            }
        });


        //third ingredient
        final TextView displayInteger3 = (TextView) view.findViewById(R.id.integer_number3);
        final Button plusButton3 = view.findViewById(R.id.plus3);

        plusButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (minteger3 >4 && minteger3 <= 6) {
                if (minteger3==6) {
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();

                }

                else{
                    minteger3 = minteger3 + 1;
                    displayInteger3.setText(Integer.toString(minteger3));
                    Double Total= treePrice*minteger3;
                    displayThird.setText(Total + "€");

                    finalTotal=finalTotal+treePrice;
                    displayTotal.setText(finalTotal+"€");
                }

                //minteger = minteger +1 ;

                //displayInteger.setText(Integer.toString(minteger));
            }
        });

        final Button plusMenos3 = view.findViewById(R.id.less3);
        plusMenos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minteger3>4) {
                    minteger3 = minteger3 - 1 ;
                    displayInteger3.setText(Integer.toString(minteger3));
                    Double Total= treePrice*minteger3;
                    displayThird.setText(Total + "€");

                    finalTotal=finalTotal-treePrice;
                    displayTotal.setText(finalTotal+"€");



                }
                else if (minteger3<4){
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }



            }
        });



        //forth ingredient
        final TextView displayInteger4 = (TextView) view.findViewById(R.id.integer_number4);
        final Button plusButton4 = view.findViewById(R.id.plus4);

        plusButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minteger4 == 1) {
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                } else {

                    minteger4 = minteger4 + 1;
                    Double Total = forPrice * minteger4;
                    displayInteger4.setText(Integer.toString(minteger4));
                    displayFor.setText(Total + "€");
                    finalTotal=finalTotal+Total;
                    displayTotal.setText(finalTotal+"€");
                }
            }
        });


        final Button plusMenos4 = view.findViewById(R.id.less4);
        plusMenos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minteger4 > 0) {
                    minteger4 = minteger4 - 1;
                    Double Total = forPrice * minteger4;
                    displayInteger4.setText(Integer.toString(minteger4));
                    displayFor.setText(Total + "€");
                    finalTotal=finalTotal-forPrice;
                    displayTotal.setText(finalTotal+"€");
                }else if(minteger4<0){
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }






            }
        });


        //fifth ingredient
        final TextView displayInteger5 = (TextView) view.findViewById(R.id.integer_number5);
        final Button plusButton5 = view.findViewById(R.id.plus5);
        plusButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button plusMenos5 = view.findViewById(R.id.less5);
        plusMenos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                        Toast.LENGTH_LONG).show();
            }
        });

        //six ingredient

        final TextView displayInteger6 = (TextView) view.findViewById(R.id.integer_number6);
        final Button plusButton6 = view.findViewById(R.id.plus6);
        plusButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minteger6 == 1) {
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }
                else {

                    minteger6 = minteger6 + 1;
                    Double Total= sixPrice*minteger6;
                    displayInteger6.setText(Integer.toString(minteger6));
                    displaySix.setText(Total + "€");
                    finalTotal=finalTotal+Total;
                    displayTotal.setText(finalTotal+"€");
                }
            }
        });

        final Button plusMenos6 = view.findViewById(R.id.less6);
        plusMenos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minteger6 > 0) {
                    minteger6 = minteger6 - 1;
                    Double Total = sixPrice*minteger6;
                    displayInteger6.setText(Integer.toString(minteger6));
                    displaySix.setText(Total+ "€");
                    finalTotal=finalTotal-sixPrice;
                    displayTotal.setText(finalTotal+"€");
                }else if(minteger6<0){
                    Toast.makeText(getActivity(), "This funcionality is not working at the moment",
                            Toast.LENGTH_LONG).show();
                }



            }
        });






        return view;
    }
    //function to change fragment to payscreen
    private void swap_fragment_pay() {
        List2Fragment list2Fragment = new List2Fragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, list2Fragment);
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
        inflater.inflate(R.menu.topbar_recipedetails, menu);

        return;
    }
}
