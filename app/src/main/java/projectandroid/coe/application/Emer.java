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

public class Emer extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;
    MediaPlayer mMedia;

    //ListView listView;
    private ArrayAdapter adapter;
    String[] strings = {"Help!", "Can you help me?", "I lost my wallet.",
            "My bag got stolen.",
            "I lost my passport.", "I want to go to the embassy.",
            "I have some trouble.", "็I want a translator.", "I want to go to the police office.",
            "I don't have money.", "Fire!",
            "Someone needs help.",
            "I missed my flight.", "My luggage is lost.", "I lost my phone.", "I lost the key.",
            "Please come as soon as possible.", "Is there a gas station around here?", "Please call the fire department.",
            "I need a doctor.", "Does anyone here speak English?"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emer);

        listView = (ExpandableListView) findViewById(R.id.emergency);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar13);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Emergency");

        //listView = (ListView) findViewById(R.id.direc);
        // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em11);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em4);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Emer.this, R.raw.em21);
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


        listDataHeader.add("Help!");
        listDataHeader.add("Can you help me?");
        listDataHeader.add("I lost my wallet.");
        listDataHeader.add("My bag got stolen.");
        listDataHeader.add("I lost my passport.");
        listDataHeader.add("I want to go to the embassy.");
        listDataHeader.add("I have some trouble.");
        listDataHeader.add("I want a translator.");
        listDataHeader.add("I want to go to the police office.");
        listDataHeader.add("I don't have money.");
        listDataHeader.add("Fire!");
        listDataHeader.add("Someone needs help.");
        listDataHeader.add("I missed my flight.");
        listDataHeader.add("My luggage is lost.");
        listDataHeader.add("I lost my phone.");
        listDataHeader.add("I lost the key.");
        listDataHeader.add("Please come as soon as possible.");
        listDataHeader.add("Is there a gas station around here?");
        listDataHeader.add("Please call the fire department.");
        listDataHeader.add("I need a doctor.");
        listDataHeader.add("Does anyone here speak English?");



        List<String> em1 = new ArrayList<>();
        em1.add("Transcription:  chûay-dûay                 " + "               Thai word:  ช่วยด้วย");
        List<String> em2 = new ArrayList<>();
        em2.add("Transcription:  chûay-chăn-nòi-dâi-măi     " + "               Thai word:  ช่วยฉันหน่อยได้ไหม");
        List<String> em3 = new ArrayList<>();
        em3.add("Transcription:  chăn-tam-grà-bpăo-ngern-hăai      " + "        Thai word:  ฉันทำกระเป๋าเงินหาย");
        List<String> em4 = new ArrayList<>();
        em4.add("Transcription:  grà-bpăo-kŏng-chăn-tòok-kà-moi    " + "        Thai word:  กระเป๋าของฉันถูกขโมย");
        List<String> em5 = new ArrayList<>();
        em5.add("Transcription:  chăn-tam-paa-sà-bpòt-hăai         " + "        Thai word:  ฉันทำพาสปอร์ตหาย");
        List<String> em6 = new ArrayList<>();
        em6.add("Transcription:  chăn-dtông-gaan-bpai-têe-sà-tăan-tôot       " + "              Thai word:  ฉันต้องการไปที่สถานทูต");
        List<String> em7 = new ArrayList<>();
        em7.add("Transcription:  chăn-mee-bpan-hăa                 " + "        Thai word:  ฉันมีปัญหา");
        List<String> em8 = new ArrayList<>();
        em8.add("Transcription:  chăn-dtông-gaan-nák-bplae                         " + "             Thai word:  ฉันต้องการนักแปล");
        List<String> em9 = new ArrayList<>();
        em9.add("Transcription:  chăn-dtông-gaan-bpai-têe-sà-tăa-nee-dtam-rùat                  " + "              Thai word:  ฉันต้องการไปที่สถานีตำรวจ");
        List<String> em10 = new ArrayList<>();
        em10.add("Transcription:  chăn-mâi-mee-ngern          " + "                                           Thai word:  ฉันไม่มีเงิน");
        List<String> em11 = new ArrayList<>();
        em11.add("Transcription:  fai-mâi                     " + "                                           Thai word:  ไฟไหม้");
        List<String> em12 = new ArrayList<>();
        em12.add("Transcription:  mee-kon-dtông-gaan-kwaam-chûay-lĕua              " + "                          Thai word:  มีคนต้องการความช่วยเหลือ");
        List<String> em13 = new ArrayList<>();
        em13.add("Transcription:  chăn-dtòk-krêuang-bin       " + "               Thai word:  ฉันตกเครื่องบิน");
        List<String> em14 = new ArrayList<>();
        em14.add("Transcription:  chăn-tam-grà-bpăo-dern-taang-kŏng-chăn-hăai                     " + "            Thai word:  ฉันทำกระเป๋าเดินทางของฉันหาย");
        List<String> em15 = new ArrayList<>();
        em15.add("Transcription:  chăn-tam-toh-rá-sàp-hăai    " + "               Thai word:  ฉันทำโทรศัพท์หาย");
        List<String> em16 = new ArrayList<>();
        em16.add("Transcription:  chăn-tam-gun-jae-hăai          " + "                 Thai word:  ฉันทำกุญแจหาย");
        List<String> em17 = new ArrayList<>();
        em17.add("Transcription:  dâi-bpròht-maa-reo-têe-sùt      " + "           Thai word:  ได้โปรดมาเร็วที่สุด");
        List<String> em18 = new ArrayList<>();
        em18.add("Transcription:  mee-bpám-náam-man-glâi-glâi-têe-nêe-măi                          " + "           Thai word:  มีปั๊มน้ำมันใกล้ๆที่นี่ไหม");
        List<String> em19 = new ArrayList<>();
        em19.add("Transcription:  bpròht-rîak-rót-dàp-plerng                             " + "                 Thai word:  โปรดเรียกรถดับเพลิง");
        List<String> em20 = new ArrayList<>();
        em20.add("Transcription:  chăn-dtông-gaan-pâet          " + "             Thai word:  ฉันต้องการแพทย์");
        List<String> em21 = new ArrayList<>();
        em21.add("Transcription:  mee-krai-nai-née-pôot-paa-săa-ang-grìt-dâi-măi                       " + "                        Thai word:    มีใครในนี้พูดภาษาอังกฤษได้ไหม");



        listHash.put(listDataHeader.get(0), em1);
        listHash.put(listDataHeader.get(1), em2);
        listHash.put(listDataHeader.get(2), em3);
        listHash.put(listDataHeader.get(3), em4);
        listHash.put(listDataHeader.get(4), em5);
        listHash.put(listDataHeader.get(5), em6);
        listHash.put(listDataHeader.get(6), em7);
        listHash.put(listDataHeader.get(7), em8);
        listHash.put(listDataHeader.get(8), em9);
        listHash.put(listDataHeader.get(9), em10);
        listHash.put(listDataHeader.get(10), em11);
        listHash.put(listDataHeader.get(11), em12);
        listHash.put(listDataHeader.get(12), em13);
        listHash.put(listDataHeader.get(13), em14);
        listHash.put(listDataHeader.get(14), em15);
        listHash.put(listDataHeader.get(15), em16);
        listHash.put(listDataHeader.get(16), em17);
        listHash.put(listDataHeader.get(17), em18);
        listHash.put(listDataHeader.get(18), em19);
        listHash.put(listDataHeader.get(19), em20);
        listHash.put(listDataHeader.get(20), em21);



    }





}





