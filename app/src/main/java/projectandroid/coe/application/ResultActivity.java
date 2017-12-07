package projectandroid.coe.application;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultLabel = (TextView)findViewById(R.id.resultLabel);
        Button back = (Button)findViewById(R.id.back);



        //TextView totalScoreLabel = (TextView)findViewById(R.id.totalScoreLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT",0);

        SharedPreferences setting = getSharedPreferences("quizApp", Context.MODE_PRIVATE);
        //int totalScore = setting.getInt("totalScore",0);
        //totalScore+=score;

        resultLabel.setText(score + "/10");
        //totalScoreLabel.setText("Total score: " + totalScore);

        //update total score
        //SharedPreferences.Editor editor = setting.edit();
        //editor.putInt("totalScore" , totalScore);
        //editor.commit();
        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });




        }





}


