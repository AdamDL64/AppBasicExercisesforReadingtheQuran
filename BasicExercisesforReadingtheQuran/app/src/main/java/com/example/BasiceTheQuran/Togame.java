package com.example.BasiceTheQuran;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Togame extends AppCompatActivity {
ImageButton Q ,Q1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togame);

        Q = (ImageButton) findViewById(R.id.imageButtontogame1  );
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q = new Intent(Togame.this,Page4 .class);
                startActivity(Q);
            }
        });

        Q1 = (ImageButton) findViewById(R.id.imageButtontogame  );
        Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q1 = new Intent(Togame.this,KuisActivity .class);
                startActivity(Q1);
            }
        });


    }
}
