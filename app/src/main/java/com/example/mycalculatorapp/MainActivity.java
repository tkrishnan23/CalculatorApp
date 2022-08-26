package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

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
        double first =Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double sum = first + second;
        //I learned this from https://stackoverflow.com/questions/153724/
        // how-to-round-a-number-to-n-decimal-places-in-java
        DecimalFormat df = new DecimalFormat("#.####");

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + df.format(sum));

    }

    public void subNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        double first =Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double difference = first - second;
        DecimalFormat df = new DecimalFormat("#.####");

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + df.format(difference));
    }

    public void multNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        double first =Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double product = first * second;
        DecimalFormat df = new DecimalFormat("#.####");

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + df.format(product));
    }

    public void divNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        double first =Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double div = first/second;
        DecimalFormat df = new DecimalFormat("#.####");

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + df.format(div));
    }

    public void modNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        double first =Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double mod = first % second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + mod);
    }

    public void expoNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        double first = Double.parseDouble(firstNum.getText().toString());
        double second =Double.parseDouble(secondNum.getText().toString());

        double expo = Math.pow(first, second);
        DecimalFormat df = new DecimalFormat("#.####");

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + df.format(expo));
    }


}