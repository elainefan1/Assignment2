package com.example.assignment2elainefan;
/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #2
 * <Fan>, <Elaine>
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private int minimumInt = 1;
    private int maximumInt = 10;
    private TextView resultTextView = null;
    private TextView minimumTxtTextView = null;
    private TextView maximumTxtTextView = null;
    private Button generateButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.resultTextView = (TextView) findViewById(R.id.textViewResult);
        this.minimumTxtTextView = (TextView)findViewById(R.id.minimumTxt);
        this.maximumTxtTextView = (TextView)findViewById(R.id.maximumTxt);
        setDefaultMinMax();
        this.generateButton = (Button) findViewById(R.id.buttonGen);

        this.generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchValuesFromFields();
                generateRandomNumber();

            }
        });

    }
    private void setDefaultMinMax(){
        String minString = Integer.toString(this.minimumInt);
        this.maximumTxtTextView.setText(Integer.toString(maximumInt));
        this.minimumTxtTextView.setText(Integer.toString(minimumInt));

    }
    private void fetchValuesFromFields() {
        this.minimumInt = Integer.parseInt(this.minimumTxtTextView.getText().toString());
        this.maximumInt = Integer.parseInt(this.maximumTxtTextView.getText().toString());

    }
    private void generateRandomNumber() {
        int randomNum = getRandomInt(minimumInt, maximumInt);
        String randomNumStr = Integer.toString(randomNum);


        resultTextView.setText(randomNumStr);
    }
    private int getRandomInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max)+min;
    }

}

