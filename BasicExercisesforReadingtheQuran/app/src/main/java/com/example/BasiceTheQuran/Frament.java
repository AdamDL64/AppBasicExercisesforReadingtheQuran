package com.example.BasiceTheQuran;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.BasiceTheQuran.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class Frament extends AppCompatActivity {

    ImageButton ch1p1,ch1b1,h11;
    MediaPlayer sound1,sound2 , sound3 ,sound4,sound5,sound6,
            sound8,sound7 , sound9 ,sound10,sound11,sound12,sound13,sound14 , sound15 ,sound16,sound17,sound18,
            sound19,sound20 , sound21 ,sound22,sound23,sound24,sound25,sound26 , sound27 ,sound28,sound29,sound30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frament);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);


        sound1=MediaPlayer.create(Frament.this,R.raw.vch1n1);
        sound2=MediaPlayer.create(Frament.this,R.raw.vch1n2);
        sound3=MediaPlayer.create(Frament.this,R.raw.vch1n3);
        sound4=MediaPlayer.create(Frament.this,R.raw.vch1n4);
        sound5=MediaPlayer.create(Frament.this,R.raw.vch1n5);
        sound6=MediaPlayer.create(Frament.this,R.raw.vch1n6);
        sound7=MediaPlayer.create(Frament.this,R.raw.vch1n7);
        sound8=MediaPlayer.create(Frament.this,R.raw.vch1n8);
        sound9=MediaPlayer.create(Frament.this,R.raw.vch1n9);
        sound10=MediaPlayer.create(Frament.this,R.raw.vch1n10);
        sound11=MediaPlayer.create(Frament.this,R.raw.vch1n11);
        sound12=MediaPlayer.create(Frament.this,R.raw.vch1n12);
        sound13=MediaPlayer.create(Frament.this,R.raw.vch1n13);
        sound14=MediaPlayer.create(Frament.this,R.raw.vch1n14);
        sound15=MediaPlayer.create(Frament.this,R.raw.vch1n15);
        sound16=MediaPlayer.create(Frament.this,R.raw.vch1n16);
        sound17=MediaPlayer.create(Frament.this,R.raw.vch1n17);
        sound18=MediaPlayer.create(Frament.this,R.raw.vch1n18);
        sound19=MediaPlayer.create(Frament.this,R.raw.vch1n19);
        sound20=MediaPlayer.create(Frament.this,R.raw.vch1n20);
        sound21=MediaPlayer.create(Frament.this,R.raw.vch1n21);
        sound22=MediaPlayer.create(Frament.this,R.raw.vch1n22);
        sound23=MediaPlayer.create(Frament.this,R.raw.vch1n23);
        sound24=MediaPlayer.create(Frament.this,R.raw.vch1n24);
        sound25=MediaPlayer.create(Frament.this,R.raw.vch1n25);
        sound26=MediaPlayer.create(Frament.this,R.raw.vch1n26);
        sound27=MediaPlayer.create(Frament.this,R.raw.vch1n27);
        sound28=MediaPlayer.create(Frament.this,R.raw.vch1n28);
        sound29=MediaPlayer.create(Frament.this,R.raw.vch1n29);
        sound30=MediaPlayer.create(Frament.this,R.raw.vch1n29);




        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    public void Play1(View v){
        sound1.start();

    }
    public void Play2(View v){
        sound2.start();

    }
    public void Play3(View v){
        sound3.start();

    }
    public void Play4(View v){
        sound4.start();

    }

    public void Play5(View v){
        sound5.start();

    }

    public void Play6(View v){
        sound6.start();

    }
    public void Play8(View v){
        sound8.start();

    }
    public void Play9(View v){
        sound9.start();

    }
    public void Play7(View v){
        sound7.start();

    }
    public void Play10(View v){
        sound10.start();

    }

    public void Play11(View v){
        sound11.start();

    }

    public void Play12(View v){
        sound12.start();

    }
    public void Play13(View v){
        sound13.start();


    }
    public void Play14(View v){
        sound14.start();

    }
    public void Play15(View v){
        sound15.start();

    }
    public void Play16(View v){
        sound16.start();

    }
    public void Play17(View v){
        sound17.start();

    }

    public void Play18(View v){
        sound18.start();

    }

    public void Play19(View v){
        sound19.start();

    }
    public void Play20(View v){
        sound20.start();

    }
    public void Play21(View v){
        sound21.start();

    }
    public void Play22(View v){
        sound22.start();

    }
    public void Play23(View v){
        sound23.start();

    }

    public void Play24(View v){
        sound24.start();

    }

    public void Play25(View v){
        sound25.start();

    }
    public void Play26(View v){
        sound26.start();


    }
    public void Play27(View v){
        sound27.start();

    }

    public void Play28(View v){
        sound28.start();

    }

    public void Play29(View v){
        sound29.start();

    }
    public void Play30(View v){
        sound30.start();


    }



}