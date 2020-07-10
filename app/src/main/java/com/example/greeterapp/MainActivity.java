package com.example.greeterapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greetBtn(View v) {
        EditText grtEditText = (EditText) findViewById(R.id.editText);
        if (grtEditText.getText().toString().isEmpty()) {
            String name = "Введите имя!";
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        } else {
            String name = grtEditText.getText().toString();
            String output = "Привет, " + name + "!";
            TextView textView = (TextView) findViewById(R.id.outtxt);
            textView.setText(output);
        }
    }

}