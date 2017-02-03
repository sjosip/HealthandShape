package com.example.stander.josip.healthandshape;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainWeightActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weight);

        Button b_nextWeight = (Button) findViewById(R.id.b_nextWeight);

        Button b_backWeight = (Button) findViewById(R.id.b_backWeight);

        b_nextWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainWeightActivity.this, MainYogaActivity.class);
                startActivity(intent);
            }
        });

        b_backWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainWeightActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        //to open all activity's from one activity!!!

        /*TextView tvWeightTitle = (TextView) findViewById(R.id.tv_weightTitle);
        ImageView iwWeightImage = (ImageView) findViewById(R.id.iw_weightImage);
        LinearLayout mainBG = (LinearLayout) findViewById(R.id.activity_main);

        String exTitle = getIntent().getStringExtra(MainActivity.EX_TITLE_WEIGHT);
        tvWeightTitle.setText(exTitle);

        if (exTitle.equalsIgnoreCase(MainActivity.EX_WEIGHTS)) {
            iwWeightImage.setImageDrawable(getResources().getDrawable(R.drawable.weights,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2979ff"));

        } else  if (exTitle.equalsIgnoreCase(MainActivity.EX_YOGA)) {
            iwWeightImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#ffc107"));
        } else {
            iwWeightImage.setImageDrawable(getResources().getDrawable(R.drawable.hart,
                    getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#1de9b6"));
        }*/

    }

}
