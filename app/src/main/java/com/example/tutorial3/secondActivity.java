package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    EditText ed_num1;
    EditText ed_num2;
    TextView result;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ed_num1 = findViewById(R.id.ed_num1);
        ed_num2 = findViewById(R.id.ed_num2);
        result = findViewById(R.id.result);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra("n1");
        String number2 = intent.getStringExtra("n2");

        ed_num1.setText(number1);
        ed_num2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }


    public void add(View view){
        result.setText(n1 + "+" + n2 + "=" + (n1+n2));
    }
    public void sub(View view){
        result.setText(n1 + "-" + n2 + "=" + (n1-n2));
    }
    public void multiply(View view){
        result.setText(n1 + "*" + n2 + "=" + (n1*n2));
    }
    public void divide(View view){
        result.setText(n1 + "/" + n2 + "=" + (n1/n2));
    }




















}