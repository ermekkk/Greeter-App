package com.example.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greetBtn(View v){
        EditText grtEditText = (EditText) findViewById(R.id.editText);
        String name = grtEditText.getText().toString();
        String output = "Привет, " + name + "!";
        TextView textView = (TextView) findViewById(R.id.outtxt);
        textView.setText(output);
    }
}