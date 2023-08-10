package com.example.BasiceTheQuran;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.BasiceTheQuran.ui.main.Chapter2;
import com.example.BasiceTheQuran.ui.main.ui.main.Chapter3;
import com.example.BasiceTheQuran.ui.main.ui.main.ui.main.Chapter4;

public class Topage1 extends AppCompatActivity {
        Button a2,c2,c3,c4;;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topage1);

        a2 = findViewById(R.id.buttonchap1);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a2 = new Intent(Topage1.this, Frament.class);
                startActivity(a2);
            }
        });

        c2 = findViewById(R.id.buttonchap2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c2 = new Intent(Topage1.this, Chapter2.class);
                startActivity(c2);
            }
        });
        c3 = findViewById(R.id.buttonchap3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c3 = new Intent(Topage1.this, Chapter3.class);
                startActivity(c3);
            }
        });
        c4 = findViewById(R.id.buttonchap4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c4 = new Intent(Topage1.this, Chapter4.class);
                startActivity(c4);
            }
        });



    }

}
