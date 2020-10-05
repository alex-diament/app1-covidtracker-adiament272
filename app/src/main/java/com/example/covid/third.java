package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView text = findViewById(R.id.admin);
        ArrayList transfer = new ArrayList();
        String main ="";
        child child1 = new child();

        Intent intent = null;
        ArrayList<String> listOfSymptoms = intent.getStringArrayListExtra("ListOfSymptoms");
        for (int i =0; i<listOfSymptoms.size();i++){
            child1.setSymptoms(listOfSymptoms.get(i));
        }

        text.setText(main);

        Queue<String> q = new LinkedList<>();
        q.add("Yes");
        text.setText(q.toString());

    }
}