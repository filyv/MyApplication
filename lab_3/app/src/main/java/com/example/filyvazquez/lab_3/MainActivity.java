package com.example.filyvazquez.lab_3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonVibrate;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();


        buttonVibrate = findViewById(R.id.button);

        buttonVibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC1 = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intentC1);
            }
        });

        Button buttonProximity=(Button)findViewById(R.id.button2);
        buttonProximity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent i = new Intent(context, ThirdActivity.class);
                startActivity(i);
            }
        });
    }
}