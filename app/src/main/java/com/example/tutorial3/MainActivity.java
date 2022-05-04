package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed_num1;
    EditText ed_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_num1 = findViewById(R.id.ed_num1);
        ed_num2 = findViewById(R.id.ed_num2);

    }
    //navigation part

    public void openSecond(View view){
        Intent intent = new Intent(this,secondActivity.class);

      String num1 = ed_num1.getText().toString();
      String num2 = ed_num2.getText().toString();

      intent.putExtra("n1" , num1);
      intent.putExtra("n2" , num2);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast , findViewById(R.id.et_toast));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(layout);
        toast.show();

      startActivity(intent);

    }


}