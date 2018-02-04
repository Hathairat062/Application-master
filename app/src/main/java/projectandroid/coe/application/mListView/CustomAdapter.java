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

import projectandroid.coe.application.Accom;
import projectandroid.coe.application.Direction;
import projectandroid.coe.application.Emer;
import projectandroid.coe.application.General;
import projectandroid.coe.application.Greet;
import projectandroid.coe.application.Number;
import projectandroid.coe.application.Occa;
import projectandroid.coe.application.R;
import projectandroid.coe.application.Shop;
import projectandroid.coe.application.Taccom;
import projectandroid.coe.application.Tdirec;
import projectandroid.coe.application.Temer;
import projectandroid.coe.application.Tgeneral;
import projectandroid.coe.application.Tgreet;
import projectandroid.coe.application.Times;
import projectandroid.coe.application.Tnumber;
import projectandroid.coe.application.Tocca;
import projectandroid.coe.application.Trans;
import projectandroid.coe.application.Tshop;
import projectandroid.coe.application.Ttimes;
import projectandroid.coe.application.Ttrans;
import projectandroid.coe.application.mData.LearnShow;

/**
 * Created by Bow on 19/9/2560.
 */

public class CustomAdapter extends BaseAdapter  {

    Context c;
    ArrayList<LearnShow> learnShows;
    LayoutInflater inflater;
    ListView listview;
    int checkFragment;

    public CustomAdapter(Context c, ArrayList<LearnShow> learnShows,int checkFragment) {
        this.c = c;
        this.learnShows = learnShows;
        this.checkFragment = checkFragment;
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
                        if(checkFragment==1) {
                            Intent intent1 = new Intent(c, Tnumber.class);
                            c.startActivity(intent1);
                        }
                        else {
                            Intent intent = new Intent(c, Number.class);
                            c.startActivity(intent);
                        }
                        break;
                    case 1:
                        if(checkFragment==1) {
                            Intent intent3 = new Intent(c, Ttimes.class);
                            c.startActivity(intent3);
                        }
                        else {
                            Intent intent2 = new Intent(c,Times.class);
                            c.startActivity(intent2);
                        }
                        break;
                    case 2:
                        if(checkFragment==1) {
                            Intent intent5 = new Intent(c, Tgreet.class);
                            c.startActivity(intent5);
                        }
                        else {
                            Intent intent4 = new Intent(c, Greet.class);
                            c.startActivity(intent4);
                        }
                        break;
                    case 3:
                        if(checkFragment==1) {
                        Intent intent7 = new Intent(c,Tgeneral.class);
                        c.startActivity(intent7);
                        }
                        else {
                            Intent intent6 = new Intent(c, General.class);
                            c.startActivity(intent6);
                        }
                        break;
                    case 4:
                        if(checkFragment==1) {
                        Intent intent9 = new Intent(c,Tdirec.class);
                        c.startActivity(intent9);
                        }
                        else {
                            Intent intent8 = new Intent(c, Direction.class);
                            c.startActivity(intent8);
                        }
                        break;
                    case 5:
                        if(checkFragment==1) {
                            Intent intent11 = new Intent(c,Ttrans.class);
                            c.startActivity(intent11);
                        }
                        else {
                            Intent intent10 = new Intent(c, Trans.class);
                            c.startActivity(intent10);
                        }
                        break;
                    case 6:
                        if(checkFragment==1) {
                            Intent intent13 = new Intent(c,Taccom.class);
                            c.startActivity(intent13);
                        }
                        else {
                            Intent intent12 = new Intent(c, Accom.class);
                            c.startActivity(intent12);
                        }
                        break;
                    case 7:
                        if(checkFragment==1) {
                            Intent intent15 = new Intent(c,Temer.class);
                            c.startActivity(intent15);
                        }
                        else {
                            Intent intent14 = new Intent(c, Emer.class);
                            c.startActivity(intent14);
                        }
                        break;
                    case 8:
                        if(checkFragment==1) {
                            Intent intent17 = new Intent(c,Tshop.class);
                            c.startActivity(intent17);
                        }
                        else {
                            Intent intent16 = new Intent(c, Shop.class);
                            c.startActivity(intent16);
                        }
                        break;
                    case 9:
                        if(checkFragment==1) {
                            Intent intent19 = new Intent(c,Tocca.class);
                            c.startActivity(intent19);
                        }
                        else {
                            Intent intent18 = new Intent(c, Occa.class);
                            c.startActivity(intent18);
                        }
                        break;


                }

            }
        });
        return convertView;
    }

    }









