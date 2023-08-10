package com.example.BasiceTheQuran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KuisActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        pindah = (ImageButton) findViewById(R.id.menu_kuis_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHijaiyahActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHarokatActivity.class);
                startActivity(intent);

            }
        });


        pindah = (ImageButton) findViewById(R.id.menu_kuis_bacaan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakBacaanHarokatActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonAbout);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, BelajarActivity.class);
                startActivity(intent);
            }
        });
    }
}