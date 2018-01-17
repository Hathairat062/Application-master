package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    MediaPlayer mMedia;

    //ListView listView;

    private ArrayAdapter adapter;
    String[] strings = {"I'm looking for a ...", "Hat", "Blouse",
             "Sweater", "Pants",
            "Skirt",
            "Dress", "Socks", "Shoes", "Sunglasses",
            "Eyeglasses", "Belt", "Watch",
            "Necklace", "Ring", "Bracelet", "Earrings",
            "Can I try this on?", "Where is the changing room?", "What size are you?", "I am size ...","I'd like to try it on.",
            "Do you have another size?", "I'll take this one.", "How much does it cost", "Do you accept credit cards?"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        listView = (ExpandableListView)findViewById(R.id.shop);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar15);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Shopping");


        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s4);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s21);
                        mMedia.start();
                        break;

                    case 21:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s22);
                        mMedia.start();
                        break;

                    case 22:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s23);
                        mMedia.start();
                        break;

                    case 23:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s24);
                        mMedia.start();
                        break;
                    case 24:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s25);
                        mMedia.start();
                        break;
                    case 25:
                        mMedia = MediaPlayer.create(Shop.this, R.raw.s26);
                        mMedia.start();
                        break;
                }
                return false;
            }
        });

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();


        listDataHeader.add("I'm looking for a ...");
        listDataHeader.add("Hat");
        listDataHeader.add("Blouse");
        listDataHeader.add("Sweater");
        listDataHeader.add("Pants");
        listDataHeader.add("Skirt");
        listDataHeader.add("Dress");
        listDataHeader.add("Socks");
        listDataHeader.add("Shoes");
        listDataHeader.add("Sunglasses");
        listDataHeader.add("Eyeglasses");
        listDataHeader.add("Belt");
        listDataHeader.add("Watch");
        listDataHeader.add("Necklace");
        listDataHeader.add("Ring");
        listDataHeader.add("Bracelet");
        listDataHeader.add("Earrings");
        listDataHeader.add("Can I try this on?");
        listDataHeader.add("Where is the changing room?");
        listDataHeader.add("What size are you?");
        listDataHeader.add("I am size ...");
        listDataHeader.add("I'd like to try it on.");
        listDataHeader.add("Do you have another size?");
        listDataHeader.add("I'll take this one.");
        listDataHeader.add("How much does it cost?");
        listDataHeader.add("Do you accept credit cards?");

        List<String> tr1 = new ArrayList<>();
        tr1.add("Transcription: chăn-gam-lang-hăa                " + "                 Thai word:  ฉันกำลังหา...");
        List<String> tr2 = new ArrayList<>();
        tr2.add("Transcription: mùak                             " + "                 Thai word:  หมวก");
        List<String> tr3= new ArrayList<>();
        tr3.add("Transcription: sêua-pôo-yĭng                    " + "                 Thai word:  เสื้อผู้หญิง");
        List<String> tr4 = new ArrayList<>();
        tr4.add("Transcription: sêua-gan-năao                    " + "                 Thai word:   เสื้อกันหนาว");
        List<String> tr5 = new ArrayList<>();
        tr5.add("Transcription: gaang-gayng                      " + "                 Thai word:  กางเกง");
        List<String> tr6 = new ArrayList<>();
        tr6.add("Transcription: grà-bprohng                      " + "                 Thai word:  กระโปรง");
        List<String> tr7 = new ArrayList<>();
        tr7.add("Transcription: chút-grà-bprohng                   " + "                 Thai word:  ชุดกระโปรง");
        List<String> tr8 = new ArrayList<>();
        tr8.add("Transcription: tŭng-táo                         " + "                 Thai word:  ถุงเท้า");
        List<String> tr9 = new ArrayList<>();
        tr9.add("Transcription: rong-táo                         " + "                 Thai word:  รองเท้า");
        List<String> tr10 = new ArrayList<>();
        tr10.add("Transcription: wâen-gan-dàet                       " + "              Thai word:  แว่นกันแดด");
        List<String> tr11 = new ArrayList<>();
        tr11.add("Transcription: wâen-săai-dtaa                   " + "                 Thai word:  แว่นสายตา");
        List<String> tr12 = new ArrayList<>();
        tr12.add("Transcription: kĕm-kàt                          " + "                 Thai word: เข็มขัด");
        List<String> tr13 = new ArrayList<>();
        tr13.add("Transcription: naa-lí-gaa                       " + "                 Thai word:  นาฬิกา");
        List<String> tr14 = new ArrayList<>();
        tr14.add("Transcription: sôi-kor                         " + "                Thai word:  สร้อยคอ");
        List<String> tr15 = new ArrayList<>();
        tr15.add("Transcription: hăe won                          " + "                 Thai word:  แหวน");
        List<String> tr16 = new ArrayList<>();
        tr16.add("Transcription: sôi-kôr-meu/gam-lai-kôr-meu      " + "                 Thai word:  สร้อยข้อมือ/กำไลข้อมือ");
        List<String> tr17 = new ArrayList<>();
        tr17.add("Transcription: dtàang-hŏo                       " + "                 Thai word:  ต่างหู");
        List<String> tr18 = new ArrayList<>();
        tr18.add("Transcription: chăn-kŏng-long-sài-dâi-măi      " + "                 Thai word:  ฉันขอลองใส่ได้ไหม");
        List<String> tr19 = new ArrayList<>();
        tr19.add("Transcription: hông-long-sêua-yòo-têe-năi      " + "                 Thai word:  ห้องลองเสื้ออยู่ที่ไหน");
        List<String> tr20 = new ArrayList<>();
        tr20.add("Transcription: kun-sài-sai-à-rai               " + "                 Thai word:  คุณใส่ไซส์อะไร");
        List<String> tr21 = new ArrayList<>();
        tr21.add("Transcription: chăn-sài-sai                    " + "                 Thai word:  ฉันใส่ไซส์...");
        List<String> tr22 = new ArrayList<>();
        tr22.add("Transcription: chăn-yàak-jà-long-sài          " + "                 Thai word:  ฉันอยากจะลองใส่");
        List<String> tr23 = new ArrayList<>();
        tr23.add("Transcription: chăn-mee-sai-èun-măi           " + "                 Thai word:  คุณมีไซส์อื่นไหม");
        List<String> tr24 = new ArrayList<>();
        tr24.add("Transcription: chăn-jà-séu-an-née              " + "                 Thai word:  ฉันจะซื้ออันนี้");
        List<String> tr25 = new ArrayList<>();
        tr25.add("Transcription: raa-kaa-tâo-rai                 " + "                 Thai word:  ราคาเท่าไร");
        List<String> tr26 = new ArrayList<>();
        tr26.add("Transcription: kun-ráp-bàt-kray-dìt-măi        " + "                 Thai word:  คุณรับบัตรเครดิตไหม");




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
        listHash.put(listDataHeader.get(21),tr22);
        listHash.put(listDataHeader.get(22),tr23);
        listHash.put(listDataHeader.get(23),tr24);
        listHash.put(listDataHeader.get(24),tr25);
        listHash.put(listDataHeader.get(25),tr26);

    }
    }

