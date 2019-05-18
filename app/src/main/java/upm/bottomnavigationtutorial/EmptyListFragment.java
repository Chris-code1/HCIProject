package upm.bottomnavigationtutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmptyListFragment extends Fragment {


    public EmptyListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((MainActivity) getActivity()).removeArrow();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_empty, container, false);

        //Button creatList = view.findViewById(R.id.createList);
     //   creatList.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //  public void onClick(View view) {
          //      Toast.makeText(getActivity(), "This funcionality is not working at the moment",
            //            Toast.LENGTH_LONG).show();
            //}
        //});

        return view;
    }

}
