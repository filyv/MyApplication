package com.example.filyvazquez.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button buttonRock;
    private Button buttonPaper;
    private Button buttonScissors;
    private Button buttonReset;


    int victory=0, victory2=0;
    String vic, vic2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonRock = findViewById(R.id.button);
        buttonPaper = findViewById(R.id.button2);
        buttonScissors = findViewById(R.id.button3);
        buttonReset = findViewById(R.id.button4);

        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String winner = " ";

                Random myRandom = new Random();
                int player2 = myRandom.nextInt(3);

                if (player2==0){
                    winner = "Player2 chose rock: TIE :/";


                }else
                    if(player2==1){
                        winner="Player2 chose paper: Player2 won! :(";
                        victory2++;

                    } else
                        if(player2==2){
                            winner="Player2 chose scissors: Player1 won! :D";
                            victory++;
                         }



                vic = Integer.toString(victory);
                vic2 = Integer.toString(victory2);
                Toast.makeText(getApplicationContext(), ""+winner, Toast.LENGTH_LONG).show();

                Intent intentC = new Intent(MainActivity.this, SecondActivity.class);
                intentC.putExtra("vic", vic);

                intentC.putExtra("vic2", vic2);
                startActivity(intentC);

            }
        });

        buttonPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String winner = " ";

                Random myRandom = new Random();
                int player2 = myRandom.nextInt(3);

                if (player2==0){
                    winner = "Player2 chose rock: Player 1 won! :D";
                    victory++;
                }else
                if(player2==1){
                    winner="Player2 chose paper: TIE :/";


                } else
                if(player2==2){
                    winner="Player2 chose scissors: Player2 won! :(";
                    victory2++;
                }


                vic = Integer.toString(victory);
                vic2 = Integer.toString(victory2);
                Toast.makeText(getApplicationContext(), ""+winner, Toast.LENGTH_LONG).show();

                Intent intentC = new Intent(MainActivity.this, SecondActivity.class);
                intentC.putExtra("vic", vic);

                intentC.putExtra("vic2", vic2);
                startActivity(intentC);
            }
        });

        buttonScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String winner = " ";

                Random myRandom = new Random();
                int player2 = myRandom.nextInt(3);

                if (player2==0){
                    winner = "Player2 chose rock: Player 2 won! :(";
                    victory2++;

                }else
                if(player2==1){
                    winner="Player2 chose paper: Player 1 won! :D";

                    victory++;


                } else
                if(player2==2){
                    winner="Player2 chose scissors: TIE :/";
                }


                vic = Integer.toString(victory);
                vic2 = Integer.toString(victory2);
                Toast.makeText(getApplicationContext(), ""+winner, Toast.LENGTH_LONG).show();

                Intent intentC = new Intent(MainActivity.this, SecondActivity.class);
                intentC.putExtra("vic", vic);

                intentC.putExtra("vic2", vic2);
                startActivity(intentC);
            }
        });



        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                victory =0;
                victory2=0;
                Toast.makeText(getApplicationContext(), "SCORE RESET", Toast.LENGTH_LONG).show();
            }

        });

    }

}
