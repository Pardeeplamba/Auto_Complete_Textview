package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=findViewById(R.id.auto);
        String[] name={"Akshay","Tiger","Vidyut","Varun","Ranveer","Saheed"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.activity_main,name);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setTextColor(Color.RED);

    }
}
