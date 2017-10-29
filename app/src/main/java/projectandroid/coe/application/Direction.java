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

public class Direction extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"Go straight", "Turn left", "Turn right", "Get in/on", "Get off", "Taxi",
            "Direction", "boat", "Station", "Where is the train station?", "I want to go to the train station.", "How can I get there?",
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

        listView = (ListView) findViewById(R.id.direc);
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

        final Dialog dialog = new Dialog(Direction.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_data);
        TextView textData = (TextView) dialog.findViewById(R.id.textData);

        switch (position) {
            case 0:
                //Toast.makeText(this, "ตรงไป", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr25);
                mMedia.start();
                textData.setText("dtrong-bpai                 " + "              ตรงไป");
                break;
            case 1:
                //Toast.makeText(this, "เลี้ยวซ้าย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr26);
                mMedia.start();
                textData.setText("líeow-sáai                   " + "             เลี้ยวซ้าย");
                break;
            case 2:
                //Toast.makeText(this, "เลี้ยวขวา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr27);
                mMedia.start();
                textData.setText("líeow kwăa                    " + "             เลี้ยวขวา");
                break;
            case 3:
                //Toast.makeText(this, "ขึ้น", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr28);
                mMedia.start();
                textData.setText("kêun                            " + "             ขึ้น");
                break;
            case 4:
                //Toast.makeText(this, "ลง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr29);
                mMedia.start();
                textData.setText("long                             " + "                  ลง");
                break;
            case 5:
                //Toast.makeText(this, "แท็กซี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr30);
                mMedia.start();
                textData.setText("táek-sêe                          " + "                 แท็กซี่");
                break;
            case 6:
                //Toast.makeText(this, "ปลายทาง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr31);
                mMedia.start();
                textData.setText("bplaai-taang                         " + "             ปลายทาง");
                break;
            case 7:
                //Toast.makeText(this, "เรือ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr32);
                mMedia.start();
                textData.setText("reua                                  " + "                  เรือ");
                break;
            case 8:
                //Toast.makeText(this, "สถานี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr33);
                mMedia.start();
                textData.setText("sà-tăa-nee                                 " + "             สถานี");
                break;
            case 9:
                //Toast.makeText(this, "สถานีรถไฟอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr1);
                mMedia.start();
                textData.setText("sà-tăa-nee-rót-fai-yòo-têe-năi              " + "                    สถานีรถไฟอยู่ที่ไหน");
                break;
            case 10:
                //Toast.makeText(this, "ฉันต้องการไปสถานีรถไฟ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr2);
                mMedia.start();
                textData.setText("chăn-dtông-gaan-bpai-sà-tăa-nee-rót-fai                  " + "                ฉันต้องการไปสถานีรถไฟ");
                break;
            case 11:
                //Toast.makeText(this, "ไปที่นั่นได้อย่างไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr3);
                mMedia.start();
                textData.setText("bpai-têe-nân-dâi-yàang-rai                     " + "                          ไปที่นั่นได้อย่างไร");
                break;
            case 12:
                //Toast.makeText(this, "คุณอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr4);
                mMedia.start();
                textData.setText("kun-yòo-têe-năi                               " + "                      คุณอยู่ที่ไหน");
                break;
            case 13:
                //Toast.makeText(this, "ฉันอยู่ที่...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr5);
                mMedia.start();
                textData.setText("chăn-yòo-têe                              " + "                         ฉันอยู่ที่...");
                break;
            case 14:
                //Toast.makeText(this, "ที่นี่มีชื่อว่าอะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr6);
                mMedia.start();
                textData.setText("têe-nêe-mee-chêu-wâa-à-rai                           " + "                     ที่นี่มีชื่อว่าอะไร");
                break;
            case 15:
                //Toast.makeText(this, "ป้ายรถบัสที่ใกล้ที่สุดอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr7);
                mMedia.start();
                textData.setText("bpâai-rót-bàt-têe-glâi-têe-sùt-yòo-têe-năi                 " + "                 ป้ายรถบัสที่ใกล้ที่สุดอยู่ที่ไหน");
                break;
            case 16:
                //Toast.makeText(this, "สถานีรถไฟที่ใกล้ที่สุดอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr8);
                mMedia.start();
                textData.setText("sà-tăa-nee-rót-fai-têe-glâi-yòo-têe-năi                     " + "                        สถานีรถไฟที่ใกล้ที่สุดอยู่ที่ไหน");
                break;
            case 17:
                //Toast.makeText(this, "สถานีนี้ชื่อว่าอะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr9);
                mMedia.start();
                textData.setText("sà-tăa-nee-née-chêu-wâa-à-rai                         " + "                      สถานีนี้ชื่อว่าอะไร");
                break;
            case 18:
                //Toast.makeText(this, "ฉันต้องเปลี่ยนรถที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr10);
                mMedia.start();
                textData.setText("chăn-dtông-bplìan-rót-têe-năi                         " + "                        ฉันต้องเปลี่ยนรถที่ไหน");
                break;
            case 19:
                //Toast.makeText(this, "ใช้เวลานานเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr11);
                mMedia.start();
                textData.setText("chái-way-laa-naan-tâo-rai                            "  + "                              ใช้เวลานานเท่าไร");
                break;
            case 20:
                //Toast.makeText(this, "ประมาณ...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr12);
                mMedia.start();
                textData.setText("bprà-maan                                           " + "                            ประมาณ...");
                break;
            case 21:
                //Toast.makeText(this, "ซื้อตั๋วได้ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr13);
                mMedia.start();
                textData.setText("séu-dtŭa-dâi-têe-năi                                   " + "                        ซื้อตั๋วได้ที่ไหน");
                break;
            case 22:
                //Toast.makeText(this, "ฉันอยากซื้อตั๋วไป...", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr14);
                mMedia.start();
                textData.setText("chăn-yàak-séu-dtŭa-bpai                          " + "                ฉันอยากซื้อตั๋วไป...");
                break;
            case 23:
                //Toast.makeText(this, "ตั๋วราคาเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr15);
                mMedia.start();
                textData.setText("dtŭa-raa-kaa-tâo-rai                  " + "                     ตั๋วราคาเท่าไร");
                break;
            case 24:
                //Toast.makeText(this, "ตั๋วราคา...บาท", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr16);
                mMedia.start();
                textData.setText("dtŭa-raa-kaa-bàat                        " + "                   ตั๋วราคา...บาท");
                break;
            case 25:
                //Toast.makeText(this, "รถบัสมีแอร์ไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr17);
                mMedia.start();
                textData.setText("rót-bàt-mee-ae-măi                            " + "                    รถบัสมีแอร์ไหม");
                break;
            case 26:
                //Toast.makeText(this, "รถบัสมีห้องน้ำไหม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr18);
                mMedia.start();
                textData.setText("rót-bàt-mee-hông-náam-măi                       " + "                   รถบัสมีห้องน้ำไหม");
                break;
            case 27:
                //Toast.makeText(this, "รถไฟออกตอนกี่โมง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr19);
                mMedia.start();
                textData.setText("rót-fai-òk-dtor-gèe-mohng                        " + "                     รถไฟออกตอนกี่โมง");
                break;
            case 28:
                //Toast.makeText(this, "รถไฟถึงตอนกี่โมง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr20);
                mMedia.start();
                textData.setText("rót-fai-tĕun-ggèe-mohng                          " + "                รถไฟถึงตอนกี่โมง");
                break;
            case 29:
                //Toast.makeText(this, "จอดที่นี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr21);
                mMedia.start();
                textData.setText("jòt-têe-nêe                                      " + "                       จอดที่นี่");
                break;
            case 30:
                //Toast.makeText(this, "ใช้มิเตอร์ด้วย", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr22);
                mMedia.start();
                textData.setText("chái-mí-dtêr-dûay                                " + "                    ใช้มิเตอร์ด้วย");
                break;
            case 31:
                //Toast.makeText(this, "พวกเราอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Direction.this, R.raw.tr23);
                mMedia.start();
                textData.setText("pûak-rao-yòo-têe-năi                               " + "                 พวกเราอยู่ที่ไหน");
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
    }
}
