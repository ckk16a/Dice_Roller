package com.example.diceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    MediaPlayer player;
    MediaPlayer critHit;
    MediaPlayer critMiss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        TextView textView = findViewById(R.id.textView);
        String message = "";

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.d1);
                critMiss = MediaPlayer.create(this, R.raw.criticalmiss);
                critMiss.start();
                message = "Critical Miss!";
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d2);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d3);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d4);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d5);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d6);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d7);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d8);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d9);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d10);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d11);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d12);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d13);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d14);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d15);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d16);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d17);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d18);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d19);
                player = MediaPlayer.create(this, R.raw.diceroll);
                message = "";
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20);
                critHit = MediaPlayer.create(this, R.raw.criticalhit);
                critHit.start();
                message = "Critical Hit!";
                break;
        }
        textView.setText(message);
        if(randomNumber != 1 && randomNumber != 20)
            player.start();
    }
}