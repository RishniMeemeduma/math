package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView result;
  EditText Percentage;
  EditText Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.total);
        Percentage = (EditText) findViewById(R.id.Percentage);
        Number = (EditText) findViewById(R.id.Number);
        Button btn = findViewById(R.id.calculate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float per = Float.parseFloat(Percentage.getText().toString());
                Float val = Float.parseFloat(Number.getText().toString());
                Float final_val = (per * val)/100;
                result.setText(final_val.toString());
            }
        });
    }
}