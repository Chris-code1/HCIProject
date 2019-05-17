package upm.bottomnavigationtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
public class RecyclerViewFragment extends Fragment {

    private static final String TAG = "RecyclerViewFragment";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("List");
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        Log.d(TAG,"onCreate: started");

        return view;
    }

    private void initImageBitmaps(){

        Log.d(TAG, "initBitmaps: preparing bitmaps");

        mImageUrls.add("https://s23209.pcdn.co/wp-content/uploads/2019/01/Instant-Pot-Rotisserie-ChickenIMG_8266.jpg");
        mNames.add("Chicken");

        mImageUrls.add("https://www.recipetineats.com/wp-content/uploads/2018/03/Oven-Baked-Chicken-Breast_8-1.jpg");
        mNames.add("Chicken1");

        mImageUrls.add("https://platedcravings.com/wp-content/uploads/2015/11/AirFryer-Chicken-Drumsticks-Plated-Cravings-6-640x960.jpg");
        mNames.add("Chicken2");

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
