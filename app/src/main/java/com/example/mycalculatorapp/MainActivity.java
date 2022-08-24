package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.InputMismatchException;

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
        tv_data.setText("Answer: " + sum);

    }

    public void subNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int difference = first - second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + difference);
    }

    public void multNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int product = first * second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + product);
    }

    public void divNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int div = first/second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + div);
    }

    public void modNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int mod = first % second;

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + mod);
    }

    public void expoNums(View view){
        EditText firstNum = (EditText)findViewById(R.id.firstNum);
        EditText secondNum = (EditText)findViewById(R.id.secondNum);

        //I got this from https://www.tutorialspoint.com/java/number_parseint.htm
        int first =Integer.parseInt(firstNum.getText().toString());
        int second =Integer.parseInt(secondNum.getText().toString());

        int expo = (int) Math.pow(first, second);

        TextView tv_data=(TextView)findViewById(R.id.answerTV);
        tv_data.setText("Answer: " + expo);
    }

    public void checkValueType(View view) {
            EditText firstNum = (EditText)findViewById(R.id.firstNum);
            EditText secondNum = (EditText)findViewById(R.id.secondNum);
            int first =Integer.parseInt(firstNum.getText().toString());
            int second =Integer.parseInt(secondNum.getText().toString());
            boolean inputError = false;
            try{

                }
                catch(InputMismatchException e)
                {
                    inputError = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid entry, please enter an integer.");
            }
        }
    }
}