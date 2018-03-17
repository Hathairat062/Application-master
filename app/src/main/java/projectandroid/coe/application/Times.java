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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Times and Date");
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);



        //listView = (ListView) findViewById(R.id.times);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        //listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener(this);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (groupPosition) {
                    case 0:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t1);
                        mMedia.start();
                        break;
                    case 1:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t2);
                        mMedia.start();
                        break;
                    case 2:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t3);
                        mMedia.start();
                        break;
                    case 3:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t4);
                        mMedia.start();
                        break;
                    case 4:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t5);
                        mMedia.start();
                        break;
                    case 5:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t6);
                        mMedia.start();
                        break;
                    case 6:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t7);
                        mMedia.start();
                        break;
                    case 7:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t8);
                        mMedia.start();
                        break;
                    case 8:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t9);
                        mMedia.start();
                        break;
                    case 9:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t10);
                        mMedia.start();
                        break;
                    case 10:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t11);
                        mMedia.start();
                        break;
                    case 11:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t12);
                        mMedia.start();
                        break;
                    case 12:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t13);
                        mMedia.start();
                        break;
                    case 13:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t14);
                        mMedia.start();
                        break;
                    case 14:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t15);
                        mMedia.start();
                        break;
                    case 15:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t16);
                        mMedia.start();
                        break;
                    case 16:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t17);
                        mMedia.start();
                        break;
                    case 17:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t18);
                        mMedia.start();
                        break;
                    case 18:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t19);
                        mMedia.start();
                        break;
                    case 19:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t20);
                        mMedia.start();
                        break;
                    case 20:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t21);
                        mMedia.start();
                        break;
                    case 21:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t22);
                        mMedia.start();
                        break;
                    case 22:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t23);
                        mMedia.start();
                        break;
                    case 23:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t24);
                        mMedia.start();
                        break;
                    case 24:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t25);
                        mMedia.start();
                        break;
                    case 25:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t26);
                        mMedia.start();
                        break;
                    case 26:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t27);
                        mMedia.start();
                        break;
                    case 27:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t28);
                        mMedia.start();
                        break;
                    case 28:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t29);
                        mMedia.start();
                        break;
                    case 29:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t30);
                        mMedia.start();
                        break;
                    case 30:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t31);
                        mMedia.start();
                        break;
                    case 31:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t32);
                        mMedia.start();
                        break;
                    case 32:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t33);
                        mMedia.start();
                        break;
                    case 33:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t34);
                        mMedia.start();
                        break;
                    case 34:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t35);
                        mMedia.start();
                        break;
                    case 35:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t36);
                        mMedia.start();
                        break;
                    case 36:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t37);
                        mMedia.start();
                        break;
                    case 37:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t38);
                        mMedia.start();
                        break;
                    case 38:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t39);
                        mMedia.start();
                        break;
                    case 39:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t40);
                        mMedia.start();
                        break;
                    case 40:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t41);
                        mMedia.start();
                        break;
                    case 41:
                        mMedia = MediaPlayer.create(Times.this, R.raw.t42);
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
        listDataHeader.add("Morning");
        listDataHeader.add("Noon");
        listDataHeader.add("Afternoon");
        listDataHeader.add("Evening");
        listDataHeader.add("Night");
        listDataHeader.add("Midnight");
        listDataHeader.add("Day");
        listDataHeader.add("Hour");
        listDataHeader.add("Minute");
        listDataHeader.add("Second");
        listDataHeader.add("What time is it?");
        listDataHeader.add("What day is today?");
        listDataHeader.add("What is the date today?");
        listDataHeader.add("What time do you get up?");
        listDataHeader.add("When is your birthday?");
        listDataHeader.add("I got up early as usual.");
        listDataHeader.add("What time do you go home?");
        listDataHeader.add("I have class tomorrow.");
        listDataHeader.add("Can you tell me the time?");
        listDataHeader.add("I was born on October 10th, 1995");
        listDataHeader.add("It's Monday today.");


        List<String> Monday = new ArrayList<>();
        Monday.add("Transcription:  wan-jan                     " + "                      Thai word:  วันจันทร์");
        List<String> Tuesday = new ArrayList<>();
        Tuesday.add("Transcription:  wan-ang-kaan               " + "                      Thai word:  วันอังคาร");
        List<String> Wednesday = new ArrayList<>();
        Wednesday.add("Transcription:  wan-pút                  " + "                      Thai word:  วันพุธ");
        List<String> Thursday = new ArrayList<>();
        Thursday.add("Transcription:  wan-pá-réu-hàt-sà-bor-dee                  " + "                                        Thai word:  วันพฤหัสบดี");
        List<String> Friday = new ArrayList<>();
        Friday.add("Transcription:  wan-sùk                     " + "                      Thai word:  วันศุกร์");
        List<String> Saturday = new ArrayList<>();
        Saturday.add("Transcription:  wan-săo                   " + "                      Thai word:  วันเสาร์");
        List<String> Sunday = new ArrayList<>();
        Sunday.add("Transcription:  wan-aa-tít                  " + "                      Thai word:  วันอาทิตย์");
        List<String> Weekday = new ArrayList<>();
        Weekday.add("Transcription:  wan-tam-ngaan              " + "                      Thai word:  วันทำงาน");
        List<String> Weekend = new ArrayList<>();
        Weekend.add("Transcription:  wan-săo-aa-tít             " + "                      Thai word:  วันเสาร์-อาทิตย์");
        List<String> January = new ArrayList<>();
        January.add("Transcription:  deuan-mók-gà-raa-kom                         " + "                                        Thai word: เดือนมกราคม");
        List<String> February = new ArrayList<>();
        February.add("Transcription:  deuan-gum-paa-pan            " + "                   Thai word:  เดือนกุมภาพันธ์");
        List<String> March = new ArrayList<>();
        March.add("Transcription:  deuan-mee-naa-kom             " + "                     Thai word:  เดือนมีนาคม");
        List<String> April = new ArrayList<>();
        April.add("Transcription:  deuan-may-săa-yon            " + "                     Thai word:  เดือนเมษายน");
        List<String> May = new ArrayList<>();
        May.add("Transcription:  deuan-préut-sà-paa-kom                            " + "                                        Thai word:  เดือนพฤษภาคม");
        List<String> June = new ArrayList<>();
        June.add("Transcription:  deuan-mí-tù-naa-yon            " + "                     Thai word:  เดือนมิถุนายน");
        List<String> July = new ArrayList<>();
        July.add("Transcription:  deuan-gà-rá-gà-daa-kom                           " + "                                        Thai word:  เดือนกรกฎาคม");
        List<String> August = new ArrayList<>();
        August.add("Transcription:  deuan-sĭng-hăa-kom           " + "                     Thai word:  เดือนสิงหาคม");
        List<String> September = new ArrayList<>();
        September.add("Transcription:  deuan-gan-yaa-yon          " + "                    Thai word:  เดือนกันยายน");
        List<String> October = new ArrayList<>();
        October.add("Transcription:  deuan-dtù-laa-kom           " + "                    Thai word:  เดือนตุลาคม");
        List<String> November = new ArrayList<>();
        November.add("Transcription:  deuan-préut-sà-jì-gaa-yon                     " + "                                        Thai word:  เดือนพฤศจิกายน");
        List<String> December = new ArrayList<>();
        December.add("Transcription:  deuan-tan-waa-kom                 " + "             Thai word:  เดือนธันวาคม");
        List<String> Morning = new ArrayList<>();
        Morning.add("Transcription:  cháo                             " + "             Thai word:  เช้า");
        List<String> Noon = new ArrayList<>();
        Noon.add("Transcription:  tîang-dtrong                        " + "             Thai word:  เที่ยงตรง");
        List<String> Afternoon = new ArrayList<>();
        Afternoon.add("Transcription:  bàai                            " + "             Thai word:  บ่าย");
        List<String> Evening = new ArrayList<>();
        Evening.add("Transcription:  yen                               " + "             Thai word:  เย็น");
        List<String> Night = new ArrayList<>();
        Night.add("Transcription:  glaang-keun                         " + "             Thai word:  กลางคืน");
        List<String> Midnight = new ArrayList<>();
        Midnight.add("Transcription:  tîang-keun                       " + "             Thai word:  เที่ยงคืน");
        List<String> Day = new ArrayList<>();
        Day.add("Transcription:  wan                                   " + "             Thai word:  วัน");
        List<String> Hour = new ArrayList<>();
        Hour.add("Transcription:  chûa-mohng                           " + "             Thai word:  ชั่วโมง");
        List<String> Minute = new ArrayList<>();
        Minute.add("Transcription:  naa-tee                            " + "             Thai word:  นาที");
        List<String> Second = new ArrayList<>();
        Second.add("Transcription:  wí-naa-tee                         " + "             Thai word:  วินาที");
        List<String> What1 = new ArrayList<>();
        What1.add("Transcription:  gèe-mohng-láew                         " + "             Thai word:  กี่โมงแล้ว");
        List<String> What2 = new ArrayList<>();
        What2.add("Transcription:  wan-née-wan-à-rai                         " + "             Thai word:  วันนี้วันอะไร");
        List<String> What3 = new ArrayList<>();
        What3.add("Transcription:  wan-née-wan-têe-tâo-rai                         " + "                              Thai word:  วันนี้วันที่เท่าไร");
        List<String> What4 = new ArrayList<>();
        What4.add("Transcription:  dtèun-non-gèe-mohng                        " + "                                Thai word:  ตื่นนอนกี่โมง");
        List<String> When = new ArrayList<>();
        When.add("Transcription:  kun-gèrt-wan-têe-tâo-rai                         " + "                                          Thai word:  คุณเกิดวันที่เท่าไร");
        List<String> Ig = new ArrayList<>();
        Ig.add("Transcription:  chăn-dtèun-non-dton-cháo-sà-mĕr                         " + "                                   Thai word:  ฉันตื่นนอนตอนเช้าเสมอ");
        List<String> What6 = new ArrayList<>();
        What6.add("Transcription:  kun-glàp-bâan-gèe-mohng                        " + "                                          Thai word:  คุณกลับบ้านกี่โมง");
        List<String> Ih = new ArrayList<>();
        Ih.add("Transcription:  chăn-mee-rian-prûng-née                         " + "                                             Thai word:  ฉันมีเรียนพรุ่งนี้");
        List<String> Can = new ArrayList<>();
        Can.add("Transcription: kun-bòk-chăn-dâi-măi-wâa-gèe-mohng-láew                         " + "                                           Thai word:  คุณบอกฉันได้ไหมว่ากี่โมงแล้ว");
        List<String> Iw = new ArrayList<>();
        Iw.add("Transcription:  chăn-gèrt-wan-têe-sìp-dtù-laa-kom-por-sŏr-sŏng-pan-hâa-rói-săam-sìp-bpàet                       " + "                           Thai word:  ฉันเกิดวันที่ 10 ตุลาคม พ.ศ.2538");
        List<String> It = new ArrayList<>();
        It.add("Transcription:  wan-née-bpen-wan-jan                         " + "                                              Thai word:  วันนี้เป็นวันจันทร์");




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
        listHash.put(listDataHeader.get(21),Morning);
        listHash.put(listDataHeader.get(22),Noon);
        listHash.put(listDataHeader.get(23),Afternoon);
        listHash.put(listDataHeader.get(24),Evening);
        listHash.put(listDataHeader.get(25),Night);
        listHash.put(listDataHeader.get(26),Midnight);
        listHash.put(listDataHeader.get(27),Day);
        listHash.put(listDataHeader.get(28),Hour);
        listHash.put(listDataHeader.get(29),Minute);
        listHash.put(listDataHeader.get(30),Second);
        listHash.put(listDataHeader.get(31),What1);
        listHash.put(listDataHeader.get(32),What2);
        listHash.put(listDataHeader.get(33),What3);
        listHash.put(listDataHeader.get(34),What4);
        listHash.put(listDataHeader.get(35),When);
        listHash.put(listDataHeader.get(36),Ig);
        listHash.put(listDataHeader.get(37),What6);
        listHash.put(listDataHeader.get(38),Ih);
        listHash.put(listDataHeader.get(39),Can);
        listHash.put(listDataHeader.get(40),Iw);
        listHash.put(listDataHeader.get(41),It);




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




