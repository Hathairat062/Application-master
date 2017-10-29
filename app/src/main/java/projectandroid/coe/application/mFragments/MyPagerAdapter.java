package projectandroid.coe.application.mFragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Bow on 19/9/2560.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<>();


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }


    @Override
    public int getCount() {
        return fragments.size();
    }

    //Add Page
    public void addFragment(Fragment f){

        fragments.add(f);

    }

    //set title


    @Override
    public CharSequence getPageTitle(int position) {
        String title=fragments.get(position).toString();

        return title.toString();
    }
}

