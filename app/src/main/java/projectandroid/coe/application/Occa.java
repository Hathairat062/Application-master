package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Occa extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    MediaPlayer mMedia;

    //ListView listView;

    private ArrayAdapter adapter;
    String[] strings = {"How is the weather?", "It's raining.", "It's sunny.",
            "It's snowing.", "It's stormy.",
            "It's foggy.",
            "It's cloudy.", "It's nice day.", "There's a storm coming", "It's bad weather.",
            "It look like it will rain soon.", "It's freezing cold", "It's freezing cold",
            "It is hot.", "It's warm outside.", "What's the temperature?", "It's ... degrees now.",
            "Spring", "Summer", "Autumn", "Winter","I love summer."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occa);

        listView = (ExpandableListView)findViewById(R.id.oc);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar16);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Weather");
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);



        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w4);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Occa.this, R.raw.w21);
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


        listDataHeader.add("How is the weather?");
        listDataHeader.add("It's raining.");
        listDataHeader.add("It's sunny.");
        listDataHeader.add("It's snowing.");
        listDataHeader.add("It's stormy.");
        listDataHeader.add("It's foggy.");
        listDataHeader.add("It's cloudy.");
        listDataHeader.add("It's nice day.");
        listDataHeader.add("There's a storm coming");
        listDataHeader.add("It's bad weather.");
        listDataHeader.add("It look like it will rain soon.");
        listDataHeader.add("It's freezing cold");
        listDataHeader.add("It is hot.");
        listDataHeader.add("It's warm outside.");
        listDataHeader.add("What's the temperature?");
        listDataHeader.add("It's ... degrees now.");
        listDataHeader.add("Spring");
        listDataHeader.add("Summer");
        listDataHeader.add("Autumn");
        listDataHeader.add("Winter");
        listDataHeader.add("I love summer.");


        List<String> tr1 = new ArrayList<>();
        tr1.add("Transcription: aa-gàat-bpen-yàang-rai-bâang                " + "                                    Thai word: อากาศเป็นอย่างไรบ้าง");
        List<String> tr2 = new ArrayList<>();
        tr2.add("Transcription: fŏn-dtòk/fŏn-gam-lang-dtòk                  " + "                                    Thai word: ฝนตก/ฝนกำลังตก");
        List<String> tr3= new ArrayList<>();
        tr3.add("Transcription: dàet-òk                        " + "                 Thai word:  แดดออก");
        List<String> tr4 = new ArrayList<>();
        tr4.add("Transcription: hì-má-dtòk/hì-má-gam-lang-dtòk              " + "                 Thai word: หิมะตก/หิมะกำลังตก");
        List<String> tr5 = new ArrayList<>();
        tr5.add("Transcription: mee-paa-yú                      " + "                 Thai word: มีพายุ");
        List<String> tr6 = new ArrayList<>();
        tr6.add("Transcription: mee-mòk/mòk-long                " + "                 Thai word: มีหมอก/หมอกลง");
        List<String> tr7 = new ArrayList<>();
        tr7.add("Transcription: bpòk-klum-dûay-mâyk/eum-kreum               " + "                 Thai word: ปกคลุมด้วยเมฆ/อึมครึม");
        List<String> tr8 = new ArrayList<>();
        tr8.add("Transcription: aa-gàat-dee/tóng-fáa-jàem-săi               " + "                 Thai word: อากาศดี/ท้องฟ้าแจ่มใส");
        List<String> tr9 = new ArrayList<>();
        tr9.add("Transcription: paa-yú-gam-lang-jà-kâo                       " + "                                      Thai word: พายุกำลังจะเข้า");
        List<String> tr10 = new ArrayList<>();
        tr10.add("Transcription: aa-gàat-mâi-dee                       " + "              Thai word: อากาศไม่ดี");
        List<String> tr11 = new ArrayList<>();
        tr11.add("Transcription: doo-mĕuan-fŏn-gam-lang-jà-dtòk-reo-reo-née                                        " + "                 Thai word: ดูเหมือนฝนกำลังจะตกเร็วๆนี้");
        List<String> tr12 = new ArrayList<>();
        tr12.add("Transcription: aa-gàat-yen-yá-yêuak                         " + "                                     Thai word: อากาศเย็นยะเยือก");
        List<String> tr13 = new ArrayList<>();
        tr13.add("Transcription: aa-gàat-rón                       " + "                 Thai word: อากาศร้อน");
        List<String> tr14 = new ArrayList<>();
        tr14.add("Transcription: kâang-nôk-aa-gàat-òp-ùn                       " + "                                    Thai word: ข้างนอกอากาศอบอุ่น");
        List<String> tr15 = new ArrayList<>();
        tr15.add("Transcription: un-hà-poom-tâo-rài                " + "                 Thai word: อุณหภูมิเท่าไหร่");
        List<String> tr16 = new ArrayList<>();
        tr16.add("Transcription: dton-née-...ong-săa               " + "                 Thai word: ตอนนี้ ... องศา");
        List<String> tr17 = new ArrayList<>();
        tr17.add("Transcription: réu-doo-bai-mái-plì                " + "                 Thai word:  ฤดูใบไม้ผลิ");
        List<String> tr18 = new ArrayList<>();
        tr18.add("Transcription: réu-doo-rón                        " + "                 Thai word:  ฤดูร้อน");
        List<String> tr19 = new ArrayList<>();
        tr19.add("Transcription: réu-doo-bai-mái-rûang                         " + "                                    Thai word:  ฤดูใบไม้ร่วง");
        List<String> tr20 = new ArrayList<>();
        tr20.add("Transcription: réu-doo-năao                        " + "                 Thai word:  ฤดูหนาว");
        List<String> tr21 = new ArrayList<>();
        tr21.add("Transcription: chăn-chôp-réu-doo-rón                         " + "                                    Thai word:  ฉันชอบฤดูร้อน");




        listHash.put(listDataHeader.get(0),tr1);
        listHash.put(listDataHeader.get(1),tr2);
        listHash.put(listDataHeader.get(2),tr3);
        listHash.put(listDataHeader.get(3),tr4);
        listHash.put(listDataHeader.get(4),tr5);
        listHash.put(listDataHeader.get(5),tr6);
        listHash.put(listDataHeader.get(6),tr7);
        listHash.put(listDataHeader.get(7),tr8);
        listHash.put(listDataHeader.get(8),tr9);
        listHash.put(listDataHeader.get(9),tr10);
        listHash.put(listDataHeader.get(10),tr11);
        listHash.put(listDataHeader.get(11),tr12);
        listHash.put(listDataHeader.get(12),tr13);
        listHash.put(listDataHeader.get(13),tr14);
        listHash.put(listDataHeader.get(14),tr15);
        listHash.put(listDataHeader.get(15),tr16);
        listHash.put(listDataHeader.get(16),tr17);
        listHash.put(listDataHeader.get(17),tr18);
        listHash.put(listDataHeader.get(18),tr19);
        listHash.put(listDataHeader.get(19),tr20);
        listHash.put(listDataHeader.get(20),tr21);


    }
}
