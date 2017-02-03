package com.example.stander.josip.healthandshape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

   /* public static final String EX_TITLE_WEIGHT = "ex.title.weight";
    public static final String EX_WEIGHTS = "Weight lifting";
    public static final String EX_YOGA = "Yoga";
    public static final String EX_CARDIO = "Cardio";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightButton = (RelativeLayout) findViewById(R.id.weightButton);
        RelativeLayout yogaButton = (RelativeLayout) findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout) findViewById(R.id.cardioButton);

        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //loadActivity(MainActivity.EX_WEIGHTS);
                Intent intent = new Intent(MainActivity.this, MainWeightActivity.class);
                startActivity(intent);

            }
        });

        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //loadActivity(MainActivity.EX_YOGA);
                Intent intent = new Intent(MainActivity.this, MainYogaActivity.class);
                startActivity(intent);

            }
        });

        cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // loadActivity(MainActivity.EX_CARDIO);
                Intent intent = new Intent(MainActivity.this, MainCardioActivity.class);
                startActivity(intent);

            }
        });

    }
/*
    private void loadActivity(String exTitle) {
        Intent intent = new Intent(MainActivity.this, MainWeightActivity.class);
        intent.putExtra(MainActivity.EX_TITLE_WEIGHT, exTitle);
        startActivity(intent);

    }*/
}
