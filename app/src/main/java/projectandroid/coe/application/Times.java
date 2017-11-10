package projectandroid.coe.application;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Times extends AppCompatActivity  {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    //ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Weekday", "Weekend",
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);

        listView = (ExpandableListView)findViewById(R.id.times);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);


        //listView = (ListView) findViewById(R.id.times);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Monday");
        listDataHeader.add("Tuesday");
        listDataHeader.add("Wednesday");
        listDataHeader.add("Thursday");
        listDataHeader.add("Friday");
        listDataHeader.add("Saturday");
        listDataHeader.add("Sunday");
        listDataHeader.add("Weekday");
        listDataHeader.add("Weekend");
        listDataHeader.add("January");
        listDataHeader.add("February");
        listDataHeader.add("March");
        listDataHeader.add("April");
        listDataHeader.add("May");
        listDataHeader.add("June");
        listDataHeader.add("July");
        listDataHeader.add("August");
        listDataHeader.add("September");
        listDataHeader.add("October");
        listDataHeader.add("November");
        listDataHeader.add("December");

        List<String> Monday = new ArrayList<>();
        Monday.add("Transcription:   wan-jan                     " + "                      Thai word:  วันจันทร์");
        List<String> Tuesday = new ArrayList<>();
        Tuesday.add("Transcription:   wan-ang-kaan               " + "                      Thai word:  วันอังคาร");
        List<String> Wednesday = new ArrayList<>();
        Wednesday.add("Transcription:   wan-pút                  " + "                      Thai word:  วันพุธ");
        List<String> Thursday = new ArrayList<>();
        Thursday.add("Transcription:   wan-pá-réu-hàt-sà-bor-dee       " + "                    Thai word:  วันพฤหัสบดี");
        List<String> Friday = new ArrayList<>();
        Friday.add("Transcription:   wan-sùk                     " + "                      Thai word:  วันศุกร์");
        List<String> Saturday = new ArrayList<>();
        Saturday.add("Transcription:   wan-săo                   " + "                      Thai word:  วันเสาร์");
        List<String> Sunday = new ArrayList<>();
        Sunday.add("Transcription:   wan-aa-tít                  " + "                      Thai word:  วันอาทิตย์");
        List<String> Weekday = new ArrayList<>();
        Weekday.add("Transcription:   wan-tam-ngaan              " + "                      Thai word:  วันทำงาน");
        List<String> Weekend = new ArrayList<>();
        Weekend.add("Transcription:   wan-săo-aa-tít             " + "                      Thai word:   วันเสาร์-อาทิตย์");
        List<String> January = new ArrayList<>();
        January.add("Transcription:   deuan-mók-gà-raa-kom         " + "                      Thai word:  เดือนมกราคม");
        List<String> February = new ArrayList<>();
        February.add("Transcription:   deuan-gum-paa-pan            " + "                   Thai word:   เดือนกุมภาพันธ์");
        List<String> March = new ArrayList<>();
        March.add("Transcription:   deuan-mee-naa-kom             " + "                     Thai word:   เดือนมีนาคม");
        List<String> April = new ArrayList<>();
        April.add("Transcription:    deuan-may-săa-yon            " + "                     Thai word:   เดือนเมษายน");
        List<String> May = new ArrayList<>();
        May.add("Transcription:   deuan-préut-sà-paa-kom          " + "                     Thai word:   เดือนพฤษภาคม");
        List<String> June = new ArrayList<>();
        June.add("Transcription:   deuan-mí-tù-naa-yon            " + "                     Thai word:   เดือนมิถุนายน");
        List<String> July = new ArrayList<>();
        July.add("Transcription:   deuan-gà-rá-gà-daa-kom         " + "                     Thai word:   เดือนกรกฎาคม");
        List<String> August = new ArrayList<>();
        August.add("Transcription:   deuan-sĭng-hăa-kom           " + "                     Thai word:   เดือนสิงหาคม");
        List<String> September = new ArrayList<>();
        September.add("Transcription:   deuan-gan-yaa-yon          " + "                    Thai word:   เดือนกันยายน");
        List<String> October = new ArrayList<>();
        October.add("Transcription:    deuan-dtù-laa-kom           " + "                    Thai word:   เดือนตุลาคม");
        List<String> November = new ArrayList<>();
        November.add("Transcription:    deuan-préut-sà-jì-gaa-yon         " + "             Thai word:   เดือนพฤศจิกายน");
        List<String> December = new ArrayList<>();
        December.add("Transcription:    deuan-tan-waa-kom                 " + "             Thai word:   เดือนธันวาคม");

        listHash.put(listDataHeader.get(0),Monday);
        listHash.put(listDataHeader.get(1),Tuesday);
        listHash.put(listDataHeader.get(2),Wednesday);
        listHash.put(listDataHeader.get(3),Thursday);
        listHash.put(listDataHeader.get(4),Friday);
        listHash.put(listDataHeader.get(5),Saturday);
        listHash.put(listDataHeader.get(6),Sunday);
        listHash.put(listDataHeader.get(7),Weekday);
        listHash.put(listDataHeader.get(8),Weekend);
        listHash.put(listDataHeader.get(9),January);
        listHash.put(listDataHeader.get(10),February);
        listHash.put(listDataHeader.get(11),March);
        listHash.put(listDataHeader.get(12),April);
        listHash.put(listDataHeader.get(13),May);
        listHash.put(listDataHeader.get(14),June);
        listHash.put(listDataHeader.get(15),July);
        listHash.put(listDataHeader.get(16),August);
        listHash.put(listDataHeader.get(17),September);
        listHash.put(listDataHeader.get(18),October);
        listHash.put(listDataHeader.get(19),November);
        listHash.put(listDataHeader.get(20),December);




    }


   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }

        final Dialog dialog = new Dialog(Times.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView)dialog.findViewById(R.id.textData);
        switch (position) {
            case 0:
                //Toast.makeText(this, "วันจันทร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t1);
                mMedia.start();
                textData.setText("Translate:                                 wan-jan                     " + "                 Thai word:                                                 วันจันทร์");
                break;
            case  1:
                //Toast.makeText(this, "วันอังคาร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t2);
                mMedia.start();
                textData.setText("Translate:                                 wan-ang-kaan      " + "            Thai word:                                                  วันอังคาร");
                break;
            case  2:
                //Toast.makeText(this, "วันพุธ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t3);
                mMedia.start();
                textData.setText("Translate:                                 wan-pút                 " + "                 Thai word:                                                  วันพุธ");
                break;
            case  3:
                //Toast.makeText(this, "วันพฤหัสบดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t4);
                mMedia.start();
                textData.setText("Translate:                                  wan-pá-réu-hàt-sà-bor-dee       " + "                                         Thai word:                                  วันพฤหัสบดี");
                break;
            case  4:
                //Toast.makeText(this, "วันศุกร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t5);
                mMedia.start();
                textData.setText("Translate:                                   wan-sùk                  " + "                  Thai word:                                                     วันศุกร์");
                break;
            case  5:
                //Toast.makeText(this, "วันเสาร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t6);
                mMedia.start();
                textData.setText("Translate:                                    wan-săo                   " + "                  Thai word:                                                 วันเสาร์");
                break;
            case  6:
                //Toast.makeText(this, "วันอาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t7);
                mMedia.start();
                textData.setText("Translate:                                    wan-aa-tít                 " + "                  Thai word:                                                  วันอาทิตย์");
                break;
            case  7:
                //Toast.makeText(this, "วันทำงาน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t8);
                mMedia.start();
                textData.setText("Translate:                                    wan-tam-ngaan                " + "                 Thai word:                                                วันทำงาน");
                break;
            case  8:
                //Toast.makeText(this, "วันเสาร์-อาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t9);
                mMedia.start();
                textData.setText("Translate:                                    wan-săo-aa-tít               " + "                  Thai word:                                               วันเสาร์-อาทิตย์");
                break;
            case  9:
                //Toast.makeText(this, "เดือนมกราคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t10);
                mMedia.start();
                textData.setText("Translate:                                    deuan-mók-gà-raa-kom         " + "                   Thai word:                                              เดือนมกราคม");
                break;
            case  10:
                //Toast.makeText(this, "เดือนกุมภาพันธ์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t11);
                mMedia.start();
                textData.setText("Translate:                                    deuan-gum-paa-pan             " + "                  Thai word:                                              เดือนกุมภาพันธ์");
                break;
            case  11:
                //Toast.makeText(this, "เดือนมีนาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t12);
                mMedia.start();
                textData.setText("Translate:                                    deuan-mee-naa-kom             " + "                   Thai word:                                            เดือนมีนาคม");
                break;
            case  12:
                //Toast.makeText(this, "เดือนเมษายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t13);
                mMedia.start();
                textData.setText("Translate:                                    deuan-may-săa-yon              " + "                  Thai word:                                            เดือนเมษายน");
                break;
            case  13:
                //Toast.makeText(this, "เดือนพฤษภาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t14);
                mMedia.start();
                textData.setText("Translate:                                     deuan-préut-sà-paa-kom         " + "                  Thai word:                                          เดือนพฤษภาคม");
                break;
            case  14:
                //Toast.makeText(this, "เดือนมิถุนายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t15);
                mMedia.start();
                textData.setText("Translate:                                      deuan-mí-tù-naa-yon             " + "                  Thai word:                                           เดือนมิถุนายน");
                break;
            case  15:
                //Toast.makeText(this, "เดือนกรกฎาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t16);
                mMedia.start();
                textData.setText("Translate:                                       deuan-gà-rá-gà-daa-kom           " + "                  Thai word:                                          เดือนกรกฎาคม");
                break;
            case  16:
                //Toast.makeText(this, "เดือนสิงหาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t17);
                mMedia.start();
                textData.setText("Translate:                                         deuan-sĭng-hăa-kom                " + "                  Thai word:                                      เดือนสิงหาคม");
                break;
            case  17:
                //Toast.makeText(this, "เดือนกันยายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t18);
                mMedia.start();
                textData.setText("Translate:                                          deuan-gan-yaa-yon                 " + "                  Thai word:                                      เดือนกันยายน");
                break;
            case  18:
                //Toast.makeText(this, "เดือนเดือนตุลาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t19);
                mMedia.start();
                textData.setText("Translate:                                          deuan-dtù-laa-kom                     " + "              Thai word:                                      เดือนตุลาคม");
                break;
            case  19:
                //Toast.makeText(this, "เดือนพฤศจิกายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t20);
                mMedia.start();
                textData.setText("Translate:                                           deuan-préut-sà-jì-gaa-yon               " + "             Thai word:                                    เดือนพฤศจิกายน");
                break;
            case  20:
                //Toast.makeText(this, "เดือนธันวาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t21);
                mMedia.start();
                textData.setText("Translate:                                              deuan-tan-waa-kom                       " + "               Thai word:                               เดือนธันวาคม");
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
    }*/


}




