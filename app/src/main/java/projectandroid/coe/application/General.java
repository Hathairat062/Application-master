package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class General extends AppCompatActivity  {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    //ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"Hi/Hello!", "Good morning!", "Good afternoon!", "Good evening!", "Good night!", "How are you?",
            "Fine", "Thank you(to a younger person)", "Thank you(to a older person)", "I'm sorry.", "Goodbye", "Never mind!",
            "Do you speak English?", "Do you speak Thai?", "Yes,I do.", "No,I don't.", "I don't understand.",
            "Please speak more slowly.", "You're welcome.", "Yes", "No", "Okay", "Right", "Wrong", "Excuse me.", "I see",
            "I don't know", "No problem.", "Good luck!", "Take care!", "Please"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        listView = (ExpandableListView)findViewById(R.id.general);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar5);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("General conversation");


        //listView = (ListView) findViewById(R.id.general);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge31);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge21);
                        mMedia.start();
                        break;

                    case 21:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge32);
                        mMedia.start();
                        break;

                    case 22:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge22);
                        mMedia.start();
                        break;

                    case 23:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge23);
                        mMedia.start();
                        break;
                    case 24:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge24);
                        mMedia.start();
                        break;
                    case 25:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge25);
                        mMedia.start();
                        break;
                    case 26:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge26);
                        mMedia.start();
                        break;
                    case 27:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge27);
                        mMedia.start();
                        break;

                    case 28:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge28);
                        mMedia.start();
                        break;
                    case 29:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge29);
                        mMedia.start();
                        break;
                    case 30:
                        mMedia = MediaPlayer.create(General.this, R.raw.ge30);
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

        listDataHeader.add("Hi/Hello!");
        listDataHeader.add("Good morning!");
        listDataHeader.add("Good afternoon!");
        listDataHeader.add("Good evening!");
        listDataHeader.add("Good night!");
        listDataHeader.add("How are you?");
        listDataHeader.add("Fine");
        listDataHeader.add("Thank you(to a younger person)");
        listDataHeader.add("Thank you(to a older person)");
        listDataHeader.add("I'm sorry.");
        listDataHeader.add("Goodbye");
        listDataHeader.add("Never mind!");
        listDataHeader.add("Do you speak English?");
        listDataHeader.add("Do you speak Thai?");
        listDataHeader.add("Yes,I do.");
        listDataHeader.add("No,I don't.");
        listDataHeader.add("I don't understand.");
        listDataHeader.add("Please speak more slowly.");
        listDataHeader.add("You're welcome.");
        listDataHeader.add("Yes");
        listDataHeader.add("No");
        listDataHeader.add("Okay");
        listDataHeader.add("Right");
        listDataHeader.add("Wrong");
        listDataHeader.add("Excuse me.");
        listDataHeader.add("I see");
        listDataHeader.add("I don't know");
        listDataHeader.add("No problem.");
        listDataHeader.add("Good luck!");
        listDataHeader.add("Take care!");
        listDataHeader.add("Please");



        List<String> ge1 = new ArrayList<>();
        ge1.add("Transcription:  sà-wàt-dee                    " + "                 Thai word:  สวัสดี");
        List<String> ge2 = new ArrayList<>();
        ge2.add("Transcription:  sà-wàt-dee-dton-cháo          " + "                 Thai word:  สวัสดีตอนเช้า");
        List<String> ge3= new ArrayList<>();
        ge3.add("Transcription:  sà-wàt-dee-dton-bàai          " + "                 Thai word:  สวัสดีตอนบ่าย");
        List<String> ge4 = new ArrayList<>();
        ge4.add("Transcription:  sà-wàt-dee-dton-yen           " + "                 Thai word:  สวัสดีตอนเย็น");
        List<String> ge5 = new ArrayList<>();
        ge5.add("Transcription:  raa-dtree-sà-wàt              " + "                 Thai word:  ราตรีสวัสดิ์");
        List<String> ge6 = new ArrayList<>();
        ge6.add("Transcription:  sà-baai-dee-măi               " + "                 Thai word:  สบายดีไหม");
        List<String> ge7 = new ArrayList<>();
        ge7.add("Transcription:  sà-baai-dee                   " + "                 Thai word:  สบายดี");
        List<String> ge8 = new ArrayList<>();
        ge8.add("Transcription:  kòp jai                       " + "                 Thai word:  ขอบใจ");
        List<String> ge9 = new ArrayList<>();
        ge9.add("Transcription:  kòp-kun                       " + "                 Thai word:  ขอบคุณ");
        List<String> ge10 = new ArrayList<>();
        ge10.add("Transcription:  chăn-kŏr-tôht                  " + "                 Thai word:  ฉันขอโทษ");
        List<String> ge11 = new ArrayList<>();
        ge11.add("Transcription:  laa gòn                        " + "                 Thai word:  ลาก่อน");
        List<String> ge12 = new ArrayList<>();
        ge12.add("Transcription:  mâi-bpen-rai                   " + "                 Thai word:  ไม่เป็นไร");
        List<String> ge13 = new ArrayList<>();
        ge13.add("Transcription:                                                        kun-pôot-paa-săa ang-grìt-dâi-măi                   " + "                             Thai word:                                                       คุณพูดภาษาอังกฤษได้ไหม");
        List<String> ge14 = new ArrayList<>();
        ge14.add("Transcription:  kun-pôot-paa-săa-tai-dâi-măi   " + "                                                   Thai word:  คุณพูดภาษาไทยได้ไหม");
        List<String> ge15 = new ArrayList<>();
        ge15.add("Transcription:  dâi                            " + "                 Thai word:  ได้");
        List<String> ge16 = new ArrayList<>();
        ge16.add("Transcription:  mâi-dâi                        " + "                 Thai word:  ไม่ได้");
        List<String> ge17 = new ArrayList<>();
        ge17.add("Transcription:  mâi-kâo-jai                    " + "                 Thai word:  ไม่เข้าใจ");
        List<String> ge18 = new ArrayList<>();
        ge18.add("Transcription:  pôot-cháa-cháa-nòi-dâi-măi     " + "                                                    Thai word:  พูดช้าๆหน่อยได้ไหม");
        List<String> ge19 = new ArrayList<>();
        ge19.add("Transcription:  yin-dee                        " + "                 Thai word:  ยินดี");
        List<String> ge20 = new ArrayList<>();
        ge20.add("Transcription:  châi                           " + "                 Thai word:  ใช่");
        List<String> ge21 = new ArrayList<>();
        ge21.add("Transcription:  mâi-châi                       " + "                 Thai word:  ไม่ใช่");
        List<String> ge22 = new ArrayList<>();
        ge22.add("Transcription:  oh-kay                         " + "                 Thai word:  โอเค");
        List<String> ge23 = new ArrayList<>();
        ge23.add("Transcription:  tòok                           " + "                 Thai word:  ถูก");
        List<String> ge24 = new ArrayList<>();
        ge24.add("Transcription:  pìt                            " + "                 Thai word:  ผิด");
        List<String> ge25 = new ArrayList<>();
        ge25.add("Transcription:  kŏr-tôht                       " + "                 Thai word:  ขอโทษ");
        List<String> ge26 = new ArrayList<>();
        ge26.add("Transcription:  ŏr-kâo-jai-láew                " + "                 Thai word:  อ๋อเข้าใจแล้ว");
        List<String> ge27 = new ArrayList<>();
        ge27.add("Transcription:  mâi-róo                        " + "                 Thai word:  ไม่รู้");
        List<String> ge28 = new ArrayList<>();
        ge28.add("Transcription:  mâi-mee-bpan-hăa               " + "                 Thai word:  ไม่มีปัญหา");
        List<String> ge29 = new ArrayList<>();
        ge29.add("Transcription:  chôhk-dee                      " + "                 Thai word:  โชคดี");
        List<String> ge30 = new ArrayList<>();
        ge30.add("Transcription:  doo-lae-dtua-ayng-dûay         " + "                                                 Thai word:  ดูแลตัวเองด้วย");
        List<String> ge31 = new ArrayList<>();
        ge31.add("Transcription:  gà-rú-naa                      " + "                 Thai word:  กรุณา");


        listHash.put(listDataHeader.get(0),ge1);
        listHash.put(listDataHeader.get(1),ge2);
        listHash.put(listDataHeader.get(2),ge3);
        listHash.put(listDataHeader.get(3),ge4);
        listHash.put(listDataHeader.get(4),ge5);
        listHash.put(listDataHeader.get(5),ge6);
        listHash.put(listDataHeader.get(6),ge7);
        listHash.put(listDataHeader.get(7),ge8);
        listHash.put(listDataHeader.get(8),ge9);
        listHash.put(listDataHeader.get(9),ge10);
        listHash.put(listDataHeader.get(10),ge11);
        listHash.put(listDataHeader.get(11),ge12);
        listHash.put(listDataHeader.get(12),ge13);
        listHash.put(listDataHeader.get(13),ge14);
        listHash.put(listDataHeader.get(14),ge15);
        listHash.put(listDataHeader.get(15),ge16);
        listHash.put(listDataHeader.get(16),ge17);
        listHash.put(listDataHeader.get(17),ge18);
        listHash.put(listDataHeader.get(18),ge19);
        listHash.put(listDataHeader.get(19),ge20);
        listHash.put(listDataHeader.get(20),ge21);
        listHash.put(listDataHeader.get(21),ge22);
        listHash.put(listDataHeader.get(22),ge23);
        listHash.put(listDataHeader.get(23),ge24);
        listHash.put(listDataHeader.get(24),ge25);
        listHash.put(listDataHeader.get(25),ge26);
        listHash.put(listDataHeader.get(26),ge27);
        listHash.put(listDataHeader.get(27),ge28);
        listHash.put(listDataHeader.get(28),ge29);
        listHash.put(listDataHeader.get(29),ge30);
        listHash.put(listDataHeader.get(30),ge31);



    }


    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }

        final Dialog dialog = new Dialog(General.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);

        switch (position) {
            case 0:
                //Toast.makeText(this, "สวัสดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge1);
                mMedia.start();
                textData.setText("Translate:                                          sà-wàt-dee                     " + "                 Thai word:                                          สวัสดี");
                break;
            case 1:
                //Toast.makeText(this, "สวัสดีตอนเช้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge2);
                mMedia.start();
                textData.setText("Translate:                                          sà-wàt-dee-dton-cháo                     " + "                 Thai word:                            สวัสดีตอนเช้า");
                break;
            case 2:
                //Toast.makeText(this, "สวัสดีตอนบ่าย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge3);
                mMedia.start();
                textData.setText("Translate:                                           sà-wàt-dee-dton-bàai                     " + "                 Thai word:                              สวัสดีตอนบ่าย");
                break;
            case 3:
                //Toast.makeText(this, "สวัสดีตอนเย็น", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge31);
                mMedia.start();
                textData.setText("Translate:                                           sà-wàt-dee-dton-yen                     " + "                 Thai word:                              สวัสดีตอนเย็น");
                break;
            case 4:
                //Toast.makeText(this, "ราตรีสวัสดิ์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge5);
                mMedia.start();
                textData.setText("Translate:                                            raa-dtree-sà-wàt                     " + "                 Thai word:                                 ราตรีสวัสดิ์");
                break;
            case 5:
                //Toast.makeText(this, "สบายดีไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge6);
                mMedia.start();
                textData.setText("Translate:                                              sà-baai-dee-măi                     " + "                 Thai word:                              สบายดีไหม");
                break;
            case 6:
                //Toast.makeText(this, "สบายดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge7);
                mMedia.start();
                textData.setText("Translate:                                               sà-baai-dee                     " + "                 Thai word:                                  สบายดี");
                break;
            case 7:
                //Toast.makeText(this, "ขอบใจ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge8);
                mMedia.start();
                textData.setText("Translate:                                               kòp jai                     " + "                 Thai word:                                      ขอบใจ");
                break;
            case 8:
                //Toast.makeText(this, "ขอบคุณ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge9);
                mMedia.start();
                textData.setText("Translate:                                               kòp kun                    " + "                 Thai word:                                      ขอบคุณ");
                break;
            case 9:
                //Toast.makeText(this, "ฉันขอโทษ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge10);
                mMedia.start();
                textData.setText("Translate:                                              chăn-kŏr-tôht                     " + "                 Thai word:                                 ฉันขอโทษ");
                break;
            case 10:
                //Toast.makeText(this, "ลาก่อน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge11);
                mMedia.start();
                textData.setText("Translate:                                              laa gòn                     " + "                 Thai word:                                       ลาก่อน");
                break;
            case 11:
                //Toast.makeText(this, "ไม่เป็นไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge12);
                mMedia.start();
                textData.setText("Translate:                                              mâi-bpen-rai                    " + "                 Thai word:                                  ไม่เป็นไร");
                break;
            case 12:
                //Toast.makeText(this, "คุณพูดภาษาอังกฤษได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge13);
                mMedia.start();
                textData.setText("Translate:                                              kun-pôot-paa-săa ang-grìt-dâi-măi                    " + "                 Thai word:                                       คุณพูดภาษาอังกฤษได้ไหม");
                break;
            case 13:
                //Toast.makeText(this, "คุณพูดภาษาไทยได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge14);
                mMedia.start();
                textData.setText("Translate:                                              kun-pôot-paa-săa-tai-dâi-măi                    " + "                 Thai word:                                       คุณพูดภาษาไทยได้ไหม");
                break;
            case 14:
                //Toast.makeText(this, "ได้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge15);
                mMedia.start();
                textData.setText("Translate:                                              dâi                    " + "                 Thai word:                                                   ได้");
                break;
            case 15:
                //Toast.makeText(this, "ไม่ได้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge16);
                mMedia.start();
                textData.setText("Translate:                                               mâi-dâi                    " + "                 Thai word:                                                ไม่ได้");
                break;
            case 16:
                //Toast.makeText(this, "ไม่เข้าใจ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge17);
                mMedia.start();
                textData.setText("Translate:                                               mâi-kâo-jai                    " + "                 Thai word:                                            ไม่เข้าใจ");
                break;
            case 17:
                //Toast.makeText(this, "พูดช้าๆหน่อยได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge18);
                mMedia.start();
                textData.setText("Translate:                                              pôot-cháa-cháa-nòi-dâi-măi                     " + "                 Thai word:                                    พูดช้าๆหน่อยได้ไหม");
                break;
            case 18:
                //Toast.makeText(this, "ยินดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge19);
                mMedia.start();
                textData.setText("Translate:                                              yin-dee                     " + "                 Thai word:                                                              ยินดี");
                break;
            case 19:
                //Toast.makeText(this, "ใช่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge20);
                mMedia.start();
                textData.setText("Translate:                                               châi                     " + "                 Thai word:                                                           ใช่");
                break;
            case 20:
                //Toast.makeText(this, "ไม่ใช่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge21);
                mMedia.start();
                textData.setText("Translate:                                                mâi-châi                     " + "                 Thai word:                                                    ไม่ใช่");
                break;
            case 21:
                //Toast.makeText(this, "โอเค", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge32);
                mMedia.start();
                textData.setText("Translate:                                                oh-kay                     " + "                 Thai word:                                                     โอเค");
                break;
            case 22:
                //Toast.makeText(this, "ถูก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge22);
                mMedia.start();
                textData.setText("Translate:                                                 tòok                     " + "                 Thai word:                                                   ถูก");
                break;
            case 23:
                //Toast.makeText(this, "ผิด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge23);
                mMedia.start();
                textData.setText("Translate:                                                 pìt                     " + "                 Thai word:                                                 ผิด");
                break;
            case 24:
                //Toast.makeText(this, "ขอโทษ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge24);
                mMedia.start();
                textData.setText("Translate:                                                 kŏr-tôht                     " + "                 Thai word:                                              ขอโทษ");
                break;
            case 25:
                //Toast.makeText(this, "อ๋อเข้าใจแล้ว", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge25);
                mMedia.start();
                textData.setText("Translate:                                                 ŏr-kâo-jai-láew                     " + "                 Thai word:                                      อ๋อเข้าใจแล้ว");
                break;
            case 26:
                //Toast.makeText(this, "ไม่รู้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge26);
                mMedia.start();
                textData.setText("Translate:                                                 mâi-róo                     " + "                Thai word:                                          ไม่รู้");
                break;
            case 27:
                //Toast.makeText(this, "ไม่มีปัญหา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge27);
                mMedia.start();
                textData.setText("Translate:                                                  mâi-mee-bpan-hăa                     " + "                 Thai word:                                ไม่มีปัญหา");
                break;
            case 28:
                //Toast.makeText(this, "โชคดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge28);
                mMedia.start();
                textData.setText("Translate:                                                  chôhk-dee                     " + "                 Thai word:                                           โชคดี");
                break;
            case 29:
                //Toast.makeText(this, "ดูแลตัวเองด้วย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge29);
                mMedia.start();
                textData.setText("Translate:                                                  doo-lae-dtua-ayng-dûay                    " + "                 Thai word:                                ดูแลตัวเองด้วย");
                break;
            case 30:
                //Toast.makeText(this, "กรุณา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge30);
                mMedia.start();
                textData.setText("Translate:                                                   gà-rú-naa                     " + "                 Thai word:                                      กรุณา");
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





