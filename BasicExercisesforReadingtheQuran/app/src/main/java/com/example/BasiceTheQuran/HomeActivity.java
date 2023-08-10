package com.example.BasiceTheQuran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageButton H1,H2,H3,H4 ;
    Button Q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        H1= (ImageButton) findViewById(R.id.Gopage1);
        H1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H1=new Intent(HomeActivity.this,Topage1.class);
                startActivity(H1);
            }
        });
        H2 = (ImageButton) findViewById(R.id.Gopage2);
        H2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H2 = new Intent(HomeActivity.this,Page2.class);
                startActivity(H2);
            }
        });
        H3 = (ImageButton) findViewById(R.id.Gopage3 );
        H3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H3 = new Intent(HomeActivity.this,Page3.class);
                startActivity(H3);
            }
        });
        H4 = (ImageButton) findViewById(R.id.Gopage4  );
        H4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H4 = new Intent(HomeActivity.this,Togame .class);
                startActivity(H4);
            }
        });


    }
}
