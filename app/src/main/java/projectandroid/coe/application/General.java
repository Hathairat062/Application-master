package projectandroid.coe.application;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class General extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
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

        listView = (ListView) findViewById(R.id.general);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);


    }


    @Override
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
                textData.setText("sà-wàt-dee                     " + "                 สวัสดี");
                break;
            case 1:
                //Toast.makeText(this, "สวัสดีตอนเช้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge2);
                mMedia.start();
                textData.setText("sà-wàt-dee-dton-cháo                     " + "                 สวัสดีตอนเช้า");
                break;
            case 2:
                //Toast.makeText(this, "สวัสดีตอนบ่าย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge3);
                mMedia.start();
                textData.setText("sà-wàt-dee-dton-bàai                     " + "                 สวัสดีตอนบ่าย");
                break;
            case 3:
                //Toast.makeText(this, "สวัสดีตอนเย็น", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge31);
                mMedia.start();
                textData.setText("sà-wàt-dee-dton-yen                     " + "                 สวัสดีตอนเย็น");
                break;
            case 4:
                //Toast.makeText(this, "ราตรีสวัสดิ์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge5);
                mMedia.start();
                textData.setText("raa-dtree sà-wàt                     " + "                 ราตรีสวัสดิ์");
                break;
            case 5:
                //Toast.makeText(this, "สบายดีไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge6);
                mMedia.start();
                textData.setText("sà-baai-dee-măi                     " + "                 สบายดีไหม");
                break;
            case 6:
                //Toast.makeText(this, "สบายดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge7);
                mMedia.start();
                textData.setText("sà-baai-dee                     " + "                 สบายดี");
                break;
            case 7:
                //Toast.makeText(this, "ขอบใจ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge8);
                mMedia.start();
                textData.setText("kòp jai                     " + "                 ขอบใจ");
                break;
            case 8:
                //Toast.makeText(this, "ขอบคุณ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge9);
                mMedia.start();
                textData.setText("kòp kun                    " + "                 ขอบคุณ");
                break;
            case 9:
                //Toast.makeText(this, "ฉันขอโทษ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge10);
                mMedia.start();
                textData.setText("chăn-kŏr-tôht                     " + "                 ฉันขอโทษ");
                break;
            case 10:
                //Toast.makeText(this, "ลาก่อน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge11);
                mMedia.start();
                textData.setText("laa gòn                     " + "                 ลาก่อน");
                break;
            case 11:
                //Toast.makeText(this, "ไม่เป็นไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge12);
                mMedia.start();
                textData.setText("mâi-bpen-rai                    " + "                 ไม่เป็นไร");
                break;
            case 12:
                //Toast.makeText(this, "คุณพูดภาษาอังกฤษได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge13);
                mMedia.start();
                textData.setText("kun-pôot-paa-săa ang-grìt-dâi-măi                    " + "                 คุณพูดภาษาอังกฤษได้ไหม");
                break;
            case 13:
                //Toast.makeText(this, "คุณพูดภาษาไทยได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge14);
                mMedia.start();
                textData.setText("kun-pôot-paa-săa-tai-dâi-măi                    " + "                 คุณพูดภาษาไทยได้ไหม");
                break;
            case 14:
                //Toast.makeText(this, "ได้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge15);
                mMedia.start();
                textData.setText("dâi                    " + "                 ได้");
                break;
            case 15:
                //Toast.makeText(this, "ไม่ได้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge16);
                mMedia.start();
                textData.setText("mâi-dâi                    " + "                 ไม่ได้");
                break;
            case 16:
                //Toast.makeText(this, "ไม่เข้าใจ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge17);
                mMedia.start();
                textData.setText("mâi-kâo-jai                    " + "                 ไม่เข้าใจ");
                break;
            case 17:
                //Toast.makeText(this, "พูดช้าๆหน่อยได้ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge18);
                mMedia.start();
                textData.setText("pôot-cháa-cháa-nòi-dâi-măi                     " + "                 พูดช้าๆหน่อยได้ไหม");
                break;
            case 18:
                //Toast.makeText(this, "ยินดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge19);
                mMedia.start();
                textData.setText("yin-dee                     " + "                 ยินดี");
                break;
            case 19:
                //Toast.makeText(this, "ใช่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge20);
                mMedia.start();
                textData.setText("châi                     " + "                 ใช่");
                break;
            case 20:
                //Toast.makeText(this, "ไม่ใช่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge21);
                mMedia.start();
                textData.setText("mâi-châi                     " + "                 ไม่ใช่");
                break;
            case 21:
                //Toast.makeText(this, "โอเค", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge32);
                mMedia.start();
                textData.setText("oh-kay                     " + "                 โอเค");
                break;
            case 22:
                //Toast.makeText(this, "ถูก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge22);
                mMedia.start();
                textData.setText("tòok                     " + "                 ถูก");
                break;
            case 23:
                //Toast.makeText(this, "ผิด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge23);
                mMedia.start();
                textData.setText("pìt                     " + "                 ผิด");
                break;
            case 24:
                //Toast.makeText(this, "ขอโทษ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge24);
                mMedia.start();
                textData.setText("kŏr-tôht                     " + "                 ขอโทษ");
                break;
            case 25:
                //Toast.makeText(this, "อ๋อเข้าใจแล้ว", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge25);
                mMedia.start();
                textData.setText("ŏr-kâo-jai-láew                     " + "                 อ๋อเข้าใจแล้ว");
                break;
            case 26:
                //Toast.makeText(this, "ไม่รู้", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge26);
                mMedia.start();
                textData.setText("mâi-róo                     " + "                ไม่รู้");
                break;
            case 27:
                //Toast.makeText(this, "ไม่มีปัญหา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge27);
                mMedia.start();
                textData.setText("mâi-mee-bpan-hăa                     " + "                 ไม่มีปัญหา");
                break;
            case 28:
                //Toast.makeText(this, "โชคดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge28);
                mMedia.start();
                textData.setText("chôhk-dee                     " + "                 โชคดี");
                break;
            case 29:
                //Toast.makeText(this, "ดูแลตัวเองด้วย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge29);
                mMedia.start();
                textData.setText("doo-lae-dtua-ayng-dûay                    " + "                 ดูแลตัวเองด้วย");
                break;
            case 30:
                //Toast.makeText(this, "กรุณา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(General.this, R.raw.ge30);
                mMedia.start();
                textData.setText("gà-rú-naa                     " + "                 กรุณา");
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
    }


}


