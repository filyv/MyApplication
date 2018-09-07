package com.example.filyvazquez.examen;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myTextView = findViewById(R.id.textView2);

        Intent myOtherIntent = getIntent();
        String myString = myOtherIntent.getStringExtra("vic");
        String myString2 = myOtherIntent.getStringExtra("vic2");

        myTextView.setText("SCOREBOARD: You've won "+myString+" times. Player 2 has won "+myString2+" times.");


    }
}
