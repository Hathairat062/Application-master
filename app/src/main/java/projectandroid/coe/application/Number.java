package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Number extends AppCompatActivity  {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    //ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {
            "one", "two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        listView = (ExpandableListView)findViewById(R.id.num);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);



        //listView = (ListView) findViewById(R.id.num);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();


        listDataHeader.add("one");
        listDataHeader.add("two");
        listDataHeader.add("Three");
        listDataHeader.add("Four");
        listDataHeader.add("Five");
        listDataHeader.add("Six");
        listDataHeader.add("Seven");
        listDataHeader.add("Eight");
        listDataHeader.add("Nine");
        listDataHeader.add("Ten");
        listDataHeader.add("Eleven");
        listDataHeader.add("Twelve");
        listDataHeader.add("Thirteen");
        listDataHeader.add("Fourteen");
        listDataHeader.add("Fifteen");
        listDataHeader.add("Sixteen");
        listDataHeader.add("Seventeen");
        listDataHeader.add("Eighteen");
        listDataHeader.add("Nineteen");
        listDataHeader.add("Twenty");

        List<String> one = new ArrayList<>();
        one.add("Transcription: nèung                                  " + "                            Thai word: หนึ่ง");
        List<String> two = new ArrayList<>();
        two.add("Transcription: sŏng                                   " + "                            Thai word: สอง");
        List<String> three = new ArrayList<>();
        three.add("Transcription: săam                                  " + "                            Thai word: สาม");
        List<String> four = new ArrayList<>();
        four.add("Transcription: sèe                                    " + "                            Thai word: สี่");
        List<String> five = new ArrayList<>();
        five.add("Transcription: hâa                                    " + "                            Thai word: ห้า");
        List<String> six = new ArrayList<>();
        six.add("Transcription: hòk                                      " + "                            Thai word: หก");
        List<String> seven = new ArrayList<>();
        seven.add("Transcription: jèt                                     " + "                            Thai word: เจ็ด");
        List<String> eight = new ArrayList<>();
        eight.add("Transcription: bpàet                                    " + "                           Thai word: แปด");
        List<String> nine = new ArrayList<>();
        nine.add("Transcription: gâo                                        " + "                           Thai word: เก้า");
        List<String> ten = new ArrayList<>();
        ten.add("Transcription: sìp                                          " + "                          Thai word: สิบ");
        List<String> eleven = new ArrayList<>();
        eleven.add("Transcription: sìp èt                                    " + "                          Thai word: สิบเอ็ด");
        List<String> twelve = new ArrayList<>();
        twelve.add("Transcription: sìp sŏng                                   " + "                          Thai word: สิบสอง");
        List<String> thirteen = new ArrayList<>();
        thirteen.add("Transcription: sìp săam                                 " + "                          Thai word: สิบสาม");
        List<String> fourteen = new ArrayList<>();
        fourteen.add("Transcription: sìp sèe                                  " + "                          Thai word: สิบสี่");
        List<String> fifteen = new ArrayList<>();
        fifteen.add("Transcription: sìp hâa                                   " + "                           Thai word: สิบห้า");
        List<String> sixteen = new ArrayList<>();
        sixteen.add("Transcription: sìp hòk                                    " + "                          Thai word: สิบหก");
        List<String> seventeen = new ArrayList<>();
        seventeen.add("Transcription: sìp jèt                                  " + "                          Thai word: สิบเจ็ด");
        List<String> eighteen = new ArrayList<>();
        eighteen.add("Transcription: sìp bpàet                                 " + "                           Thai word: สิบแปด");
        List<String> nineteen = new ArrayList<>();
        nineteen.add("Transcription: sìp gâo                                    " + "                          Thai word: สิบเก้า");
        List<String> twenty = new ArrayList<>();
        twenty.add("Transcription: yêe sìp                                       " + "                          Thai word: ยี่สิบ");

        listHash.put(listDataHeader.get(0),one);
        listHash.put(listDataHeader.get(1),two);
        listHash.put(listDataHeader.get(2),three);
        listHash.put(listDataHeader.get(3),four);
        listHash.put(listDataHeader.get(4),five);
        listHash.put(listDataHeader.get(5),six);
        listHash.put(listDataHeader.get(6),seven);
        listHash.put(listDataHeader.get(7),eight);
        listHash.put(listDataHeader.get(8),nine);
        listHash.put(listDataHeader.get(9),ten);
        listHash.put(listDataHeader.get(10),eleven);
        listHash.put(listDataHeader.get(11),twelve);
        listHash.put(listDataHeader.get(12),thirteen);
        listHash.put(listDataHeader.get(13),fourteen);
        listHash.put(listDataHeader.get(14),fifteen);
        listHash.put(listDataHeader.get(15),sixteen);
        listHash.put(listDataHeader.get(16),seventeen);
        listHash.put(listDataHeader.get(17),eighteen);
        listHash.put(listDataHeader.get(18),nineteen);
        listHash.put(listDataHeader.get(19),twenty);





    }



    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        //TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }


        final Dialog dialog = new Dialog(Number.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);
        switch (position) {
            case 0:
                //Toast.makeText(this, "หนึง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n1);
                mMedia.start();
                //textData.setText("Translate: nèung              " + "                   Thai word: หนึ่ง");
                break;
            case 1:
                //Toast.makeText(this, "สอง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n2);
                mMedia.start();
                //textData.setText("Translate: sŏng              " + "                    Thai word: สอง");
                break;
            case 2:
                //Toast.makeText(this, "สาม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n3);
                mMedia.start();
                //textData.setText("Translate: săam               " + "                    Thai word: สาม");
                break;
            case 3:
                //Toast.makeText(this, "สี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n4);
                mMedia.start();
                //textData.setText("Translate: sèe                " + "                    Thai word: สี่");
                break;
            case 4:
                //Toast.makeText(this, "ห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n5);
                mMedia.start();
                //textData.setText("Translate: hâa                 " + "                   Thai word: ห้า");
                break;
            case 5:
                //Toast.makeText(this, "หก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n6);
                mMedia.start();
                //textData.setText("Translate: hòk                 " + "                   Thai word: หก");
                break;
            case 6:
                //Toast.makeText(this, "เจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n7);
                mMedia.start();
                //textData.setText("Translate: jèt                  " + "                  Thai word: เจ็ด");
                break;
            case 7:
                //Toast.makeText(this, "เแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n8);
                mMedia.start();
                //textData.setText("Translate: bpàet                " + "                  Thai word: แปด");
                break;
            case 8:
                //Toast.makeText(this, "เก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n9);
                mMedia.start();
                //textData.setText("Translate: gâo                   " + "                  Thai word: เก้า");
                break;
            case 9:
                //Toast.makeText(this, "สิบ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n10);
                mMedia.start();
                //textData.setText("Translate: sìp                    " + "                  Thai word: สิบ");
                break;
            case 10:
                //Toast.makeText(this, "สิบเอ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n11);
                mMedia.start();
                //textData.setText("Translate: sìp èt                  " + "                 Thai word: สิบเอ็ด");
                break;
            case 11:
                //Toast.makeText(this, "สิบสอง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n12);
                mMedia.start();
                //textData.setText("Translate: sìp sŏng                   " + "                 Thai word: สิบสอง");
                break;
            case 12:
                //Toast.makeText(this, "สิบสาม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n13);
                mMedia.start();
                //textData.setText("Translate: sìp săam                    " + "                 Thai word: สิบสาม");
                break;
            case 13:
                //Toast.makeText(this, "สิบสี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n14);
                mMedia.start();
                //textData.setText("Translate: sìp sèe                      " + "                 Thai word: สิบสี่");
                break;
            case 14:
                //Toast.makeText(this, "สิบห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n15);
                mMedia.start();
                //textData.setText("Translate: sìp hâa                       " + "                  Thai word: สิบห้า");
                break;
            case 15:
                //Toast.makeText(this, "สิบหก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n16);
                mMedia.start();
                //textData.setText("Translate: sìp hòk                        " + "                  Thai word: สิบหก");
                break;
            case 16:
                //Toast.makeText(this, "สิบเจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n17);
                mMedia.start();
                //textData.setText("Translate: sìp jèt                         " + "                  Thai word: สิบเจ็ด");
                break;
            case 17:
                //Toast.makeText(this, "สิบแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n18);
                mMedia.start();
                //textData.setText("Translate: sìp bpàet                        " + "                  Thai word: สิบแปด");
                break;
            case 18:
                //Toast.makeText(this, "สิบเก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n19);
                mMedia.start();
                //textData.setText("Translate: sìp gâo                           " + "                  Thai word: สิบเก้า");
                break;
            case 19:
                //Toast.makeText(this, "ยี่สิบ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n20);
                mMedia.start();
                //textData.setText("Translate: yêe sìp                            " + "                  Thai word: ยี่สิบ");
                break;*/

        }












