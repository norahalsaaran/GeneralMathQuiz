package com.example.android.generalmathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void getScore (View view)
     {
         //-----------------------que 1-----------------------------------
         CheckBox question1_B = (CheckBox) findViewById(R.id.question1_B) ;
         boolean question1CorrectAnswer =  question1_B.isChecked() ;
         if (question1CorrectAnswer)
             score++ ;
         //----------------------------------------------------------------
         //-----------------------que 2-----------------------------------
         CheckBox question2_C = (CheckBox) findViewById(R.id.question2_C) ;
         boolean question2CorrectAnswer =  question2_C.isChecked() ;
         if (question2CorrectAnswer)
             score++ ;
         //----------------------------------------------------------------
         //-----------------------que 3-----------------------------------
         CheckBox question3_C = (CheckBox) findViewById(R.id.question3_C) ;
         boolean question3CorrectAnswer =  question3_C.isChecked() ;
         if (question3CorrectAnswer)
             score++ ;
         //----------------------------------------------------------------
         //-----------------------que 4-----------------------------------
         CheckBox question4_B = (CheckBox) findViewById(R.id.question4_B) ;
         boolean question4CorrectAnswer =  question4_B.isChecked() ;
         if (question4CorrectAnswer)
             score++ ;
         //----------------------------------------------------------------
         //-----------------------que 5-----------------------------------
         CheckBox question5_A = (CheckBox) findViewById(R.id.question5_A) ;
         boolean question5CorrectAnswer =  question5_A.isChecked() ;
         if (question5CorrectAnswer)
             score++ ;
         //----------------------------------------------------------------
         EditText player = (EditText) findViewById(R.id.name) ;
         String name = player.getText().toString() ;
         displayResult(name);
     }
    private void displayResult(String name) {
        String resultMsg = name + "Your Score is :" + score;
        TextView result = (TextView) findViewById(R.id.result);
        if (score == 5 )
            resultMsg = resultMsg + "\nCongratulation! You win" ;
        result.setText(resultMsg );
    }
}