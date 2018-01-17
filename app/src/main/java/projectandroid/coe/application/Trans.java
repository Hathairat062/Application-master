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

public class Trans extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    MediaPlayer mMedia;

    //ListView listView;

    private ArrayAdapter adapter;
    String[] strings = {"Train station/bus station", "driver", "bus terminals",
            "The next station is…", "mass transit", "express way",
            "special express",
            "high-speed train/high-speed rail", "highway", "all the way", "to catch/to take",
            "to take/catch a bus", "bus stop", "bus No.",
            "the next stop", " I have to change buses at the next stop.", "traffic", "traffic sign",
            "traffic light", "traffic jam", "take/catch a ferry", "coach",
            "airport", "domestic", "international", "sky/electric train",
            "underground/subway","van","truck/lorry","bicycle/bike","motorcycle/motorbike","tricycle","Tuk-Tuk","footpath/pavement",
            "pedestrian crossing/ zebra crossing","pedestrian bridge","take a short cut"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);

        listView = (ExpandableListView)findViewById(R.id.trans);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar14);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Transportation");

        //listView = (ListView) findViewById(R.id.direc);
        // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di4);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di21);
                        mMedia.start();
                        break;

                    case 21:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di22);
                        mMedia.start();
                        break;

                    case 22:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di23);
                        mMedia.start();
                        break;

                    case 23:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di24);
                        mMedia.start();
                        break;
                    case 24:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di25);
                        mMedia.start();
                        break;
                    case 25:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di26);
                        mMedia.start();
                        break;
                    case 26:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di27);
                        mMedia.start();
                        break;
                    case 27:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di28);
                        mMedia.start();
                        break;

                    case 28:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di29);
                        mMedia.start();
                        break;
                    case 29:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di30);
                        mMedia.start();
                        break;
                    case 30:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di31);
                        mMedia.start();
                        break;
                    case 31:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di32);
                        mMedia.start();
                        break;
                    case 32:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di33);
                        mMedia.start();
                        break;
                    case 33:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di34);
                        mMedia.start();
                        break;
                    case 34:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di35);
                        mMedia.start();
                        break;
                    case 35:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di36);
                        mMedia.start();
                        break;
                    case 36:
                        mMedia = MediaPlayer.create(Trans.this, R.raw.di37);
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


        listDataHeader.add("Train station/bus station");
        listDataHeader.add("driver");
        listDataHeader.add("bus terminals");
        listDataHeader.add("The next station is…");
        listDataHeader.add("mass transit");
        listDataHeader.add("express way");
        listDataHeader.add("special express");
        listDataHeader.add("high-speed train/high-speed rail");
        listDataHeader.add("highway");
        listDataHeader.add("all the way");
        listDataHeader.add("to catch/to take");
        listDataHeader.add("to take/catch a bus");
        listDataHeader.add("bus stop");
        listDataHeader.add("bus No.");
        listDataHeader.add("the next stop");
        listDataHeader.add("I have to change buses at the next stop.");
        listDataHeader.add("traffic");
        listDataHeader.add("traffic sign");
        listDataHeader.add("traffic light");
        listDataHeader.add("traffic jam");
        listDataHeader.add("take/catch a ferry");
        listDataHeader.add("coach");
        listDataHeader.add("airport");
        listDataHeader.add("domestic");
        listDataHeader.add("international");
        listDataHeader.add("sky/electric train");
        listDataHeader.add("underground/subway");
        listDataHeader.add("van");
        listDataHeader.add("truck/lorry");
        listDataHeader.add("bicycle/bike");
        listDataHeader.add("motorcycle/motorbike");
        listDataHeader.add("tricycle");
        listDataHeader.add("Tuk-Tuk");
        listDataHeader.add("footpath/pavement");
        listDataHeader.add("pedestrian crossing/ zebra crossing");
        listDataHeader.add("pedestrian bridge");
        listDataHeader.add("take a short cut");


        List<String> tr1 = new ArrayList<>();
        tr1.add("Transcription:                                sà-tăa-nee-rót-fai-sà-tăa-nee-rót-bprà-jam-taang                    " + "                 Thai word:  สถานีรถไฟ/สถานีรถประจำทาง");
        List<String> tr2 = new ArrayList<>();
        tr2.add("Transcription:  kon-kàp-rót          " + "                 Thai word:  คนขับรถ");
        List<String> tr3= new ArrayList<>();
        tr3.add("Transcription:  sà-tăa-nee-kŏn-sòng          " + "                 Thai word:  สถานีขนส่ง");
        List<String> tr4 = new ArrayList<>();
        tr4.add("Transcription:  sà-tăa-nee-dtòr-bpai-keu           " + "                 Thai word:   สถานีต่อไปคือ…");
        List<String> tr5 = new ArrayList<>();
        tr5.add("Transcription:  kŏn-sòng-muan-chon              " + "                 Thai word:  ขนส่งมวลชน");
        List<String> tr6 = new ArrayList<>();
        tr6.add("Transcription:  taang-dùan               " + "                 Thai word:  ทางด่วน");
        List<String> tr7 = new ArrayList<>();
        tr7.add("Transcription:  dùan-pí-sàyt                   " + "                 Thai word:  ด่วนพิเศษ");
        List<String> tr8 = new ArrayList<>();
        tr8.add("Transcription:  rót-fai-kwaam-reo-sŏong        " + "                 Thai word:  รถไฟความเร็วสูง");
        List<String> tr9 = new ArrayList<>();
        tr9.add("Transcription:  taang-lŭang                       " + "                 Thai word:  ทางหลวง");
        List<String> tr10 = new ArrayList<>();
        tr10.add("Transcription:  dtà-lòt-taang                  " + "                 Thai word:  ตลอดทาง");
        List<String> tr11 = new ArrayList<>();
        tr11.add("Transcription:  doi-săan                       " + "                 Thai word:  โดยสาร…");
        List<String> tr12 = new ArrayList<>();
        tr12.add("Transcription:                             kêun-rót-bprà-jam-taang-rĕu-doi-săan-rót-bprà-jam-taang                   " + "                 Thai word:  ขึ้นรถประทาง หรือ โดยสารรถประจำทาง");
        List<String> tr13 = new ArrayList<>();
        tr13.add("Transcription:  bpâai-rót-may                   " + "             Thai word: ป้ายรถเมล์");
        List<String> tr14 = new ArrayList<>();
        tr14.add("Transcription:  rót-bprà-jam-taang-săai         " + "             Thai word:  รถประจำทางสาย…");
        List<String> tr15 = new ArrayList<>();
        tr15.add("Transcription:  bpâai-tàt-bpai                  " + "             Thai word:  ป้ายถัดไป");
        List<String> tr16 = new ArrayList<>();
        tr16.add("Transcription:                             chăn-dtông-bplìan-rót-bprà-jam-taang-têe-bpâai-nâa                        " + "                 Thai word:  ฉันต้องเปลี่ยนรถประจำทางที่ป้ายหน้า");
        List<String> tr17 = new ArrayList<>();
        tr17.add("Transcription:  gaan-jà-raa-jon                    " + "                 Thai word:  การจราจร");
        List<String> tr18 = new ArrayList<>();
        tr18.add("Transcription:  krêuang-măai-jà-raa-jon     " + "                 Thai word:  เครื่องหมายจราจร");
        List<String> tr19 = new ArrayList<>();
        tr19.add("Transcription:  săn-yaan-fai-jà-raa-jon     " + "                 Thai word:  สัญญาณไฟจราจร");
        List<String> tr20 = new ArrayList<>();
        tr20.add("Transcription:                              gaan-jà-raa-jon-dtìt-kàt/rót-dtìt                                        " + "                 Thai word:  การจราจรติดขัด/รถติด");
        List<String> tr21 = new ArrayList<>();
        tr21.add("Transcription:                               nâng-reua-kâam-fâak/doi-săan-reua-kâam-fâak                             " + "                 Thai word:  นั่งเรือข้ามฟาก/โดยสารเรือข้ามฟาก");
        List<String> tr22 = new ArrayList<>();
        tr22.add("Transcription:  rót-tua                         " + "                 Thai word:  รถทัวร์");
        List<String> tr23 = new ArrayList<>();
        tr23.add("Transcription:  sà-năam-bin                     " + "                 Thai word:  สนามบิน");
        List<String> tr24 = new ArrayList<>();
        tr24.add("Transcription:  paai-nai-bprà-tâyt              " + "                 Thai word:  ภายในประเทศ");
        List<String> tr25 = new ArrayList<>();
        tr25.add("Transcription:  rá-wàang-bprà-tâyt              " + "                 Thai word:  ระหว่างประเทศ");
        List<String> tr26 = new ArrayList<>();
        tr26.add("Transcription:  rót-fai-fáa                    " + "                 Thai word:  รถไฟฟ้า");
        List<String> tr27 = new ArrayList<>();
        tr27.add("Transcription:  rót-fai-dtâi-din               " + "                 Thai word:  รถไฟใต้ดิน");
        List<String> tr28 = new ArrayList<>();
        tr28.add("Transcription:  rót-dtôo                       " + "                 Thai word:  รถตู้");
        List<String> tr29 = new ArrayList<>();
        tr29.add("Transcription:  rót-ban-túk                    " + "                 Thai word:  รถบรรทุก");
        List<String> tr30 = new ArrayList<>();
        tr30.add("Transcription:  kèe-jàk-grà-yaan               " + "                 Thai word:  ขี่จักรยาน");
        List<String> tr31 = new ArrayList<>();
        tr31.add("Transcription:  rót-jàk-grà-yaan-yon           " + "                 Thai word:  รถจักรยานยนต์");
        List<String> tr32 = new ArrayList<>();
        tr32.add("Transcription:  rót-săam-lór-tèep              " + "                 Thai word:  รถสามล้อถีบ");
        List<String> tr33 = new ArrayList<>();
        tr33.add("Transcription:  rót-dtúk-dtúk                  " + "                 Thai word:  รถตุ๊กตุ๊ก");
        List<String> tr34 = new ArrayList<>();
        tr34.add("Transcription:  taang-táo                      " + "                 Thai word:  ทางเท้า");
        List<String> tr35 = new ArrayList<>();
        tr35.add("Transcription:  taang-máa-laai                 " + "                 Thai word:  ทางม้าลาย");
        List<String> tr36 = new ArrayList<>();
        tr36.add("Transcription:  sà-paan-dern-kâam              " + "                 Thai word:  สะพานเดินข้าม");
        List<String> tr37 = new ArrayList<>();
        tr37.add("Transcription:  chái-taang-lát              " + "                 Thai word:  ใช้ทางลัด");


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
        listHash.put(listDataHeader.get(26),tr27);
        listHash.put(listDataHeader.get(27),tr28);
        listHash.put(listDataHeader.get(28),tr29);
        listHash.put(listDataHeader.get(29),tr30);
        listHash.put(listDataHeader.get(30),tr31);
        listHash.put(listDataHeader.get(31),tr32);
        listHash.put(listDataHeader.get(32),tr33);
        listHash.put(listDataHeader.get(33),tr34);
        listHash.put(listDataHeader.get(34),tr35);
        listHash.put(listDataHeader.get(35),tr36);
        listHash.put(listDataHeader.get(36),tr37);


    }
}
