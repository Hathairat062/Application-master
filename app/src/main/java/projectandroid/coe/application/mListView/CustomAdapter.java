package projectandroid.coe.application.mListView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import projectandroid.coe.application.Direction;
import projectandroid.coe.application.General;
import projectandroid.coe.application.Greet;
import projectandroid.coe.application.Number;
import projectandroid.coe.application.R;
import projectandroid.coe.application.Tdirec;
import projectandroid.coe.application.Tgeneral;
import projectandroid.coe.application.Tgreet;
import projectandroid.coe.application.Times;
import projectandroid.coe.application.Tnumber;
import projectandroid.coe.application.Ttimes;
import projectandroid.coe.application.mData.LearnShow;

/**
 * Created by Bow on 19/9/2560.
 */

public class CustomAdapter extends BaseAdapter  {

    Context c;
    ArrayList<LearnShow> learnShows;
    LayoutInflater inflater;
    ListView listview;

    public CustomAdapter(Context c, ArrayList<LearnShow> learnShows) {
        this.c = c;
        this.learnShows = learnShows;
    }

    @Override
    public int getCount() {
        return learnShows.size();
    }


    @Override
    public Object getItem(int position) {
        return learnShows.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (inflater == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.model, parent, false);

        }

        final TextView nameTxt = (TextView) convertView.findViewById(R.id.nameTxt);
        ImageView img = (ImageView) convertView.findViewById(R.id.learnImage);

        final String name = learnShows.get(position).getName();
        int image = learnShows.get(position).getImage();

        nameTxt.setText(name);
        img.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(c, name, Toast.LENGTH_SHORT).show();*/
                switch (position){
                    case 0:
                        Intent intent1 = new Intent(c,Tnumber.class);
                        c.startActivity(intent1);
                        Intent intent = new Intent(c,Number.class);
                        c.startActivity(intent);
                        break;
                    case 1:
                        Intent intent3 = new Intent(c, Ttimes.class);
                        c.startActivity(intent3);
                        Intent intent2 = new Intent(c,Times.class);
                        c.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent5 = new Intent(c, Tgreet.class);
                        c.startActivity(intent5);
                        Intent intent4 = new Intent(c,Greet.class);
                        c.startActivity(intent4);
                        break;
                    case 3:
                        Intent intent7 = new Intent(c,Tgeneral.class);
                        c.startActivity(intent7);
                        Intent intent6 = new Intent(c,General.class);
                        c.startActivity(intent6);
                        break;
                    case 4:
                        Intent intent9 = new Intent(c,Tdirec.class);
                        c.startActivity(intent9);
                        Intent intent8 = new Intent(c,Direction.class);
                        c.startActivity(intent8);
                        break;


                }

            }
        });
        return convertView;
    }



    }









