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

public class Accom extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;
    MediaPlayer mMedia;


    //ListView listView;
    private ArrayAdapter adapter;
    String[] strings = {"Can you recommend a hotel?", "I'd like to make a reservation.", "Are there rooms available?", "Can I have a look?",
            "Is internet included?", "is breakfast included?",
            "Is the hotel located near the center?", "็How can I get to the hotel?", "How much does the room cost?",
            "I'd like to stay for ... nights.", "I want a single room.",
            "I want a double room.",
            "I have a reservation.", "I will arrive at ... (time).", "I will leave at ... (time).", "I forget the room key.",
            "Can I leave my luggage here?", "How long is it from the hotel to the airport?", "Do you have a baby bed?",
            "I would like to reserve a single room.", "Could you bring my breakfast to room 305?", "We've just finished breakfast.",
            "I would like a hotel reservation.",
            "I canceled my hotel reservation."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accom);

        listView = (ExpandableListView) findViewById(R.id.accommodation);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar12);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Accommodation");
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);


        //listView = (ListView) findViewById(R.id.direc);
        // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac4);
                        mMedia.start();
                        break;

                    case 4:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac5);
                        mMedia.start();
                        break;

                    case 5:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac8);
                        mMedia.start();
                        break;

                    case 8:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac9);
                        mMedia.start();
                        break;

                    case 9:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac10);
                        mMedia.start();
                        break;

                    case 10:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac11);
                        mMedia.start();
                        break;

                    case 11:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac12);
                        mMedia.start();
                        break;

                    case 12:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac13);
                        mMedia.start();
                        break;

                    case 13:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac15);
                        mMedia.start();
                        break;

                    case 15:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac17);
                        mMedia.start();
                        break;

                    case 17:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac18);
                        mMedia.start();
                        break;

                    case 18:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac19);
                        mMedia.start();
                        break;

                    case 19:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac20);
                        mMedia.start();
                        break;

                    case 20:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac21);
                        mMedia.start();
                        break;

                    case 21:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac22);
                        mMedia.start();
                        break;

                    case 22:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac23);
                        mMedia.start();
                        break;

                    case 23:
                        mMedia = MediaPlayer.create(Accom.this, R.raw.ac24);
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


        listDataHeader.add("Can you recommend a hotel?");
        listDataHeader.add("I'd like to make a reservation.");
        listDataHeader.add("Are there rooms available?");
        listDataHeader.add("Can I have a look?");
        listDataHeader.add("Is internet included?");
        listDataHeader.add("Is breakfast included?");
        listDataHeader.add("Is the hotel located near the center?");
        listDataHeader.add("็How can I get to the hotel?");
        listDataHeader.add("How much does the room cost?");
        listDataHeader.add("I'd like to stay for ... nights.");
        listDataHeader.add("I want a single room.");
        listDataHeader.add("I want a double room.");
        listDataHeader.add("I have a reservation.");
        listDataHeader.add("I will arrive at ... (time).");
        listDataHeader.add("I will leave at ... (time).");
        listDataHeader.add("I forget the room key.");
        listDataHeader.add("Can I leave my luggage here?");
        listDataHeader.add("How long is it from the hotel to the airport?");
        listDataHeader.add("Do you have a baby bed?");
        listDataHeader.add("I would like to reserve a single room.");
        listDataHeader.add("Could you bring my breakfast to room 305?");
        listDataHeader.add("We've just finished breakfast.");
        listDataHeader.add("I would like a hotel reservation.");
        listDataHeader.add("I canceled my hotel reservation.");


        List<String> ac1 = new ArrayList<>();
        ac1.add("Transcription:  kun-chûay-náe-nam-rohng-raem-hâi-nòi-dâi-măi                 " + "               Thai word:  คุุณช่วยแนะนำโรงแรมให้หน่อยได้ไหม");
        List<String> ac2 = new ArrayList<>();
        ac2.add("Transcription:  chăn-dtông-gaan-jong-hông-pák                   " + "              Thai word:  ฉันต้องการจองห้องพัก");
        List<String> ac3 = new ArrayList<>();
        ac3.add("Transcription:  mee-hông-wâang-rĕu-mâi                            " + "                                 Thai word:  มีห้องว่างหรือไม่");
        List<String> ac4 = new ArrayList<>();
        ac4.add("Transcription:  chăn-kŏr-doo-nòi-dâi-rĕu-mâi                         " + "              Thai word:  ฉันขอดูหน่อยได้หรือไม่");
        List<String> ac5 = new ArrayList<>();
        ac5.add("Transcription:  ruam-in-têr-nét-măi                         " + "              Thai word:  รวมอินเทอร์เน็ตไหม");
        List<String> ac6 = new ArrayList<>();
        ac6.add("Transcription:  ruam-aa-hăan-cháo-măi                                " + "                              Thai word:  รวมอาหารเช้าไหม");
        List<String> ac7 = new ArrayList<>();
        ac7.add("Transcription:  rohng-raem-yòo-glâi-nai-meuang-măi                " + "              Thai word:  โรงแรมอยู่ใกล้ในเมืองไหม");
        List<String> ac8 = new ArrayList<>();
        ac8.add("Transcription:  chăn-jà-bpai-rohng-raem-dâi-yàang-rai                         " + "             Thai word:  ฉันจะไปโรงแรมได้อย่างไร");
        List<String> ac9 = new ArrayList<>();
        ac9.add("Transcription:  hông-raa-kaa-tâo-rai                  " + "              Thai word:  ห้องราคาเท่าไร");
        List<String> ac10 = new ArrayList<>();
        ac10.add("Transcription:  chăn-dtông-gaan-yòo-keun          " + "                                           Thai word:  ฉันต้องการอยู่...คืน");
        List<String> ac11 = new ArrayList<>();
        ac11.add("Transcription:  chăn-dtông-gaan-hông-dìeow        " + "                                           Thai word:  ฉันต้องการห้องเดี่ยว");
        List<String> ac12 = new ArrayList<>();
        ac12.add("Transcription:  chăn-dtông-gaan-hông-kôo   " + "                                                Thai word:  ฉันต้องการห้องคู่");
        List<String> ac13 = new ArrayList<>();
        ac13.add("Transcription:  chăn-jong-wái-láew               " + "            Thai word:  ฉันจองไว้แล้ว");
        List<String> ac14 = new ArrayList<>();
        ac14.add("Transcription:  chăn-bpai-tĕung-dtor                  " + "            Thai word:  ฉันไปถึงตอน...");
        List<String> ac15 = new ArrayList<>();
        ac15.add("Transcription:  chăn-jà-òk-dtor                  " + "                 Thai word:  ฉันจะออกตอน...");
        List<String> ac16 = new ArrayList<>();
        ac16.add("Transcription:  chăn-leum-gun-jae-hông                          " + "                                         Thai word:  ฉันลืมกุญแจห้อง");
        List<String> ac17 = new ArrayList<>();
        ac17.add("Transcription:                                                 fàak-grà-bpăo-dern-taang-wái-têe-nêe-dâi-măi                          " + "                                     Thai word:                                                             ฝากกระเป๋าเดินทางไว้ที่นี่ได้ไหม");
        List<String> ac18 = new ArrayList<>();
        ac18.add("Transcription:                                                 jàak-rohng-raem-bpai-sà-năam-bin-chái-way-laa-tâo-rai                  " + "                                    Thai word:                                                            จากโรงแรมไปสนามบินใช้เวลาเท่าไร");
        List<String> ac19 = new ArrayList<>();
        ac19.add("Transcription:  mee-dtiang-non-săm-ràp-dèk-măi                             " + "                 Thai word:  มีเตียงนอนสำหรับเด็กไหม");
        List<String> ac20 = new ArrayList<>();
        ac20.add("Transcription:  chăn-yàak-jong-hông-dìeow                 " + "                                   Thai word:  ฉันอยากจองห้องเดี่ยว");
        List<String> ac21 = new ArrayList<>();
        ac21.add("Transcription:                                                  kun-sèrf-aa-hăan-têe-hông-săam-sŏon-hâa-dâi-măi                      " + "                                     Thai word:                                                            คุณเสิร์ฟอาหารที่ห้อง 305 ได้ไหม");
        List<String> ac22 = new ArrayList<>();
        ac22.add("Transcription:  pûak-rao-taan-aa-hăan-cháo-sèt-láew                            " + "           Thai word:  พวกเราทานอาหารเช้าเสร็จแล้ว");
        List<String> ac23 = new ArrayList<>();
        ac23.add("Transcription:  chăn-kŏr-jong-hông             " + "           Thai word:  ฉันขอจองห้อง");
        List<String> ac24 = new ArrayList<>();
        ac24.add("Transcription:  chăn-yók-lêrk-gaan-jong-hông                                  " + "                               Thai word:  ฉันยกเลิกการจองห้อง");


        listHash.put(listDataHeader.get(0), ac1);
        listHash.put(listDataHeader.get(1), ac2);
        listHash.put(listDataHeader.get(2), ac3);
        listHash.put(listDataHeader.get(3), ac4);
        listHash.put(listDataHeader.get(4), ac5);
        listHash.put(listDataHeader.get(5), ac6);
        listHash.put(listDataHeader.get(6), ac7);
        listHash.put(listDataHeader.get(7), ac8);
        listHash.put(listDataHeader.get(8), ac9);
        listHash.put(listDataHeader.get(9), ac10);
        listHash.put(listDataHeader.get(10), ac11);
        listHash.put(listDataHeader.get(11), ac12);
        listHash.put(listDataHeader.get(12), ac13);
        listHash.put(listDataHeader.get(13), ac14);
        listHash.put(listDataHeader.get(14), ac15);
        listHash.put(listDataHeader.get(15), ac16);
        listHash.put(listDataHeader.get(16), ac17);
        listHash.put(listDataHeader.get(17), ac18);
        listHash.put(listDataHeader.get(18), ac19);
        listHash.put(listDataHeader.get(19), ac20);
        listHash.put(listDataHeader.get(20), ac21);
        listHash.put(listDataHeader.get(21), ac22);
        listHash.put(listDataHeader.get(22), ac23);
        listHash.put(listDataHeader.get(23), ac24);


    }





}

