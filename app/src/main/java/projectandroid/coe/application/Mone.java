package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mone extends AppCompatActivity {
    ImageView imvSpeaker;
    private Button ans1;
    private Button ans2;
    private Button ans3;
    private Button ans4;
    private TextView countLabel;
    //private TextView questionLabel;

    private String rightAnswer;
    private String sound;
    private String pic;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;
    ArrayList<String> imgsound = new ArrayList<>();

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();
    String quizData[][] = {
            //{"number", "right answer", "choice1", choice2", "choice3", "choice4"}
            {"m1", "ไก่", "ไข่", "หมา", "ม้า", "chic"},
            {"m2", "ไข่", "ขาว", "ม้า", "ข้าว", "eg"},
            {"m3", "ข้าว", "หมา", "ไก่", "ไข่", "rice"},
            {"ho", "ม้า", "หมา", "แมว", "ไก่", "horse"},
            {"m4", "หมา", "แมว", "ม้า", "ข้าว", "dog"},

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mone);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar45);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Similar pronunciation");

        ans1 = (Button) findViewById(R.id.answerBtn1);
        ans2 = (Button) findViewById(R.id.answerBtn2);
        ans3 = (Button) findViewById(R.id.answerBtn3);
        ans4 = (Button) findViewById(R.id.answerBtn4);

        imvSpeaker = (ImageView) findViewById(R.id.imvSpeaker);

        countLabel = (TextView) findViewById(R.id.countLabel);
        //questionLabel = (TextView) findViewById(R.id.questionLabel);
        //prepare array
        for (int i = 0; i < quizData.length; i++) {
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //number
            tmpArray.add(quizData[i][1]); //right answer
            tmpArray.add(quizData[i][2]); //choice1
            tmpArray.add(quizData[i][3]); //choice2
            tmpArray.add(quizData[i][4]); //choice3
            imgsound.add(quizData[i][5]);
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
        //questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);
        sound = quiz.get(0);
        pic = imgsound.get(randomNum);

        //remove "Number" from quiz and Shuffle choice
        quiz.remove(0);
        Collections.shuffle(quiz);

        //set choice
        int resID = getResources().getIdentifier(pic, "drawable", getPackageName());
        //Toast.makeText(getApplicationContext(),"xxxx"+resID, Toast.LENGTH_SHORT).show();
        ans1.setText(quiz.get(0));
        ans2.setText(quiz.get(1));
        ans3.setText(quiz.get(2));
        ans4.setText(quiz.get(3));

        imvSpeaker.setImageResource(resID);
        //remove this quiz from quizArray
        quizArray.remove(randomNum);
        imgsound.remove(randomNum);
    }

    public void checkAnswer(View view) {
        //Get pushed button
        Button answer = (Button) findViewById(view.getId());
        String btnText = answer.getText().toString();
        String alertTitle;
        if (btnText.equals(rightAnswer)) {
            //Correct!
            alertTitle = "Correct !";
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
                    Intent intent = new Intent(getApplicationContext(), Result2.class);
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

    public void sound_qu(View view) {
        int x = Mone.this.getResources().getIdentifier(sound, "raw",
                Mone.this.getPackageName());
        final MediaPlayer sound = MediaPlayer.create(Mone.this, x);
        //Toast.makeText(getApplicationContext(),"xxxx"+x, Toast.LENGTH_SHORT).show();

        sound.start();
    }
}