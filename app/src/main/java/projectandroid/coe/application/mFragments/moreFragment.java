package projectandroid.coe.application.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import projectandroid.coe.application.R;
import projectandroid.coe.application.mData.LearnShow;
import projectandroid.coe.application.mListView.CustomAdapter;

/**
 * Created by Bow on 19/9/2560.
 */

public class moreFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.more_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.moreListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getmore(),3);

        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<LearnShow> getmore() {
        ArrayList<LearnShow> learn = new ArrayList<>();

        LearnShow learnShow = new LearnShow("Similar pronunciation", R.drawable.num);

        learn.add(learnShow);

        learnShow = new LearnShow("Times and Date", R.drawable.time);
        learn.add(learnShow);

        learnShow = new LearnShow("Greeting", R.drawable.greet);
        learn.add(learnShow);


        return learn;
    }

    @Override
    public String toString() {
        return "MORE";
    }
}
