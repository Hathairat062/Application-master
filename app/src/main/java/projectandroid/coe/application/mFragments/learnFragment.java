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

public class learnFragment extends Fragment  {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.learn_fragment, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.learnListView);

        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getlearning());

        lv.setAdapter(adapter);

        return rootView;


    }

    private ArrayList<LearnShow> getlearning() {
        ArrayList<LearnShow> learn = new ArrayList<>();

        LearnShow learnShow = new LearnShow("Number", R.drawable.num);
        learn.add(learnShow);

        learnShow = new LearnShow("Times and Date", R.drawable.time);
        learn.add(learnShow);

        learnShow = new LearnShow("Greeting", R.drawable.greet);
        learn.add(learnShow);

        learnShow = new LearnShow("General Conversation", R.drawable.c);
        learn.add(learnShow);

        learnShow = new LearnShow("Direction and Place", R.drawable.direc);
        learn.add(learnShow);

        learnShow = new LearnShow("Transportation", R.drawable.places);
        learn.add(learnShow);

        learnShow = new LearnShow("Accommodation", R.drawable.accom);
        learn.add(learnShow);

        learnShow = new LearnShow("Emergency", R.drawable.emer);
        learn.add(learnShow);

        learnShow = new LearnShow("Shopping", R.drawable.shop);
        learn.add(learnShow);

        learnShow = new LearnShow("Occasion Phrases", R.drawable.occa);
        learn.add(learnShow);

        return learn;
    }


    @Override
    public String toString() {
        String title = "LEARNING";
        return title;
    }




    }



