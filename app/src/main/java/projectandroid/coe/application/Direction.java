package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Direction extends AppCompatActivity  {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    MediaPlayer mMedia;




    //ListView listView;

    private ArrayAdapter adapter;
    String[] strings = {"Go straight", "Turn left", "Turn right", "Get in/on", "Get off", "Taxi",
            "Direction", "Boat", "Station", "Where is the train station?", "I want to go to the train station.",
            "How can I get there?",
            "Where are you?", "I'm at...", "What is the name of this place?", "Where is the nearest bus stop?",
            "Where is the nearest train station?", "What is the name of this station?", "Where should I transfer?",
            "How long does it take?", "It takes about...", "Where can I buy a ticket?", "I want to buy a ticket to...",
            "How much is this ticket?", "The ticket costs...baht.", "Does the bus have air condition?", "Does the bus have a toilet?",
            "When does the train leave?", "When will the train arrive?", "Please stop here.", "Please use the meter.",
            "Where are we?",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        listView = (ExpandableListView)findViewById(R.id.direction);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        //listView = (ListView) findViewById(R.id.direc);
       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr25);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr26);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr27);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr28);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr29);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr30);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr31);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr32);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr33);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr1);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr2);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr3);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr4);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr5);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr6);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr7);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr8);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr9);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr10);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr11);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr12);
                        mMedia.start();
                        break;

                    case 21:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr13);
                        mMedia.start();
                        break;

                    case 22:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr14);
                        mMedia.start();
                        break;

                    case 23:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr15);
                        mMedia.start();
                        break;
                    case 24:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr16);
                        mMedia.start();
                        break;
                    case 25:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr17);
                        mMedia.start();
                        break;
                    case 26:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr18);
                        mMedia.start();
                        break;
                    case 27:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr19);
                        mMedia.start();
                        break;

                    case 28:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr20);
                        mMedia.start();
                        break;
                    case 29:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr21);
                        mMedia.start();
                        break;
                    case 30:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr22);
                        mMedia.start();
                        break;
                    case 31:
                        mMedia = MediaPlayer.create(Direction.this, R.raw.tr23);
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


        listDataHeader.add("Go straight");
        listDataHeader.add("Turn left");
        listDataHeader.add("Turn right");
        listDataHeader.add("Get in/on");
        listDataHeader.add("Get off");
        listDataHeader.add("Taxi");
        listDataHeader.add("Direction");
        listDataHeader.add("Boat");
        listDataHeader.add("Station");
        listDataHeader.add("Where is the train station?");
        listDataHeader.add("I want to go to the train station.");
        listDataHeader.add("How can I get there?");
        listDataHeader.add("Where are you?");
        listDataHeader.add("I'm at...");
        listDataHeader.add("What is the name of this place?");
        listDataHeader.add("Where is the nearest bus stop?");
        listDataHeader.add("Where is the nearest train station?");
        listDataHeader.add("What is the name of this station?");
        listDataHeader.add("Where should I transfer?");
        listDataHeader.add("How long does it take?");
        listDataHeader.add("It takes about...");
        listDataHeader.add("Where can I buy a ticket?");
        listDataHeader.add("I want to buy a ticket to...");
        listDataHeader.add("How much is this ticket?");
        listDataHeader.add("The ticket costs...baht.");
        listDataHeader.add("Does the bus have air condition?");
        listDataHeader.add("Does the bus have a toilet?");
        listDataHeader.add("When does the train leave?");
        listDataHeader.add("When will the train arrive?");
        listDataHeader.add("Please stop here.");
        listDataHeader.add("Please use the meter.");
        listDataHeader.add("Where are we?");

        List<String> di1 = new ArrayList<>();
        di1.add("Transcription:  dtrong-bpai                 " + "               Thai word:  ตรงไป");
        List<String> di2 = new ArrayList<>();
        di2.add("Transcription:  líeow-sáai                   " + "              Thai word:  เลี้ยวซ้าย");
        List<String> di3= new ArrayList<>();
        di3.add("Transcription:  líeow kwăa                   " + "              Thai word:  เลี้ยวขวา");
        List<String> di4 = new ArrayList<>();
        di4.add("Transcription:  kêun                         " + "              Thai word:  ขึ้น");
        List<String> di5 = new ArrayList<>();
        di5.add("Transcription:  long                         " + "              Thai word:  ลง");
        List<String> di6 = new ArrayList<>();
        di6.add("Transcription:  táek-sêe                     " + "              Thai word:  แท็กซี่");
        List<String> di7 = new ArrayList<>();
        di7.add("Transcription:   bplaai-taang                " + "              Thai word:  ปลายทาง");
        List<String> di8 = new ArrayList<>();
        di8.add("Transcription:   reua                         " + "             Thai word:  เรือ");
        List<String> di9 = new ArrayList<>();
        di9.add("Transcription:   sà-tăa-nee                  " + "              Thai word:  สถานี");
        List<String> di10 = new ArrayList<>();
        di10.add("Transcription:  sà-tăa-nee-rót-fai-yòo-têe-năi          " + "                                           Thai word:  สถานีรถไฟอยู่ที่ไหน");
        List<String> di11 = new ArrayList<>();
        di11.add("Transcription:                                                  chăn-dtông-gaan-bpai-sà-tăa-nee-rót-fai                          " + "                                    Thai word:                                                              ฉันต้องการไปสถานีรถไฟ");
        List<String> di12 = new ArrayList<>();
        di12.add("Transcription:  bpai-têe-nân-dâi-yàang-rai   " + "                                                      Thai word:  ไปที่นั่นได้อย่างไร");
        List<String> di13 = new ArrayList<>();
        di13.add("Transcription:  kun-yòo-têe-năi               " + "            Thai word:  คุณอยู่ที่ไหน");
        List<String> di14 = new ArrayList<>();
        di14.add("Transcription:  chăn-yòo-têe                  " + "            Thai word:  ฉันอยู่ที่...");
        List<String> di15 = new ArrayList<>();
        di15.add("Transcription:  têe-nêe-mee-chêu-wâa-à-rai    " + "                                                     Thai word:  ที่นี่มีชื่อว่าอะไร");
        List<String> di16 = new ArrayList<>();
        di16.add("Transcription:                                                  bpâai-rót-bàt-têe-glâi-têe-sùt-yòo-têe-năi                       " + "                                     Thai word:                                                             ป้ายรถบัสที่ใกล้ที่สุดอยู่ที่ไหน");
        List<String> di17 = new ArrayList<>();
        di17.add("Transcription:                                                  sà-tăa-nee-rót-fai-têe-glâi-yòo-têe-năi                          " + "                                     Thai word:                                                             สถานีรถไฟที่ใกล้ที่สุดอยู่ที่ไหน");
        List<String> di18 = new ArrayList<>();
        di18.add("Transcription:  sà-tăa-nee-née-chêu-wâa-à-rai  " + "                                                     Thai word:  สถานีนี้มีชื่อว่าอะไร");
        List<String> di19 = new ArrayList<>();
        di19.add("Transcription:  chăn-dtông-bplìan-rót-têe-năi  " + "                                                     Thai word:  ฉันต้องเปลี่ยนรถที่ไหน");
        List<String> di20 = new ArrayList<>();
        di20.add("Transcription:  chái-way-laa-naan-tâo-rai      "  + "                                                     Thai word:  ใช้เวลานานเท่าไร");
        List<String> di21 = new ArrayList<>();
        di21.add("Transcription:  bprà-maan                       " + "          Thai word:  ประมาณ...");
        List<String> di22 = new ArrayList<>();
        di22.add("Transcription:  séu-dtŭa-dâi-têe-năi           " + "           Thai word:  ซื้อตั๋วได้ที่ไหน");
        List<String> di23 = new ArrayList<>();
        di23.add("Transcription:  chăn-yàak-séu-dtŭa-bpai        " + "                                                      Thai word:  ฉันอยากซื้อตั๋วไป...");
        List<String> di24 = new ArrayList<>();
        di24.add("Transcription:  dtŭa-raa-kaa-tâo-rai           " + "           Thai word:  ตั๋วราคาเท่าไร");
        List<String> di25 = new ArrayList<>();
        di25.add("Transcription:  dtŭa-raa-kaa-bàat              " + "           Thai word:  ตั๋วราคา...บาท");
        List<String> di26 = new ArrayList<>();
        di26.add("Transcription:  rót-bàt-mee-ae-măi             " + "           Thai word:  รถบัสมีแอร์ไหม");
        List<String> di27 = new ArrayList<>();
        di27.add("Transcription:  rót-bàt-mee-hông-náam-măi      " + "                                                       Thai word:  รถบัสมีห้องน้ำไหม");
        List<String> di28 = new ArrayList<>();
        di28.add("Transcription:  rót-fai-òk-dtor-gèe-mohng      " + "                                                       Thai word:  รถไฟออกตอนกี่โมง");
        List<String> di29 = new ArrayList<>();
        di29.add("Transcription:  rót-fai-tĕun-ggèe-mohng        " + "                                                        Thai word:  รถไฟถึงตอนกี่โมง");
        List<String> di30 = new ArrayList<>();
        di30.add("Transcription:  jòt-têe-nêe                    " + "           Thai word:  จอดที่นี่");
        List<String> di31 = new ArrayList<>();
        di31.add("Transcription:  chái-mí-dtêr-dûay              " + "           Thai word:  ใช้มิเตอร์ด้วย");
        List<String> di32 = new ArrayList<>();
        di32.add("Transcription:  pûak-rao-yòo-têe-năi           " + "           Thai word:  พวกเราอยู่ที่ไหน");


        listHash.put(listDataHeader.get(0),di1);
        listHash.put(listDataHeader.get(1),di2);
        listHash.put(listDataHeader.get(2),di3);
        listHash.put(listDataHeader.get(3),di4);
        listHash.put(listDataHeader.get(4),di5);
        listHash.put(listDataHeader.get(5),di6);
        listHash.put(listDataHeader.get(6),di7);
        listHash.put(listDataHeader.get(7),di8);
        listHash.put(listDataHeader.get(8),di9);
        listHash.put(listDataHeader.get(9),di10);
        listHash.put(listDataHeader.get(10),di11);
        listHash.put(listDataHeader.get(11),di12);
        listHash.put(listDataHeader.get(12),di13);
        listHash.put(listDataHeader.get(13),di14);
        listHash.put(listDataHeader.get(14),di15);
        listHash.put(listDataHeader.get(15),di16);
        listHash.put(listDataHeader.get(16),di17);
        listHash.put(listDataHeader.get(17),di18);
        listHash.put(listDataHeader.get(18),di19);
        listHash.put(listDataHeader.get(19),di20);
        listHash.put(listDataHeader.get(20),di21);
        listHash.put(listDataHeader.get(21),di22);
        listHash.put(listDataHeader.get(22),di23);
        listHash.put(listDataHeader.get(23),di24);
        listHash.put(listDataHeader.get(24),di25);
        listHash.put(listDataHeader.get(25),di26);
        listHash.put(listDataHeader.get(26),di27);
        listHash.put(listDataHeader.get(27),di28);
        listHash.put(listDataHeader.get(28),di29);
        listHash.put(listDataHeader.get(29),di30);
        listHash.put(listDataHeader.get(30),di31);
        listHash.put(listDataHeader.get(31),di32);



    }






    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }

        final Dialog dialog = new Dialog(Direction.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView) dialog.findViewById(R.id.textData);

        switch (position) {
            case 0:
                //Toast.makeText(this, "ตรงไป", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr25);
                mMedia.start();
                textData.setText("Translate:                                    dtrong-bpai                 " + "              Thai word:                                                         ตรงไป");
                break;
            case 1:
                //Toast.makeText(this, "เลี้ยวซ้าย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr26);
                mMedia.start();
                textData.setText("Translate:                                     líeow-sáai                   " + "             Thai word:                                                       เลี้ยวซ้าย");
                break;
            case 2:
                //Toast.makeText(this, "เลี้ยวขวา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr27);
                mMedia.start();
                textData.setText("Translate:                                      líeow kwăa                    " + "             Thai word:                                                    เลี้ยวขวา");
                break;
            case 3:
                //Toast.makeText(this, "ขึ้น", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr28);
                mMedia.start();
                textData.setText("Translate:                                       kêun                            " + "             Thai word:                                                   ขึ้น");
                break;
            case 4:
                //Toast.makeText(this, "ลง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr29);
                mMedia.start();
                textData.setText("Translate:                                        long                             " + "                  Thai word:                                               ลง");
                break;
            case 5:
                //Toast.makeText(this, "แท็กซี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr30);
                mMedia.start();
                textData.setText("Translate:                                           táek-sêe                          " + "                 Thai word:                                            แท็กซี่");
                break;
            case 6:
                //Toast.makeText(this, "ปลายทาง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr31);
                mMedia.start();
                textData.setText("Translate:                                        bplaai-taang                         " + "             Thai word:                                              ปลายทาง");
                break;
            case 7:
                //Toast.makeText(this, "เรือ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr32);
                mMedia.start();
                textData.setText("Translate:                                        reua                                  " + "                  Thai word:                                               เรือ");
                break;
            case 8:
                //Toast.makeText(this, "สถานี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr33);
                mMedia.start();
                textData.setText("Translate:                                        sà-tăa-nee                                 " + "             Thai word:                                                     สถานี");
                break;
            case 9:
                //Toast.makeText(this, "สถานีรถไฟอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr1);
                mMedia.start();
                textData.setText("Translate:                                       sà-tăa-nee-rót-fai-yòo-têe-năi              " + "                    Thai word:                                                   สถานีรถไฟอยู่ที่ไหน");
                break;
            case 10:
                //Toast.makeText(this, "ฉันต้องการไปสถานีรถไฟ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr2);
                mMedia.start();
                textData.setText("Translate:                                       chăn-dtông-gaan-bpai-sà-tăa-nee-rót-fai        " + "                Thai word:                                                    ฉันต้องการไปสถานีรถไฟ");
                break;
            case 11:
                //Toast.makeText(this, "ไปที่นั่นได้อย่างไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr3);
                mMedia.start();
                textData.setText("Translate:                                      bpai-têe-nân-dâi-yàang-rai                     " + "                          Thai word:                                                               ไปที่นั่นได้อย่างไร");
                break;
            case 12:
                //Toast.makeText(this, "คุณอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr4);
                mMedia.start();
                textData.setText("Translate:                                        kun-yòo-têe-năi                               " + "                      Thai word:                                                                     คุณอยู่ที่ไหน");
                break;
            case 13:
                //Toast.makeText(this, "ฉันอยู่ที่...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr5);
                mMedia.start();
                textData.setText("Translate:                                         chăn-yòo-têe                              " + "                         Thai word:                                                                       ฉันอยู่ที่...");
                break;
            case 14:
                //Toast.makeText(this, "ที่นี่มีชื่อว่าอะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr6);
                mMedia.start();
                textData.setText("Translate:                                         têe-nêe-mee-chêu-wâa-à-rai                           " + "                     Thai word:                                                                ที่นี่มีชื่อว่าอะไร");
                break;
            case 15:
                //Toast.makeText(this, "ป้ายรถบัสที่ใกล้ที่สุดอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr7);
                mMedia.start();
                textData.setText("Translate:                                         bpâai-rót-bàt-têe-glâi-têe-sùt-yòo-têe-năi                 " + "                 Thai word:                                                             ป้ายรถบัสที่ใกล้ที่สุดอยู่ที่ไหน");
                break;
            case 16:
                //Toast.makeText(this, "สถานีรถไฟที่ใกล้ที่สุดอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr8);
                mMedia.start();
                textData.setText("Translate:                                         sà-tăa-nee-rót-fai-têe-glâi-yòo-têe-năi                     " + "                        Thai word:                                                      สถานีรถไฟที่ใกล้ที่สุดอยู่ที่ไหน");
                break;
            case 17:
                //Toast.makeText(this, "สถานีนี้ชื่อว่าอะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr9);
                mMedia.start();
                textData.setText("Translate:                                         sà-tăa-nee-née-chêu-wâa-à-rai                         " + "                      Thai word:                                                               สถานีนี้ชื่อว่าอะไร");
                break;
            case 18:
                //Toast.makeText(this, "ฉันต้องเปลี่ยนรถที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr10);
                mMedia.start();
                textData.setText("Translate:                                          chăn-dtông-bplìan-rót-têe-năi                         " + "                        Thai word:                                                             ฉันต้องเปลี่ยนรถที่ไหน");
                break;
            case 19:
                //Toast.makeText(this, "ใช้เวลานานเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr11);
                mMedia.start();
                textData.setText("Translate:                                              chái-way-laa-naan-tâo-rai                            "  + "                              Thai word:                                                    ใช้เวลานานเท่าไร");
                break;
            case 20:
                //Toast.makeText(this, "ประมาณ...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr12);
                mMedia.start();
                textData.setText("Translate:                                              bprà-maan                                           " + "                            Thai word:                                                    ประมาณ...");
                break;
            case 21:
                //Toast.makeText(this, "ซื้อตั๋วได้ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr13);
                mMedia.start();
                textData.setText("Translate:                                            séu-dtŭa-dâi-têe-năi                                   " + "                        Thai word:                                                      ซื้อตั๋วได้ที่ไหน");
                break;
            case 22:
                //Toast.makeText(this, "ฉันอยากซื้อตั๋วไป...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr14);
                mMedia.start();
                textData.setText("Translate:                                           chăn-yàak-séu-dtŭa-bpai                          " + "                Thai word:                                                                     ฉันอยากซื้อตั๋วไป...");
                break;
            case 23:
                //Toast.makeText(this, "ตั๋วราคาเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr15);
                mMedia.start();
                textData.setText("Translate:                                            Translate:                                            dtŭa-raa-kaa-tâo-rai                  " + "                     Thai word:                             ตั๋วราคาเท่าไร");
                break;
            case 24:
                //Toast.makeText(this, "ตั๋วราคา...บาท", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr16);
                mMedia.start();
                textData.setText("Translate:                                             dtŭa-raa-kaa-bàat                        " + "                   Thai word:                                            ตั๋วราคา...บาท");
                break;
            case 25:
                //Toast.makeText(this, "รถบัสมีแอร์ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr17);
                mMedia.start();
                textData.setText("Translate:                                             rót-bàt-mee-ae-măi                            " + "                    Thai word:                                       รถบัสมีแอร์ไหม");
                break;
            case 26:
                //Toast.makeText(this, "รถบัสมีห้องน้ำไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr18);
                mMedia.start();
                textData.setText("Translate:                                              rót-bàt-mee-hông-náam-măi                       " + "                   Thai word:                                    รถบัสมีห้องน้ำไหม");
                break;
            case 27:
                //Toast.makeText(this, "รถไฟออกตอนกี่โมง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr19);
                mMedia.start();
                textData.setText("Translate:                                               rót-fai-òk-dtor-gèe-mohng                        " + "                     Thai word:                                รถไฟออกตอนกี่โมง");
                break;
            case 28:
                //Toast.makeText(this, "รถไฟถึงตอนกี่โมง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr20);
                mMedia.start();
                textData.setText("Translate:                                                rót-fai-tĕun-ggèe-mohng                          " + "                Thai word:                                     รถไฟถึงตอนกี่โมง");
                break;
            case 29:
                //Toast.makeText(this, "จอดที่นี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr21);
                mMedia.start();
                textData.setText("Translate:                                                 jòt-têe-nêe                                      " + "                       Thai word:                             จอดที่นี่");
                break;
            case 30:
                //Toast.makeText(this, "ใช้มิเตอร์ด้วย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr22);
                mMedia.start();
                textData.setText("Translate:                                                 chái-mí-dtêr-dûay                                " + "                    Thai word:                                ใช้มิเตอร์ด้วย");
                break;
            case 31:
                //Toast.makeText(this, "พวกเราอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr23);
                mMedia.start();
                textData.setText("Translate:                                                  pûak-rao-yòo-têe-năi                               " + "                 Thai word:                                 พวกเราอยู่ที่ไหน");
                break;

        }
        Button buttonOK =
                (Button) dialog.findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }*/
    }
