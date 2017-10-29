package projectandroid.coe.application;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Number extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {
            "one", "two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        listView = (ListView) findViewById(R.id.num);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }

        final Dialog dialog = new Dialog(Number.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);

        switch (position) {
            case 0:
                /*Toast.makeText(this, "หนึง", Toast.LENGTH_LONG).show();*/
                mMedia = MediaPlayer.create(Number.this, R.raw.n1);
                mMedia.start();
                textData.setText("nèung   " + "หนึ่ง");
                break;
            case  1:
                /*Toast.makeText(this, "สอง", Toast.LENGTH_LONG).show();*/
                mMedia = MediaPlayer.create(Number.this, R.raw.n2);
                mMedia.start();
                textData.setText("sŏng    " + "สอง");
                break;
            case  2:
                /*Toast.makeText(this, "สาม", Toast.LENGTH_LONG).show();*/
                mMedia = MediaPlayer.create(Number.this, R.raw.n3);
                mMedia.start();
                textData.setText("săam    " + "สาม");
                break;
            case  3:
                //Toast.makeText(this, "สี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n4);
                mMedia.start();
                textData.setText("sèe    " + "สี่");
                break;
            case  4:
                //Toast.makeText(this, "ห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n5);
                mMedia.start();
                textData.setText("hâa    " + "ห้า");
                break;
            case  5:
                //Toast.makeText(this, "หก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n6);
                mMedia.start();
                textData.setText("hòk    " + "หก");
                break;
            case  6:
                //Toast.makeText(this, "เจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n7);
                mMedia.start();
                textData.setText("jèt    " + "เจ็ด");
                break;
            case  7:
                //Toast.makeText(this, "เแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n8);
                mMedia.start();
                textData.setText("bpàet   " + "แปด");
                break;
            case  8:
                //Toast.makeText(this, "เก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n9);
                mMedia.start();
                textData.setText("gâo     " + "เก้า");
                break;
            case  9:
                //Toast.makeText(this, "สิบ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n10);
                mMedia.start();
                textData.setText("sìp     " + "สิบ");
                break;
            case  10:
                //Toast.makeText(this, "สิบเอ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n11);
                mMedia.start();
                textData.setText("sìp èt   " + "สิบเอ็ด");
                break;
            case  11:
                //Toast.makeText(this, "สิบสอง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n12);
                mMedia.start();
                textData.setText("sìp sŏng  " + "สิบสอง");
                break;
            case  12:
                //Toast.makeText(this, "สิบสาม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n13);
                mMedia.start();
                textData.setText("sìp săam   " + "สิบสาม");
                break;
            case  13:
                //Toast.makeText(this, "สิบสี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n14);
                mMedia.start();
                textData.setText("sìp sèe    " + "สิบสี่");
                break;
            case  14:
                //Toast.makeText(this, "สิบห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n15);
                mMedia.start();
                textData.setText("sìp hâa    " + "สิบห้า");
                break;
            case  15:
                //Toast.makeText(this, "สิบหก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n16);
                mMedia.start();
                textData.setText("sìp hòk     " + "สิบหก");
                break;
            case  16:
                //Toast.makeText(this, "สิบเจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n17);
                mMedia.start();
                textData.setText("sìp jèt     " + "สิบเจ็ด");
                break;
            case  17:
                //Toast.makeText(this, "สิบแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n18);
                mMedia.start();
                textData.setText("sìp bpàet    " + "สิบแปด");
                break;
            case  18:
                //Toast.makeText(this, "สิบเก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n19);
                mMedia.start();
                textData.setText("sìp gâo      " + "สิบเก้า");
                break;
            case  19:
                //Toast.makeText(this, "ยี่สิบ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n20);
                mMedia.start();
                textData.setText("yêe sìp      " + "ยี่สิบ");
                break;

        }
        Button buttonOK =
                (Button)dialog.findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

}









