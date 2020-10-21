package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvPrompt;
    Button mainBtn;
    Button promptBtn;
    ImageView imageBall;
    int[] allBalls = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5, R.drawable.ball6 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvPrompt = (TextView) findViewById(R.id.textPrompt);
        mainBtn = (Button) findViewById(R.id.mainButton);
        promptBtn = (Button) findViewById(R.id.promptButton);
        imageBall = (ImageView) findViewById(R.id.imageBall);


    }
    public void promptActivity(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    final Random random = new Random();
    public void checkBall(View view) throws InterruptedException {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                imageBall.setImageResource(R.drawable.ball);
            }
        }, 2000);
        imageBall.setImageResource(allBalls[random.nextInt(6)]);
    }
}