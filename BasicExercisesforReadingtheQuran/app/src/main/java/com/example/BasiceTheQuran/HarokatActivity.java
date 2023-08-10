package com.example.BasiceTheQuran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HarokatActivity extends AppCompatActivity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.harokat_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatFathahActivity.class);
                startActivity(intent);
                // mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatKasrohActivity.class);
                startActivity(intent);
                // mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatDhomahActivity.class);
                startActivity(intent);
                // mp.stop();
            }
        });
    }
}