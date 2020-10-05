package com.example.covid;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class child extends AppCompatActivity {
    private String name;
    private Intent intent;
    ArrayList<String> listOfSymptoms = new ArrayList<String>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptoms(String symptom){
        listOfSymptoms.add(symptom);
    }

}
