package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.covid.extra.MESSAGE";
    public static final String Fever = "com.example.covid.extra.Fever";
    public EditText mMessageEditText;

    public EditText temp2;
    ArrayList<String> listOfSymptoms = new ArrayList<>();
    child child1 = new child();

    CheckBox checkbox1;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4;
    CheckBox checkbox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);

        checkbox1= findViewById(R.id.checkBox);
        checkbox2= findViewById(R.id.checkBox2);
        checkbox3= findViewById(R.id.checkBox3);
        checkbox4= findViewById(R.id.checkBox4);
        checkbox5= findViewById(R.id.checkBox5);
    }



    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "button used");
        temp2 = findViewById(R.id.editText_main);
        String temp3 = temp2.getText().toString();
        Intent intent = new Intent(this, actvivity_second.class);
       String message = mMessageEditText.getText().toString();
       Boolean NAME = false;
       if(temp3.length() > 0){
           NAME = true;
       }
       int counter = 0;
       Boolean school = true;
       if(checkbox1.isChecked() == true) {
           listOfSymptoms.add("Fever");
           child1.listOfSymptoms.add("Fever");
       counter++;
       }
       if (checkbox2.isChecked() == true){
           listOfSymptoms.add("Chills");
           child1.listOfSymptoms.add("Chills");
           counter++;
       }
        if (checkbox3.isChecked() == true) {
            listOfSymptoms.add("Dry Throat");
            child1.listOfSymptoms.add("Dry");
            counter++;
        }
        if (checkbox4.isChecked() == true) {
            listOfSymptoms.add("Cough");
            child1.listOfSymptoms.add("Cough");
            counter++;
        }
        if (checkbox5.isChecked() == true) {
            listOfSymptoms.add("Defiantly fever");
            counter++;
        }
      // else{}
        if (counter > 0){
            school = false;
        }

        child1.setName(NAME.toString());
        System.out.println(findViewById(R.id.textView3).toString());
       Log.d(LOG_TAG,findViewById(R.id.textView3).toString());
       intent.putExtra(EXTRA_MESSAGE, message);
       intent.putExtra("ListOfSymptoms",listOfSymptoms);
       intent.putExtra("School1",school);
      intent.putExtra("name", NAME);
      Log.d(LOG_TAG,NAME.toString());
        startActivity(intent);


}

}