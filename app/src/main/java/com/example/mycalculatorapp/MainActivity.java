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
        EditText firstNum = findViewById(R.id.userFirstNum);
        EditText secondNum = findViewById(R.id.userSecondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int sum = first + second;

        TextView tv_data=(TextView)findViewById(R.id.sumTV);
        tv_data.setText(sum);

    }
}