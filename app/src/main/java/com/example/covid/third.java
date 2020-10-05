package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Queue<Object> q = new LinkedList<>();
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView text = findViewById(R.id.admin);
        ArrayList transfer = new ArrayList();
        String main ="";
        child child1 = new child();

        ArrayList<String> listOfSymptoms = intent.getStringArrayListExtra("ListOfSymptoms");
        for (int i =0; i<listOfSymptoms.size();i++){
            child1.setSymptoms(listOfSymptoms.get(i));
            //System.out.println("hi");
        }

       text.setText(main);

        q.add(child1);
        Object children = child1;

        text.setText(q.poll().toString());

    }
}