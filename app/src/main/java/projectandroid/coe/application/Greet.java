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

public class Greet extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"What's your name?", "My name is...", "Where do you com from?", "I come from...(country).",
            "How old are you?", "I'm 22 years old.", "Where are you study?", "I study at...", "Nice to meet you.",
            "I'm a college student.", "Keep in touch!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);


        listView = (ListView) findViewById(R.id.greet);
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

        final Dialog dialog = new Dialog(Greet.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);

        switch (position) {
            case 0:
                //Toast.makeText(this, "คุณชื่ออะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g1);
                mMedia.start();
                textData.setText("kun-chêu-à-rai                       " + "               คุณชื่ออะไร");
                break;
            case 1:
                //Toast.makeText(this, "ฉันชื่อ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g2);
                mMedia.start();
                textData.setText("chăn-chêu                      " + "               ฉันชื่อ...");
                break;
            case 2:
                //Toast.makeText(this, "คุณมาจากที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g3);
                mMedia.start();
                textData.setText("kun-maa-jàak-têe-năi                     " + "               คุณมาจากที่ไหน");
                break;
            case 3:
                //Toast.makeText(this, "ฉันมาจากประเทศ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g4);
                mMedia.start();
                textData.setText("chăn-maa-jàak-bprà-tâyt                      " + "               ฉันมาจากประเทศ...");
                break;
            case 4:
                //Toast.makeText(this, "คุณอายุเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g5);
                mMedia.start();
                textData.setText("kun-aa-yú-tâo-rai                       " + "               คุณอายุเท่าไร");
                break;
            case 5:
                //Toast.makeText(this, "ฉันอายุ 22 ปี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g6);
                mMedia.start();
                textData.setText("chăn-aa-yú-22-bpee                       " + "               ฉันอายุ 22 ปี");
                break;
            case 6:
                //Toast.makeText(this, "คุณเรียนอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g7);
                mMedia.start();
                textData.setText("kun-rian-yòo-têe-năi                       " + "               คุณเรียนอยู่ที่ไหน");
                break;
            case 7:
                //Toast.makeText(this, "ฉันเรียนอยู่ที่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g8);
                mMedia.start();
                textData.setText("chăn-rian-yòo-têe                     " + "               ฉันเรียนอยู่ที่...");
                break;
            case 8:
                //Toast.makeText(this, "ยินดีที่ได้รู้จัก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g9);
                mMedia.start();
                textData.setText("yin-dee-têe-dâi-róo-jàk                     " + "               ยินดีที่ได้รู้จัก");
                break;
            case 9:
                //Toast.makeText(this, "ฉันเป็นนักศึกษา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g10);
                mMedia.start();
                textData.setText("chăn-bpen-nák-sèuk-săa                       " + "               ฉันเป็นนักศึกษา");
                break;
            case 10:
                //Toast.makeText(this, "ติดต่อกันอีกนะ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g11);
                mMedia.start();
                textData.setText("dtìt-dtòr-gan-èek-ná                       " + "               ติดต่อกันอีกนะ");
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
