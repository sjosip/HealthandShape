package com.example.stander.josip.healthandshape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainYogaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_yoga);

        Button b_nextYoga = (Button) findViewById(R.id.b_nextYoga);

        Button b_backYoga = (Button) findViewById(R.id.b_backYoga);

        b_nextYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainYogaActivity.this, MainCardioActivity.class);
                startActivity(intent);
            }
        });

        b_backYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainYogaActivity.this, MainWeightActivity.class);
                startActivity(intent);
            }
        });
    }
}
