package com.example.android.generalmathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0 ;
    CheckBox question1_A ;
    CheckBox question1_B ;
    CheckBox question1_C ;
    CheckBox question2_A ;
    CheckBox question2_B ;
    CheckBox question2_C ;
    CheckBox question3_A ;
    CheckBox question3_B ;
    CheckBox question3_C ;
    CheckBox question4_A ;
    CheckBox question4_B ;
    CheckBox question4_C ;
    CheckBox question5_A ;
    CheckBox question5_B ;
    CheckBox question5_C ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        question1_A = (CheckBox) findViewById(R.id.question1_A) ;
        question1_B = (CheckBox) findViewById(R.id.question1_B) ;
        question1_C = (CheckBox) findViewById(R.id.question1_C) ;

        question2_A = (CheckBox) findViewById(R.id.question2_A) ;
        question2_B = (CheckBox) findViewById(R.id.question2_B) ;
        question2_C = (CheckBox) findViewById(R.id.question2_C) ;

        question3_A = (CheckBox) findViewById(R.id.question3_A) ;
        question3_B = (CheckBox) findViewById(R.id.question3_B) ;
        question3_C = (CheckBox) findViewById(R.id.question3_C) ;

        question4_A = (CheckBox) findViewById(R.id.question4_A) ;
        question4_B = (CheckBox) findViewById(R.id.question4_B) ;
        question4_C = (CheckBox) findViewById(R.id.question4_C) ;

        question5_A = (CheckBox) findViewById(R.id.question5_A) ;
        question5_B = (CheckBox) findViewById(R.id.question5_B) ;
        question5_C = (CheckBox) findViewById(R.id.question5_C) ;
    }
     public void getScore (View view)
     {
         boolean correctAnswer = question1_B.isChecked();
         if (correctAnswer)
                 score++;
         correctAnswer = question2_C.isChecked();
         if (correctAnswer)
             score++;
         correctAnswer = question3_C.isChecked();
         if (correctAnswer)
             score++;
         correctAnswer = question4_B.isChecked();
         if (correctAnswer)
             score++;
         correctAnswer = question5_A.isChecked();
         if (correctAnswer)
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
            //-----------------question2-------------------
            case R.id.question2_A :
                question2_B.setChecked(false);
                question2_C.setChecked(false);
                break;
            case R.id.question2_B:
                question2_A.setChecked(false);
                question2_C.setChecked(false);
                break;
            case R.id.question2_C:
                question2_A.setChecked(false);
                question2_B.setChecked(false);
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
            //-----------------question5-------------------
            case R.id.question5_A :
                question5_B.setChecked(false);
                question5_C.setChecked(false);
                break;
            case R.id.question5_B:
                question5_A.setChecked(false);
                question5_C.setChecked(false);
                break;
            case R.id.question5_C:
                question5_A.setChecked(false);
                question5_B.setChecked(false);
                break;
        }
    }
    private void displayResult() {
        String resultMsg =" Your Score is :" + score;
        TextView result = (TextView) findViewById(R.id.result);
        if (score == 5 )
            resultMsg = resultMsg + "\nCongratulation! You win" ;
        result.setText(resultMsg );
        score = 0 ;
    }
}