package projectandroid.coe.application;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tdirec extends AppCompatActivity {

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
            {"  dtrong-bpai                 " + "                ตรงไป", "Go straight", "Turn left", "Turn right", "Get off"},
            {"  líeow-sáai                   " + "               เลี้ยวซ้าย", "Turn left", "Go straight", "Turn right", "Direction"},
            {"  têe-nêe-mee-chêu-wâa-à-rai    " + "              ที่นี่มีชื่อว่าอะไร", "What is the name of this place?", "Where is the nearest bus stop?", "What is the name of this station?", "Where can I buy a ticket?",},
            {"  chăn-dtông-bplìan-rót-têe-năi  " + "             ฉันต้องเปลี่ยนรถที่ไหน", "Where should I transfer?", "What is the name of this place?", "What is the name of this station?", "How much is this ticket?"},
            {"  chăn-yàak-séu-dtŭa-bpai        " + "             ฉันอยากซื้อตั๋วไป...", "I want to buy a ticket to...", "The ticket costs...baht.", "How long does it take?", "When does the train leave?"},
            {"  chái-way-laa-naan-tâo-rai      "  + "            ใช้เวลานานเท่าไร", "How long does it take?", "Where should I transfer?", "What is the name of this station?", "Where can I buy a ticket?"},
            {"  sà-tăa-nee-née-chêu-wâa-à-rai  " + "             สถานีนี้ชื่อว่าอะไร", "What is the name of this station?", "What is the name of this place?", "How long does it take?", "Where is the nearest bus stop?"},
            {"  jòt-têe-nêe                    " + "             จอดที่นี่", "Please stop here.", "It takes about...", "I want to buy a ticket to...", "The ticket costs...baht."},
            {"  bpai-têe-nân-dâi-yàang-rai   " + "               ไปที่นั่นได้อย่างไร", "How can I get there?", "Where is the nearest bus stop?", "How long does it take?", "When will the train arrive?"},
            {"  líeow kwăa                   " + "                เลี้ยวขวา", "Turn right", "Go straight", "Turn left", "Get in/on"}

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdirec);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar11);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Direction and Place");

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

