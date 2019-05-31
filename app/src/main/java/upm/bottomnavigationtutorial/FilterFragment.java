package upm.bottomnavigationtutorial;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FilterFragment extends Fragment {

    private boolean isClicked = false;
    boolean isClickedTime = false;
    boolean isClickedPrice = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Filter");
        View view = inflater.inflate(R.layout.fragment_filter, container, false);

        //add Arrow
        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        final Button buttonColor= view.findViewById(R.id.add1);
        final Button buttonColor2= view.findViewById(R.id.add2);
        final Button buttonColor3= view.findViewById(R.id.add3);
        final Button buttonColor4= view.findViewById(R.id.button5dd4);
        final Button buttonColor5= view.findViewById(R.id.button9dd5);
        final Button buttonColor6= view.findViewById(R.id.add6);
        final Button buttonColor7= view.findViewById(R.id.add7);
        final Button buttonColor8= view.findViewById(R.id.add8);
        final Button buttonColor9= view.findViewById(R.id.quinze);
        final Button buttonColor10= view.findViewById(R.id.trintaTiming);
        final Button buttonColor11= view.findViewById(R.id.hora);
        final Button buttonColor12= view.findViewById(R.id.gramas1);
        final Button buttonColor13= view.findViewById(R.id.gramas2);
        final Button buttonColor14= view.findViewById(R.id.gramas3);



        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            isClicked = !isClicked;
            int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
            buttonColor.setBackgroundResource(resId);
            }
        });


        buttonColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                buttonColor2.setBackgroundResource(resId);
            }

        });

        buttonColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                buttonColor3.setBackgroundResource(resId);
            }
        });


        buttonColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                buttonColor4.setBackgroundResource(resId);
            }
        });

        buttonColor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                buttonColor5.setBackgroundResource(resId);
            }
        });


        buttonColor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClicked ? R.drawable.color11 : R.drawable.color2;
                buttonColor6.setBackgroundResource(resId);
            }
        });


        buttonColor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClickedTime ? R.drawable.color11 : R.drawable.color2;
                buttonColor7.setBackgroundResource(resId);
            }
        });


        buttonColor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = !isClicked;
                int resId = isClickedTime ? R.drawable.color11 : R.drawable.color2;
                buttonColor8.setBackgroundResource(resId);
            }
        });


        buttonColor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClickedTime = !isClickedTime;
                int resId = isClickedTime ? R.drawable.color11 : R.drawable.color2;
                buttonColor9.setBackgroundResource(resId);
            }
        });

        buttonColor10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClickedTime = !isClickedTime;
                int resId = isClickedTime ? R.drawable.color11 : R.drawable.color2;
                buttonColor10.setBackgroundResource(resId);
            }
        });

        buttonColor11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClickedTime = !isClickedTime;
                int resId = isClickedTime ? R.drawable.color11 : R.drawable.color2;
                buttonColor11.setBackgroundResource(resId);
            }
        });

        buttonColor12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClickedPrice = !isClickedPrice;
                int resId = isClickedPrice ? R.drawable.color11 : R.drawable.color2;
                buttonColor12.setBackgroundResource(resId);
            }
        });


        buttonColor13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isClickedPrice = !isClickedPrice;
                int resId = isClickedPrice ? R.drawable.color11 : R.drawable.color2;
                    buttonColor13.setBackgroundResource(resId);

            }
        });

        buttonColor14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClickedPrice = !isClickedPrice;
                int resId = isClickedPrice ? R.drawable.color11 : R.drawable.color2;
                buttonColor14.setBackgroundResource(resId);
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
        inflater.inflate(R.menu.topbar_filter, menu);
        return;
    }



}
