package com.example.BasiceTheQuran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.BasiceTheQuran.ui.main.Chapter2;
import com.example.BasiceTheQuran.ui.main.ui.main.Chapter3;
import com.example.BasiceTheQuran.ui.main.ui.main.ui.main.Chapter4;

public class Page1 extends AppCompatActivity {
    ImageButton H1,c1,c2,c3,c4;
    Button a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        H1 = (ImageButton) findViewById(R.id.home1_1);
        H1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H1 = new Intent(Page1.this,HomeActivity.class);
                startActivity(H1);
            }
        });
        c1 = (ImageButton) findViewById(R.id.C1p1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c1 = new Intent(Page1.this, Frament.class);
                startActivity(c1);
            }
        });
        c2 = (ImageButton) findViewById(R.id.C1p2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c2 = new Intent(Page1.this, Chapter2.class);
                startActivity(c2);
            }
        });
        c3 = (ImageButton) findViewById(R.id.C1p3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c3 = new Intent(Page1.this, Chapter3.class);
                startActivity(c3);
            }
        });
        c4 = (ImageButton) findViewById(R.id.C1p4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c4 = new Intent(Page1.this, Chapter4.class);
                startActivity(c4);
            }
        });

        a3 = (Button) findViewById(R.id.Gototest111);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a2 = new Intent(Page1.this, HomeActivity.class);
                startActivity(a2);
            }
        });


    }
}
