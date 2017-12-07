package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tgreet extends AppCompatActivity  {

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
            {"  kun-chêu-à-rai               " + "                  คุณชื่ออะไร", "What's your name?", "My name is ...", "How old are you?", "Where do you come from?"},
            {"  chăn-chêu                    " + "                  ฉันชื่อ...", "My name is ...", "I come from ...", "I'm 22 years old.", "I work at ..."},
            {"  kun-maa-jàak-têe-năi         " + "                  คุณมาจากที่ไหน", "Where do you come from?", "Where do you study?", "What's your name?", "How old are you?",},
            {"  chăn-maa-jàak-bprà-tâyt       " + "                 ฉันมาจากประเทศ...", "I come from ...", "My name is ...", "I'm 22 years old.", "I work at ..."},
            {"  kun-aa-yú-tâo-rai  " + "                            คุณอายุเท่าไร", "How old are you?", "Keep in touch!", "Where do you study?", "Where do you work?"},
            {"  yin-dee-têe-dâi-róo-jàk       " + "                  ยินดีที่ได้รู้จัก", "Nice to meet you.", "Keep in touch!", "I come from ...", "I work at ..."},
            {"  dtìt-dtòr-gan-èek-ná          " + "                 ติดต่อกันอีกนะ", "Keep in touch!", "Nice to meet you.", "Where do you come from?", "I work at ..."},
            {"  chăn-rian-yòo-têe             " + "                  ฉันเรียนอยู่ที่...", "I study at...", "I come from ...", "Where do you study?", "Where do you work?"},
            {"  chăn-bpen-nák-sèuk-săa        " + "                  ฉันเป็นนักศึกษา", "I'm a college student.", "Nice to meet you.", "Keep in touch!", "I work at ..."},
            {"  chăn-aa-yú-22-bpee            " + "                  ฉันอายุ 22 ปี", "I'm 22 years old.", "I study at...", "I work at ...", "I'm a college student."}

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgreet);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar10);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Greeting");

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





