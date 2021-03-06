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

public class Temer extends AppCompatActivity {

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
            {"chûay-chăn-nòi-dâi-măi                      " + "                           ช่วยฉันหน่อยได้ไหม", "Can you help me?", "Help!", "Does anyone here speak English?", "Is there a gas station around here?"},
            {"chăn-dtông-gaan-bpai-têe-sà-tăan-tôot       " + "                           ฉันต้องการไปที่สถานทูต", "I want to go to the embassy.", "I want to go to the police office.", "็็I want a translator.", "I have some trouble."},
            {"bpròht-rîak-rót-dàp-plerng                  " + "                           โปรดเรียกรถดับเพลิง", "Please call the fire department.", "Please come as soon as possible.", "Someone needs help.", "Fire!",},
            {"chăn-tam-paa-sà-bpòt-hăai                   " + "                           ฉันทำพาสปอร์ตหาย", "I lost my passport.", "I lost my phone.", "I lost the key.", "I lost my wallet."},
            {"chăn-tam-toh-rá-sàp-hăai                   " + "                            ฉันทำโทรศัพท์หาย", "I lost my phone.", "I lost the key.", "I lost my wallet.", "I lost my passport."},
            {"chăn-dtòk-krêuang-bin                      " + "                            ฉันตกเครื่องบิน", "I missed my flight.", "I want a translator.", "I want a translator.", "I lost my passport."},
            {"dâi-bpròht-maa-reo-têe-sùt                 " + "                            ได้โปรดมาเร็วที่สุด", "Please come as soon as possible.", "Please call the fire department.", "My bag got stolen.", "Someone needs help."},
            {"grà-bpăo-kŏng-chăn-tòok-kà-moi             " + "                            กระเป๋าของฉันถูกขโมย", "My bag got stolen.", "I don't have money.", "My luggage is lost.", "I want a translator."},
            {"chăn-dtông-gaan-nák-bplae                  " + "                            ฉันต้องการนักแปล", "I want a translator.", "I want to go to the police office.", "I want to go to the embassy.", "I have some trouble."},
            {"chăn-mee-bpan-hăa                          " + "                            ฉันมีปัญหา", "I have some trouble.", "I lost the key.", "I missed my flight.", "I lost my wallet."}

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temer);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar22);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Emergency");
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
