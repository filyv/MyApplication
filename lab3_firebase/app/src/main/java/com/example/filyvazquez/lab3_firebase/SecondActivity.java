package com.example.filyvazquez.lab3_firebase;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        long pattern[]={0,200,100,300,400};
        Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(pattern, -1);

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), "VIBRATING", duration);
        toast.show();
    }
}