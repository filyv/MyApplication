package com.example.filyvazquez.lab3_firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;


public class MainActivity extends AppCompatActivity {

    private Button buttonVibrate;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NotificationManager mNotificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel =
                    new NotificationChannel(Constants.CHANNEL_ID, Constants.CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            mChannel.setDescription(Constants.CHANNEL_DESCRIPTION);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.BLUE);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100,200,300,400,500,400,300,200,400});

            mNotificationManager.createNotificationChannel(mChannel);
        }

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
