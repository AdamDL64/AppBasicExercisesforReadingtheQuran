package com.example.BasiceTheQuran;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    ImageButton pindah , ki;
    MediaPlayer mp;
    private int highscore1;
    private TextView textViewHighscore1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.buttonBelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(Main2Activity.this,BelajarActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonKuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(Main2Activity.this,KuisActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        textViewHighscore1 = findViewById(R.id.text_view_highscore);

        //


    }
    
}

