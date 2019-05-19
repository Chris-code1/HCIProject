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

    boolean isClicked = true;

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
               if (isClicked) {
                   //buttonColor.setBackgroundColor(0xFFA9A9A9);
                  buttonColor.setBackgroundResource(R.drawable.color11);
                  isClicked = false;


             } else {
                   //  buttonColor.setBackgroundColor(0xFFFFA500);
                   buttonColor.setBackgroundResource(R.drawable.color2);
                   isClicked = true;


               }
               Log.d("Entro","holA");
            }
        });


        buttonColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor2.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor2.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor3.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor3.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor4.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor4.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor5.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor5.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor6.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor6.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor7.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor7.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor8.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor8.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor9.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor9.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor10.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor10.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor11.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor11.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor12.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor12.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });


        buttonColor13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor13.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor13.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
            }
        });

        buttonColor14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    //buttonColor.setBackgroundColor(0xFFA9A9A9);
                    buttonColor14.setBackgroundResource(R.drawable.color11);
                    isClicked = false;


                } else {
                    //  buttonColor.setBackgroundColor(0xFFFFA500);
                    buttonColor14.setBackgroundResource(R.drawable.color2);
                    isClicked = true;


                }
                Log.d("Entro","holA");
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
