package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ttrans extends AppCompatActivity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;


    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 10;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();
    String quizData[][] = {
            //{"number", "right answer", "choice1", choice2", "choice3"}
            {"  kŏn-sòng-muan-chon                 " + "                ขนส่งมวลชน", "mass transit", "bus terminals", "special express", "express way"},
            {"  rót-fai-dtâi-din                   " + "               รถไฟใต้ดิน", "underground/subway", "sky/electric train", "truck/lorry", "tricycle"},
            {"  taang-dùan                         " + "              ทางด่วน", "express way", "highway", "pedestrian bridge", "footpath/pavement",},
            {"  gaan-jà-raa-jon-dtìt-kàt/rót-dtìt           " + "                                         การจราจรติดขัด/รถติด", "traffic jam", "traffic sign", "bus No.", "all the way"},
            {"  rót-jàk-grà-yaan-yon               " + "             รถจักรยานยนต์", "motorcycle/motorbike", "bicycle/bike", "tricycle", "truck/lorry"},
            {"  rót-fai-kwaam-reo-sŏong            "  + "            รถไฟความเร็วสูง", "high-speed train/high-speed rail", "sky/electric train", "underground/subway", "Train station/bus station"},
            {"  sà-năam-bin                        " + "             สนามบิน", "airport", "pedestrian bridge", "bus stop", "sky/electric train"},
            {"  sà-paan-dern-kâam                   " + "             สะพานเดินข้าม", "pedestrian bridge", "pedestrian crossing/ zebra crossing", "underground/subway", "airport"},
            {"  bpâai-rót-may                      " + "               ป้ายรถเมล์", "bus stop", "bus No.", "the next stop", "highway"},
            {"  sà-tăa-nee-kŏn-sòng                " + "                สถานีขนส่ง", "bus terminals", "mass transit", "Train station/bus station", "underground/subway"}

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttrans);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar20);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Transportation");
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        countLabel = (TextView) findViewById(R.id.countLabel);
        questionLabel = (TextView) findViewById(R.id.questionLabel);
        answerBtn1 = (Button) findViewById(R.id.answerBtn1);
        answerBtn2 = (Button) findViewById(R.id.answerBtn2);
        answerBtn3 = (Button) findViewById(R.id.answerBtn3);
        answerBtn4 = (Button) findViewById(R.id.answerBtn4);



        //prepare array
        for (int i = 0; i < quizData.length; i++) {
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //number
            tmpArray.add(quizData[i][1]); //right answer
            tmpArray.add(quizData[i][2]); //choice1
            tmpArray.add(quizData[i][3]); //choice2
            tmpArray.add(quizData[i][4]); //choice3

            //add tmpArray to quizArray
            quizArray.add(tmpArray);
        }
        showNextQuiz();
    }

    public void showNextQuiz() {
        //update quizCountLabel
        countLabel.setText("Quiz  " + quizCount);

        //Generate random number  between 0 and 10 (quizArray's size-1)
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        //Pick one quiz set
        ArrayList<String> quiz = quizArray.get(randomNum);

        //set question and right answer
        //Array format: {"number", "right answer", "choice1", choice2", "choice3"}
        questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);

        //remove "Number" from quiz and Shuffle choice
        quiz.remove(0);
        Collections.shuffle(quiz);

        //set choice
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        //remove this quiz from quizArray
        quizArray.remove(randomNum);

    }

    public void checkAnswer(View view) {
        //Get pushed button
        Button answerBtn = (Button) findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if (btnText.equals(rightAnswer)) {
            //Correct!
            alertTitle = "Correct!";
            rightAnswerCount++;


        } else {
            //Wrong!
            alertTitle = "Wrong!";
        }

        //create Dialog
        AlertDialog.Builder builber = new AlertDialog.Builder(this);
        builber.setTitle(alertTitle);
        builber.setMessage("Answer: " + rightAnswer);
        builber.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (quizCount == QUIZ_COUNT) {
                    //Show result
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);
                } else {
                    quizCount++;
                    showNextQuiz();

                }
            }
        });
        builber.setCancelable(false);
        builber.show();

    }

}

