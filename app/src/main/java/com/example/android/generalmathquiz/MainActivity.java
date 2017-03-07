package com.example.android.generalmathquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0 ;
    RadioButton question1_A ;
    RadioButton question1_B ;
    RadioButton question1_C ;
    CheckBox question2_A ;
    CheckBox question2_B ;
    CheckBox question2_C ;
    RadioButton question3_A ;
    RadioButton question3_B ;
    RadioButton question3_C ;
    RadioButton question4_A ;
    RadioButton question4_B ;
    RadioButton question4_C ;
    EditText question5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        question1_A = (RadioButton) findViewById(R.id.question1_A) ;
        question1_B = (RadioButton) findViewById(R.id.question1_B) ;
        question1_C = (RadioButton) findViewById(R.id.question1_C) ;

        question2_A = (CheckBox) findViewById(R.id.question2_A) ;
        question2_B = (CheckBox) findViewById(R.id.question2_B) ;
        question2_C = (CheckBox) findViewById(R.id.question2_C) ;

        question3_A = (RadioButton) findViewById(R.id.question3_A) ;
        question3_B = (RadioButton) findViewById(R.id.question3_B) ;
        question3_C = (RadioButton) findViewById(R.id.question3_C) ;

        question4_A = (RadioButton) findViewById(R.id.question4_A) ;
        question4_B = (RadioButton) findViewById(R.id.question4_B) ;
        question4_C = (RadioButton) findViewById(R.id.question4_C) ;

        question5 = (EditText) findViewById(R.id.question5) ;

    }
     public void getScore (View view)
     {
         boolean correctAnswer = question1_B.isChecked();
         if (correctAnswer)
                 score++;
         correctAnswer = question2_A.isChecked() && question2_B.isChecked() && !question2_C.isChecked();
         if (correctAnswer)
             score++;
         correctAnswer = question3_C.isChecked();
         if (correctAnswer)
             score++;
         correctAnswer = question4_B.isChecked();
         if (correctAnswer)
             score++;
         String correctAnswer5 = question5.getText().toString();
         int Answer5 = Integer.parseInt(correctAnswer5);
         if (Answer5 == 2400)
             score++;
         displayResult();
     }
    /*
    To allow only one answer to be select
     */
    public void onCheckboxClicked(View view) {
        switch(view.getId()) {
            //-----------------question1-------------------
            case R.id.question1_A :
                question1_B.setChecked(false);
                question1_C.setChecked(false);
                break;
            case R.id.question1_B:
                question1_A.setChecked(false);
                question1_C.setChecked(false);
                break;
            case R.id.question1_C:
                question1_A.setChecked(false);
                question1_B.setChecked(false);
                break;
            //-----------------question3-------------------
            case R.id.question3_A :
                question3_B.setChecked(false);
                question3_C.setChecked(false);
                break;
            case R.id.question3_B:
                question3_A.setChecked(false);
                question3_C.setChecked(false);
                break;
            case R.id.question3_C:
                question3_A.setChecked(false);
                question3_B.setChecked(false);
                break;
            //-----------------question4-------------------
            case R.id.question4_A :
                question4_B.setChecked(false);
                question4_C.setChecked(false);
                break;
            case R.id.question4_B:
                question4_A.setChecked(false);
                question4_C.setChecked(false);
                break;
            case R.id.question4_C:
                question4_A.setChecked(false);
                question4_B.setChecked(false);
                break;
        }
    }
    private void displayResult() {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String resultMsg =" Your Score is :" + score;
        if (score == 5 )
            resultMsg = resultMsg + "\nCongratulation! You win" ;
        Toast toast = Toast.makeText(context,resultMsg , duration);
        toast.show();
        score = 0 ;
    }
}