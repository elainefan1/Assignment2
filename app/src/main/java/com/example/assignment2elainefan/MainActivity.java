package com.example.assignment2elainefan;
/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #2
 * <Fan>, <Elaine>
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int minimumInt = 1;
    private int maximumInt = 10;
    private TextView minimumTxtTextView = null;
    private TextView maximumTxtTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.minimumTxtTextView = (TextView)findViewById(R.id.minimumTxt);
        this.maximumTxtTextView = (TextView)findViewById(R.id.maximumTxt);
        setDefaultMinMax();

    }
    private void setDefaultMinMax(){
        String minString = Integer.toString(this.minimumInt);

        this.minimumTxtTextView.setText(minString);
    }
}
