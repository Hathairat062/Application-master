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

public class testFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.test_fragment, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.testListView);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(), gettest(), 1);

        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<LearnShow> gettest() {
        ArrayList<LearnShow> learn = new ArrayList<>();

        LearnShow learnShow = new LearnShow("Number", R.drawable.n);
        learn.add(learnShow);

        learnShow = new LearnShow("Times and Date", R.drawable.r);
        learn.add(learnShow);

        learnShow = new LearnShow("Greeting", R.drawable.or);
        learn.add(learnShow);

        learnShow = new LearnShow("General Conversation", R.drawable.y);
        learn.add(learnShow);

        learnShow = new LearnShow("Direction and Place", R.drawable.t);
        learn.add(learnShow);

        learnShow = new LearnShow("Transportation", R.drawable.t);
        learn.add(learnShow);

        learnShow = new LearnShow("Accommodation", R.drawable.a);
        learn.add(learnShow);

        learnShow = new LearnShow("Emergency", R.drawable.e);
        learn.add(learnShow);

        learnShow = new LearnShow("Shopping", R.drawable.s);
        learn.add(learnShow);

        learnShow = new LearnShow("Weather", R.drawable.w);
        learn.add(learnShow);

        return learn;
    }

    @Override
    public String toString() {
        return "TEST";
    }
}
