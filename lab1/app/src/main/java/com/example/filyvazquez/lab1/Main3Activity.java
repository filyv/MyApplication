package com.example.filyvazquez.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mytextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mytextview=findViewById(R.id.textView4);
        Intent myOtherIntent = getIntent();
        String myString = myOtherIntent.getStringExtra("myString");
        mytextview.setText(myString);
    }
}
