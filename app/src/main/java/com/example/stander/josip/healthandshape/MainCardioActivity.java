package com.example.stander.josip.healthandshape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCardioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cardio);

        Button b_nextCardio = (Button) findViewById(R.id.b_nextCardio);

        b_nextCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCardioActivity.this, MainYogaActivity.class);
                startActivity(intent);
            }
        });
    }
}
