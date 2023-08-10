package com.example.BasiceTheQuran.ui.main.ui.main;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.BasiceTheQuran.R;
import com.example.BasiceTheQuran.ui.main.ui.main.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class Chapter3 extends AppCompatActivity {
    MediaPlayer sound1,sound2 , sound3 ,sound4,sound5,sound6,
            sound8,sound7 , sound9 ,sound10,sound11,sound12,sound13,sound14 , sound15 ,sound16,sound17,sound18,
            sound19,sound20 , sound21 ,sound22,sound23,sound24,sound25 , sound26 ,sound27,sound28,sound29,sound30,sound31 , sound32 ,sound33,
            sound34,sound35,sound36,sound37 , sound38 ,sound39,sound40,sound41, sound42,sound43 , sound44 ,
            sound45,sound46,sound47,sound48,sound49 , sound50 ,sound51,sound52,sound53, sound54,sound55 ,
            sound56 ,sound57,sound58,sound59 , sound60 ,sound61,sound62,sound63,sound64,sound65 , sound66 ,
            sound67, sound68,sound69,sound70,sound71 , sound72 ,sound73,sound74,sound75, sound76,sound78 ,
            sound77, sound79 , sound80,sound81,sound82,sound83,sound84;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);
        sound1=MediaPlayer.create(Chapter3.this,R.raw.ch3n1);
        sound2=MediaPlayer.create(Chapter3.this,R.raw.ch3n2);
        sound3=MediaPlayer.create(Chapter3.this,R.raw.ch3n3);
        sound4=MediaPlayer.create(Chapter3.this,R.raw.ch3n4);
        sound5=MediaPlayer.create(Chapter3.this,R.raw.ch3n5);
        sound6=MediaPlayer.create(Chapter3.this,R.raw.ch3n6);

        sound7=MediaPlayer.create(Chapter3.this,R.raw.ch3n7);
        sound8=MediaPlayer.create(Chapter3.this,R.raw.ch3n8);
        sound9=MediaPlayer.create(Chapter3.this,R.raw.ch3n9);
        sound10=MediaPlayer.create(Chapter3.this,R.raw.ch3n10);
        sound11=MediaPlayer.create(Chapter3.this,R.raw.ch3n11);
        sound12=MediaPlayer.create(Chapter3.this,R.raw.ch3n12);
        sound13=MediaPlayer.create(Chapter3.this,R.raw.ch3n13);
        sound14=MediaPlayer.create(Chapter3.this,R.raw.ch3n14);
        sound15=MediaPlayer.create(Chapter3.this,R.raw.ch3n15);
        sound16=MediaPlayer.create(Chapter3.this,R.raw.ch3n16);
        sound17=MediaPlayer.create(Chapter3.this,R.raw.ch3n17);
        sound18=MediaPlayer.create(Chapter3.this,R.raw.ch3n18);
        sound19=MediaPlayer.create(Chapter3.this,R.raw.ch3n19);
        sound20=MediaPlayer.create(Chapter3.this,R.raw.ch3n20);
        sound21=MediaPlayer.create(Chapter3.this,R.raw.ch3n21);
        sound22=MediaPlayer.create(Chapter3.this,R.raw.ch3n22);
        sound23=MediaPlayer.create(Chapter3.this,R.raw.ch3n23);
        sound24=MediaPlayer.create(Chapter3.this,R.raw.ch3n24);
        sound25=MediaPlayer.create(Chapter3.this,R.raw.ch3n25);
        sound26=MediaPlayer.create(Chapter3.this,R.raw.ch3n26);
        sound27=MediaPlayer.create(Chapter3.this,R.raw.ch3n27);
        sound28=MediaPlayer.create(Chapter3.this,R.raw.ch3n28);
        sound29=MediaPlayer.create(Chapter3.this,R.raw.ch3n29);
        sound30=MediaPlayer.create(Chapter3.this,R.raw.ch3n30);
        sound31=MediaPlayer.create(Chapter3.this,R.raw.ch3n31);
        sound32=MediaPlayer.create(Chapter3.this,R.raw.ch3n32);
        sound33=MediaPlayer.create(Chapter3.this,R.raw.ch3n33);
        sound34=MediaPlayer.create(Chapter3.this,R.raw.ch3n34);
        sound35=MediaPlayer.create(Chapter3.this,R.raw.ch3n35);
        sound36=MediaPlayer.create(Chapter3.this,R.raw.ch3n36);
        sound37=MediaPlayer.create(Chapter3.this,R.raw.ch3n27);
        sound38=MediaPlayer.create(Chapter3.this,R.raw.ch3n38);
        sound39=MediaPlayer.create(Chapter3.this,R.raw.ch3n39);
        sound40=MediaPlayer.create(Chapter3.this,R.raw.ch3n40);
        sound41=MediaPlayer.create(Chapter3.this,R.raw.ch3n41);
        sound42=MediaPlayer.create(Chapter3.this,R.raw.ch3n42);
        sound43=MediaPlayer.create(Chapter3.this,R.raw.ch3n43);
        sound44=MediaPlayer.create(Chapter3.this,R.raw.ch3n44);
        sound45=MediaPlayer.create(Chapter3.this,R.raw.ch3n45);
        sound46=MediaPlayer.create(Chapter3.this,R.raw.ch3n46);
        sound47=MediaPlayer.create(Chapter3.this,R.raw.ch3n47);
        sound48=MediaPlayer.create(Chapter3.this,R.raw.ch3n48);
        sound49=MediaPlayer.create(Chapter3.this,R.raw.ch3n49);
        sound50=MediaPlayer.create(Chapter3.this,R.raw.ch3n50);
        sound51=MediaPlayer.create(Chapter3.this,R.raw.ch3n51);
        sound52=MediaPlayer.create(Chapter3.this,R.raw.ch3n52);
        sound53=MediaPlayer.create(Chapter3.this,R.raw.ch3n53);
        sound54=MediaPlayer.create(Chapter3.this,R.raw.ch3n54);
        sound55=MediaPlayer.create(Chapter3.this,R.raw.ch3n55);
        sound56=MediaPlayer.create(Chapter3.this,R.raw.ch3n56);
        sound57=MediaPlayer.create(Chapter3.this,R.raw.ch3n57);
        sound58=MediaPlayer.create(Chapter3.this,R.raw.ch3n58);
        sound59=MediaPlayer.create(Chapter3.this,R.raw.ch3n59);
        sound60=MediaPlayer.create(Chapter3.this,R.raw.ch3n60);
        sound61=MediaPlayer.create(Chapter3.this,R.raw.ch3n61);
        sound62=MediaPlayer.create(Chapter3.this,R.raw.ch3n62);
        sound63=MediaPlayer.create(Chapter3.this,R.raw.ch3n63);
        sound64=MediaPlayer.create(Chapter3.this,R.raw.ch3n64);
        sound65=MediaPlayer.create(Chapter3.this,R.raw.ch3n65);
        sound66=MediaPlayer.create(Chapter3.this,R.raw.ch3n66);
        sound67=MediaPlayer.create(Chapter3.this,R.raw.ch3n67);
        sound68=MediaPlayer.create(Chapter3.this,R.raw.ch3n68);
        sound69=MediaPlayer.create(Chapter3.this,R.raw.ch3n69);
        sound70=MediaPlayer.create(Chapter3.this,R.raw.ch3n70);
        sound71=MediaPlayer.create(Chapter3.this,R.raw.ch3n71);
        sound72=MediaPlayer.create(Chapter3.this,R.raw.ch3n72);
        sound73=MediaPlayer.create(Chapter3.this,R.raw.ch3n73);
        sound74=MediaPlayer.create(Chapter3.this,R.raw.ch3n74);
        sound75=MediaPlayer.create(Chapter3.this,R.raw.ch3n75);
        sound76=MediaPlayer.create(Chapter3.this,R.raw.ch3n76);
        sound77=MediaPlayer.create(Chapter3.this,R.raw.ch3n77);
        sound78=MediaPlayer.create(Chapter3.this,R.raw.ch3n78);
        sound79=MediaPlayer.create(Chapter3.this,R.raw.ch3n79);
        sound80=MediaPlayer.create(Chapter3.this,R.raw.ch3n80);
        sound81=MediaPlayer.create(Chapter3.this,R.raw.ch3n81);
        sound82=MediaPlayer.create(Chapter3.this,R.raw.ch3n82);
        sound83=MediaPlayer.create(Chapter3.this,R.raw.ch3n83);
        sound84=MediaPlayer.create(Chapter3.this,R.raw.ch3n84);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void Playc3n1(View v){
        sound1.start();

    }
    public void Playc3n2(View v){
        sound2.start();

    }
    public void Playc3n3(View v){
        sound3.start();

    }
    public void Playc3n4(View v){
        sound4.start();

    }

    public void Playc3n5(View v){
        sound5.start();

    }

    public void Playc3n6(View v){
        sound6.start();

    }
    public void Playc3n8(View v){
        sound8.start();

    }
    public void Playc3n9(View v){
        sound9.start();

    }
    public void Playc3n7(View v){
        sound7.start();

    }
    public void Playc3n10(View v){
        sound10.start();

    }

    public void Playc3n11(View v){
        sound11.start();

    }

    public void Playc3n12(View v){
        sound12.start();

    }
    public void Playc3n13(View v){
        sound13.start();


    }
    public void Playc3n14(View v){
        sound14.start();

    }
    public void Playc3n15(View v){
        sound15.start();

    }
    public void Playc3n16(View v){
        sound16.start();

    }
    public void Playc3n17(View v){
        sound17.start();

    }

    public void Playc3n18(View v){
        sound18.start();

    }

    public void Playc3n19(View v){
        sound19.start();

    }
    public void Playc3n20(View v){
        sound20.start();

    }
    public void Playc3n21(View v){
        sound21.start();

    }
    public void Playc3n22(View v){
        sound22.start();

    }
    public void Playc3n23(View v){
        sound23.start();

    }
    public void Playc3n24(View v){
        sound24.start();

    }

    public void Playc3n25(View v){
        sound25.start();

    }
    public void Playc3n26(View v){
        sound26.start();

    }
    public void Playc3n27(View v){
        sound27.start();

    }
    public void Playc3n28(View v){
        sound28.start();

    }
    public void Playc3n29(View v){
        sound29.start();

    }


    public void Playc3n30(View v){
        sound30.start();

    }

    public void Playc3n31(View v){
        sound31.start();

    }
    public void Playc3n32(View v){
        sound32.start();

    }
    public void Playc3n33(View v){
        sound33.start();

    }
    public void Playc3n34(View v){
        sound34.start();

    }
    public void Playc3n35(View v){
        sound35.start();

    }

    public void Playc3n36(View v){
        sound36.start();

    }

    public void Playc3n37(View v){
        sound37.start();

    }
    public void Playc3n38(View v){
        sound38.start();


    }
    public void Playc3n39(View v){
        sound39.start();

    }
    public void Playc3n40(View v){
        sound40.start();

    }
    public void Playc3n41(View v){
        sound42.start();

    }
    public void Playc3n43(View v){
        sound43.start();

    }

    public void Playc3n44(View v){
        sound44.start();

    }

    public void Playc3n45(View v){
        sound45.start();

    }
    public void Playc3n46(View v){
        sound46.start();

    }
    public void Playc3n47(View v){
        sound47.start();

    }
    public void Playc3n48(View v){
        sound48.start();

    }
    public void Playc3n49(View v){
        sound49.start();

    }
    public void Playc3n50(View v){
        sound50.start();

    }

    /////

    public void Playc3n51(View v){
        sound51.start();

    }
    public void Playc3n52(View v){
        sound52.start();

    }
    public void Playc3n53(View v){
        sound53.start();

    }
    public void Playc3n54(View v){
        sound54.start();

    }

    public void Playc3n55(View v){
        sound55.start();

    }

    public void Playc3n56(View v){
        sound56.start();

    }
    public void Playc3n57(View v){
        sound57.start();

    }
    public void Playc3n58(View v){
        sound58.start();

    }
    public void Playc3n59(View v){
        sound59.start();

    }
    public void Playc3n60(View v){
        sound60.start();

    }

    public void Playc3n61(View v){
        sound61.start();

    }

    public void Playc3n62(View v){
        sound62.start();

    }
    public void Playc3n63(View v){
        sound63.start();


    }
    public void Playc3n64(View v){
        sound64.start();

    }
    public void Playc3n65(View v){
        sound65.start();

    }
    public void Playc3n66(View v){
        sound66.start();

    }
    public void Playc3n67(View v){
        sound67.start();

    }

    public void Playc3n68(View v){
        sound68.start();

    }

    public void Playc3n69(View v){
        sound69.start();

    }
    public void Playc3n70(View v){
        sound70.start();

    }
    public void Playc3n71(View v){
        sound71.start();

    }
    public void Playc3n72(View v){
        sound72.start();

    }
    public void Playc3n73(View v){
        sound73.start();

    }
    public void Playc3n74(View v){
        sound74.start();

    }

    public void Playc3n75(View v){
        sound75.start();

    }
    public void Playc3n76(View v){
        sound76.start();

    }
    public void Playc3n77(View v){
        sound77.start();

    }
    public void Playc3n78(View v){
        sound78.start();

    }
    public void Playc3n79(View v){
        sound79.start();

    }

    public void Playc3n80(View v){
        sound80.start();

    }

    public void Playc3n81(View v){
        sound81.start();

    }
    public void Playc3n82(View v){
        sound82.start();

    }
    public void Playc3n83(View v){
        sound83.start();

    }
    public void Playc3n84(View v){
        sound84.start();

    }
}

