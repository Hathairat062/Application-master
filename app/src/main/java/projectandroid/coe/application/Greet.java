package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Greet extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    //ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"What's your name?", "My name is...", "Where do you com from?", "I come from...(country).",
            "How old are you?", "I'm 22 years old.", "Where are you study?", "I study at...", "Nice to meet you.",
            "I'm a college student.", "Keep in touch!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);

        listView = (ExpandableListView)findViewById(R.id.greet);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Greeting");

        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);




        //listView = (ListView) findViewById(R.id.greet);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g4);
                        mMedia.start();
                        break;
                    case 4:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g5);
                        mMedia.start();
                        break;
                    case 5:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g8);
                        mMedia.start();
                        break;
                    case 8:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g9);
                        mMedia.start();
                        break;
                    case 9:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g10);
                        mMedia.start();
                        break;
                    case 10:
                        mMedia = MediaPlayer.create(Greet.this, R.raw.g11);
                        mMedia.start();
                        break;

            }
                mMedia.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    };
                });
                return false;
            }
        });

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("What's your name?");
        listDataHeader.add("My name is...");
        listDataHeader.add("Where do you com from?");
        listDataHeader.add("I come from...(country).");
        listDataHeader.add("How old are you?");
        listDataHeader.add("I'm 22 years old.");
        listDataHeader.add("Where are you study?");
        listDataHeader.add("I study at...");
        listDataHeader.add("Nice to meet you.");
        listDataHeader.add("I'm a college student.");
        listDataHeader.add("Keep in touch!");


        List<String> gr1 = new ArrayList<>();
        gr1.add("Transcription:    kun-chêu-à-rai            " + "               Thai word:   คุณชื่ออะไร");
        List<String> gr2 = new ArrayList<>();
        gr2.add("Transcription:    chăn-chêu                 " + "               Thai word:   ฉันชื่อ...");
        List<String> gr3= new ArrayList<>();
        gr3.add("Transcription:    kun-maa-jàak-têe-năi      " + "                                                   Thai word:   คุณมาจากที่ไหน");
        List<String> gr4 = new ArrayList<>();
        gr4.add("Transcription:    chăn-maa-jàak-bprà-tâyt      " + "                                                 Thai word:   ฉันมาจากประเทศ...");
        List<String> gr5 = new ArrayList<>();
        gr5.add("Transcription:    kun-aa-yú-tâo-rai         " + "               Thai word:   คุณอายุเท่าไร");
        List<String> gr6 = new ArrayList<>();
        gr6.add("Transcription:    chăn-aa-yú-22-bpee        " + "               Thai word:   ฉันอายุ 22 ปี");
        List<String> gr7 = new ArrayList<>();
        gr7.add("Transcription:    kun-rian-yòo-têe-năi      " + "                                                     Thai word:   คุณเรียนอยู่ที่ไหน");
        List<String> gr8 = new ArrayList<>();
        gr8.add("Transcription:    chăn-rian-yòo-têe         " + "               Thai word:   ฉันเรียนอยู่ที่...");
        List<String> gr9 = new ArrayList<>();
        gr9.add("Transcription:    yin-dee-têe-dâi-róo-jàk   " + "                                                      Thai word:   ยินดีที่ได้รู้จัก");
        List<String> gr10 = new ArrayList<>();
        gr10.add("Transcription:   chăn-bpen-nák-sèuk-săa    " + "                                                       Thai word:   ฉันเป็นนักศึกษา");
        List<String> gr11 = new ArrayList<>();
        gr11.add("Transcription:   dtìt-dtòr-gan-èek-ná       " + "                                                       Thai word:   ติดต่อกันอีกนะ");


        listHash.put(listDataHeader.get(0),gr1);
        listHash.put(listDataHeader.get(1),gr2);
        listHash.put(listDataHeader.get(2),gr3);
        listHash.put(listDataHeader.get(3),gr4);
        listHash.put(listDataHeader.get(4),gr5);
        listHash.put(listDataHeader.get(5),gr6);
        listHash.put(listDataHeader.get(6),gr7);
        listHash.put(listDataHeader.get(7),gr8);
        listHash.put(listDataHeader.get(8),gr9);
        listHash.put(listDataHeader.get(9),gr10);
        listHash.put(listDataHeader.get(10),gr11);
    }

    /*@Override
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
                textData.setText("Translate:                             kun-chêu-à-rai                       " + "               Thai word:                             คุณชื่ออะไร");
                break;
            case 1:
                //Toast.makeText(this, "ฉันชื่อ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g2);
                mMedia.start();
                textData.setText("Translate:                             chăn-chêu                      " + "               Thai word:                                   ฉันชื่อ...");
                break;
            case 2:
                //Toast.makeText(this, "คุณมาจากที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g3);
                mMedia.start();
                textData.setText("Translate:                             kun-maa-jàak-têe-năi                     " + "               Thai word:                        คุณมาจากที่ไหน");
                break;
            case 3:
                //Toast.makeText(this, "ฉันมาจากประเทศ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g4);
                mMedia.start();
                textData.setText("Translate:                            chăn-maa-jàak-bprà-tâyt                      " + "               Thai word:                             ฉันมาจากประเทศ...");
                break;
            case 4:
                //Toast.makeText(this, "คุณอายุเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g5);
                mMedia.start();
                textData.setText("Translate:                            kun-aa-yú-tâo-rai                       " + "               Thai word:                                 คุณอายุเท่าไร");
                break;
            case 5:
                //Toast.makeText(this, "ฉันอายุ 22 ปี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g6);
                mMedia.start();
                textData.setText("Translate:                             chăn-aa-yú-22-bpee                       " + "               Thai word:                             ฉันอายุ 22 ปี");
                break;
            case 6:
                //Toast.makeText(this, "คุณเรียนอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g7);
                mMedia.start();
                textData.setText("Translate:                             kun-rian-yòo-têe-năi                       " + "               Thai word:                                       คุณเรียนอยู่ที่ไหน");
                break;
            case 7:
                //Toast.makeText(this, "ฉันเรียนอยู่ที่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g8);
                mMedia.start();
                textData.setText("Translate:                              chăn-rian-yòo-têe                     " + "                  Thai word:                                        ฉันเรียนอยู่ที่...");
                break;
            case 8:
                //Toast.makeText(this, "ยินดีที่ได้รู้จัก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g9);
                mMedia.start();
                textData.setText("Translate:                              yin-dee-têe-dâi-róo-jàk                     " + "               Thai word:                                        ยินดีที่ได้รู้จัก");
                break;
            case 9:
                //Toast.makeText(this, "ฉันเป็นนักศึกษา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g10);
                mMedia.start();
                textData.setText("Translate:                                chăn-bpen-nák-sèuk-săa                       " + "               Thai word:                                       ฉันเป็นนักศึกษา");
                break;
            case 10:
                //Toast.makeText(this, "ติดต่อกันอีกนะ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g11);
                mMedia.start();
                textData.setText("Translate:                                 dtìt-dtòr-gan-èek-ná                       " + "               Thai word:                                        ติดต่อกันอีกนะ");
                break;


        }
        Button buttonOK =
                (Button)dialog.findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();*/


    }

