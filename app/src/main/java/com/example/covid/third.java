package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class third extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity pMain = new MainActivity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView text = findViewById(R.id.admin);
        ArrayList transfer = new ArrayList();
        String main ="";

        for (int i =0; i<pMain.listOfSymptoms.size(); i++){
            main += pMain.listOfSymptoms.get(i);
        }
        text.setText(main);

        Queue<String> q = new LinkedList<>();
        q.add("Yes");
        text.setText(q.toString());

        Intent intent = getIntent();

    }
}