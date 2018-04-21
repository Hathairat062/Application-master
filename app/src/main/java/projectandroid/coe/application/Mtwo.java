package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Mtwo extends AppCompatActivity {

    private Button qu[] = new Button[4];
    private Button an[] = new Button[4];
    private String selectanswer = "Not seclect";
    private String selectquestion = "Not select";
    private int selectl = 0,selectr = 0;
    private int step=0;
    private Button rem[] = new Button[2];
    private int numberbutton = 4;
    private int numradom=0,numselectoff=0;
    private int score=0,totalscore=0;

    private String qusandans[][] = {
            {"ไก่","ch"},
            {"แมว","cat"},
            {"ช้าง","el"},
            {"ม้า","ho"},
            {"งู","sn"},
            {"นก", "br"},
            {"เสือ", "ti"},
            {"ลิง","mo"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtwo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar30);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Match words");
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);


        //question
        qu[0] = (Button) findViewById(R.id.button15);
        qu[1] = (Button) findViewById(R.id.button18);
        qu[2] = (Button) findViewById(R.id.button20);
        qu[3] = (Button) findViewById(R.id.button22);

        //Answer
        an[0] = (Button) findViewById(R.id.button16);
        an[1] = (Button) findViewById(R.id.button17);
        an[2] = (Button) findViewById(R.id.button19);
        an[3] = (Button) findViewById(R.id.button21);

        numradom = qusandans.length;
        ArrayList<Integer> numberradomarrayqu = new ArrayList<>();
        ArrayList<Integer> numberradomarrayan = new ArrayList<>();
        Random randomqu = new Random();
        Random randoman = new Random();
        int getindexqu,getindexan;
        int randomNumqu,randomNuman;

        totalscore=numberbutton*2;
        for(int i=0;i<numradom;i++){
            numberradomarrayqu.add(i);
        }

        for(int i=0;i<numberbutton;i++){
            numberradomarrayan.add(i);
        }

        for (int i=0;i<numberbutton;i++) {
            randomNumqu = randomqu.nextInt(numberradomarrayqu.size());
            getindexqu = numberradomarrayqu.get(randomNumqu);
            qu[i].setText(qusandans[getindexqu][0]);

            randomNuman = randoman.nextInt(numberradomarrayan.size());
            getindexan = numberradomarrayan.get(randomNuman);
            an[getindexan].setText(qusandans[getindexqu][1]);

            numberradomarrayqu.remove(randomNumqu);
            numberradomarrayan.remove(randomNuman);
        }

    }

    public void checkAnswer(View view) {
        //Get pushed button
        Button answer = (Button) findViewById(view.getId());
        String btnText = answer.getText().toString();

        if(step == 0)
            rem[0] = (Button) findViewById(view.getId());
        else
            rem[1] = (Button) findViewById(view.getId());

        if( view.getId() == R.id.button15 || view.getId() == R.id.button18 || view.getId() == R.id.button20 || view.getId() == R.id.button22 ){
            selectquestion = btnText;
            selectl = 1;
            answer.setBackgroundColor(Color.parseColor("#fff500"));
            step++;
        }
        if( view.getId() == R.id.button16 || view.getId() == R.id.button17 || view.getId() == R.id.button19 || view.getId() == R.id.button21 ){
            selectanswer = btnText;
            for(int i=0;i<numradom;i++){
                if(selectanswer.equals(qusandans[i][1]))
                    selectanswer = qusandans[i][0];
            }
            answer.setBackgroundColor(Color.parseColor("#fff500"));
            selectr = 1;
            step++;
        }

        String alertTitle;
        if(selectr == 1 && selectl == 1 && step == 2) {
            if (selectquestion.equals(selectanswer)) {
                //Correct!
                alertTitle = "Score !";
                Toast.makeText(getApplication(), alertTitle,
                        Toast.LENGTH_LONG).show();
                rem[0].setBackgroundColor(Color.GREEN);
                rem[1].setBackgroundColor(Color.GREEN);
                rem[0].setEnabled(false);
                rem[1].setEnabled(false);
                score+=2;
                numselectoff++;
                if(numselectoff==numberbutton){
                    AlertDialog.Builder builber = new AlertDialog.Builder(this);
                    builber.setTitle("Score");
                    builber.setMessage(score+"/"+totalscore);
                    builber.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    builber.setCancelable(false);
                    builber.show();
                }
            } else {
                //Wrong!
                alertTitle = "Wrong!";
                Toast.makeText(getApplication(), alertTitle,
                        Toast.LENGTH_LONG).show();
                score-=1;
                rem[0].setBackgroundColor(Color.parseColor("#d6d7d7"));
                rem[1].setBackgroundColor(Color.parseColor("#d6d7d7"));
            }
            rem[0] = null;
            rem[1] = null;
            selectr = 0;
            selectl = 0;
            step = 0;
        }
        else {
            if (step == 2) {
                rem[0].setBackgroundColor(Color.parseColor("#d6d7d7"));
                rem[1].setBackgroundColor(Color.parseColor("#d6d7d7"));
                step = 0;
                rem[0] = null;
                rem[1] = null;
            }
        }
    }
}
