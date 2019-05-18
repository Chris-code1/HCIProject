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

    boolean isClicked = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Filter");
        View view = inflater.inflate(R.layout.fragment_filter, container, false);

        //add Arrow
        ((MainActivity) getActivity()).removeArrow();
        ((MainActivity) getActivity()).addArrow();

        final Button buttonColor= view.findViewById(R.id.add1);

        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (isClicked) {
                   //buttonColor.setBackgroundColor(0xFFA9A9A9);
                  // buttonColor.setBackgroundResource(R.drawable.dois);
                   //isClicked = false;
                   //


                } else {
                  //  buttonColor.setBackgroundColor(0xFFFFA500);
                   //buttonColor.setBackgroundResource(R.drawable.dois);
                    //isClicked = true;
                    //

               }
               Log.d("Entro","holA");
            }
        });
        //return inflater.inflate(R.layout.fragment_filter, container, false);
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
