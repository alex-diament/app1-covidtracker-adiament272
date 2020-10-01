package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class actvivity_second extends AppCompatActivity {

    TextView textView;
    String main = " ";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.text_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Boolean Name = intent.getBooleanExtra("NAME",false);
        ArrayList<String> listOfSymptoms = intent.getStringArrayListExtra("ListOfSymptoms");
        Boolean school = intent.getBooleanExtra("School1", true);
        if (Name != true) {
            if (message == null)
                textView.setText("???? null");
            else {
                for (int i = 0; i < listOfSymptoms.size(); i++) {
                    main += listOfSymptoms.get(i) + ", ";
                }


            }
            if (school == true) {
                textView.setText(message + " you can attend school!");
            } else
                textView.setText(message + " you sadly can not attend school because you have experienced the following: " + main);
        }
        else{
            textView.setText("Please return to the previous page and enter you name");
            //Intent intent1 = new Intent(this, MainActivity.class);
            //startActivity(intent);
        }

       // textView.setTypeface(null,Typeface.ITALIC);
    }
}