package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import projectandroid.coe.application.mFragments.MyPagerAdapter;
import projectandroid.coe.application.mFragments.learnFragment;
import projectandroid.coe.application.mFragments.moreFragment;
import projectandroid.coe.application.mFragments.testFragment;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    ViewPager vp;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        toolbar.setTitle("Learn Thai");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //ViewPager
        vp= (ViewPager) findViewById(R.id.mViewPager_ID);
        this.addPage();

        //TabLayout
        tabLayout= (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);

    }

    private void addPage()
    {
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(this.getSupportFragmentManager());
        pagerAdapter.addFragment(new learnFragment());
        pagerAdapter.addFragment(new testFragment());
        pagerAdapter.addFragment(new moreFragment());

        //set adapter to vp
        vp.setAdapter(pagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());

    }


    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }


    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builber = new AlertDialog.Builder(this);
        builber.setTitle("Exit");
        builber.setMessage("Do you exit program");
        builber.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builber.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builber.setCancelable(false);
        builber.show();
    }
}
