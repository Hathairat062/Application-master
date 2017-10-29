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

public class Times extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Weekday", "Weekend",
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);


        listView = (ListView) findViewById(R.id.times);
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

        final Dialog dialog = new Dialog(Times.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);
        switch (position) {
            case 0:
                //Toast.makeText(this, "วันจันทร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t1);
                mMedia.start();
                textData.setText("wan-jan                     " + "                 วันจันทร์");
                break;
            case  1:
                //Toast.makeText(this, "วันอังคาร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t2);
                mMedia.start();
                textData.setText("wan-ang-kaan      " + "            วันอังคาร");
                break;
            case  2:
                //Toast.makeText(this, "วันพุธ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t3);
                mMedia.start();
                textData.setText("wan-pút                 " + "                 วันพุธ");
                break;
            case  3:
                //Toast.makeText(this, "วันพฤหัสบดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t4);
                mMedia.start();
                textData.setText("wan-pá-réu-hàt-sà-bor-dee                 " + "                     วันพฤหัสบดี");
                break;
            case  4:
                //Toast.makeText(this, "วันศุกร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t5);
                mMedia.start();
                textData.setText("wan-sùk                  " + "                  วันศุกร์");
                break;
            case  5:
                //Toast.makeText(this, "วันเสาร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t6);
                mMedia.start();
                textData.setText("wan-săo                   " + "                  วันเสาร์");
                break;
            case  6:
                //Toast.makeText(this, "วันอาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t7);
                mMedia.start();
                textData.setText("wan-aa-tít                 " + "                  วันอาทิตย์");
                break;
            case  7:
                //Toast.makeText(this, "วันทำงาน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t8);
                mMedia.start();
                textData.setText("wan-tam-ngaan                " + "                 วันทำงาน");
                break;
            case  8:
                //Toast.makeText(this, "วันเสาร์-อาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t9);
                mMedia.start();
                textData.setText("wan-săo-aa-tít               " + "                  วันเสาร์-อาทิตย์");
                break;
            case  9:
                //Toast.makeText(this, "เดือนมกราคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t10);
                mMedia.start();
                textData.setText("deuan-mók-gà-raa-kom         " + "                   เดือนมกราคม");
                break;
            case  10:
                //Toast.makeText(this, "เดือนกุมภาพันธ์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t11);
                mMedia.start();
                textData.setText("deuan-gum-paa-pan             " + "                  เดือนกุมภาพันธ์");
                break;
            case  11:
                //Toast.makeText(this, "เดือนมีนาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t12);
                mMedia.start();
                textData.setText("deuan-mee-naa-kom             " + "                   เดือนมีนาคม");
                break;
            case  12:
                //Toast.makeText(this, "เดือนเมษายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t13);
                mMedia.start();
                textData.setText("deuan-may-săa-yon              " + "                  เดือนเมษายน");
                break;
            case  13:
                //Toast.makeText(this, "เดือนพฤษภาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t14);
                mMedia.start();
                textData.setText("deuan-préut-sà-paa-kom         " + "                  เดือนพฤษภาคม");
                break;
            case  14:
                //Toast.makeText(this, "เดือนมิถุนายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t15);
                mMedia.start();
                textData.setText("deuan-mí-tù-naa-yon             " + "                  เดือนมิถุนายน");
                break;
            case  15:
                //Toast.makeText(this, "เดือนกรกฎาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t16);
                mMedia.start();
                textData.setText("deuan-gà-rá-gà-daa-kom           " + "                  เดือนกรกฎาคม");
                break;
            case  16:
                //Toast.makeText(this, "เดือนสิงหาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t17);
                mMedia.start();
                textData.setText("deuan-sĭng-hăa-kom                " + "                  เดือนสิงหาคม");
                break;
            case  17:
                //Toast.makeText(this, "เดือนกันยายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t18);
                mMedia.start();
                textData.setText("deuan-gan-yaa-yon                 " + "                  เดือนกันยายน");
                break;
            case  18:
                //Toast.makeText(this, "เดือนเดือนตุลาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t19);
                mMedia.start();
                textData.setText("deuan-dtù-laa-kom                     " + "              เดือนเดือนตุลาคม");
                break;
            case  19:
                //Toast.makeText(this, "เดือนพฤศจิกายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t20);
                mMedia.start();
                textData.setText("deuan-préut-sà-jì-gaa-yon               " + "             เดือนพฤศจิกายน");
                break;
            case  20:
                //Toast.makeText(this, "เดือนธันวาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t21);
                mMedia.start();
                textData.setText("deuan-tan-waa-kom                       " + "               เดือนธันวาคม");
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




