package com.kazikhaledsaif.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ndBTN, bpBTN, sgBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ndBTN = findViewById(R.id.ndButton);
        bpBTN = findViewById(R.id.bpButton);
        sgBTN = findViewById(R.id.sgButton);

        ndBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Nayadiganta.class);
                startActivity(intent);
            }
        });
        bpBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bdpratidin.class);
                startActivity(intent);
            }
        });
        sgBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sangram.class);
                startActivity(intent);
            }
        });
    }
}
