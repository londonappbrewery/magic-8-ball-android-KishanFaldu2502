package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button askButton;
    ImageView ballDisplay;
    final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
};

@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randonNumberGenerator=new Random();
                int number=randonNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });

        }
public void init(){
        askButton=findViewById(R.id.askbutton);
        ballDisplay=findViewById(R.id.image_eightball);
        }
        }
