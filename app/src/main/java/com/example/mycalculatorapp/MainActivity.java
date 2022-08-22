package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int sum = first + second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText(sum);

    }

    public void subNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int difference = first - second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText(difference);
    }

    public void multNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int product = first * second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText(product);
    }

    public void divNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int div = first/second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText(div);
    }
}