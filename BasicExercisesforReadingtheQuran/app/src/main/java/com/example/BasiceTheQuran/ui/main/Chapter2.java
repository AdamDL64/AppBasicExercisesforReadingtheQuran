package com.example.BasiceTheQuran.ui.main;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.BasiceTheQuran.R;
import com.example.BasiceTheQuran.ui.main.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class Chapter2 extends AppCompatActivity {
    MediaPlayer sound1,sound2 , sound3 ,sound4,sound5,sound6, sound8,sound7 , sound9 ,sound10,sound11,
            sound12,sound13,sound14 , sound15 ,sound16,sound17,sound18, sound19,sound20 , sound21 ,sound22,
            sound23,sound24,sound25 , sound26 ,sound27,sound28,sound29,sound30,sound31 , sound32 ,sound33,
            sound34,sound35,sound36,sound37 , sound38 ,sound39,sound40,sound41, sound42,sound43 , sound44 ,
            sound45,sound46,sound47,sound48,sound49 , sound50 ,sound51,sound52,sound53, sound54,sound55 ,
            sound56 ,sound57,sound58,sound59 , sound60 ,sound61,sound62,sound63,sound64,sound65 , sound66 ,
            sound67, sound68,sound69,sound70,sound71 , sound72 ,sound73,sound74,sound75, sound76,sound78 ,
            sound77, sound79 , sound80,sound81,sound82,sound83,sound84 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        sound1=MediaPlayer.create(Chapter2.this,R.raw.vch2n1);
        sound2=MediaPlayer.create(Chapter2.this,R.raw.vch2n2);
        sound3=MediaPlayer.create(Chapter2.this,R.raw.vch2n3);
        sound4=MediaPlayer.create(Chapter2.this,R.raw.vch2n4);
        sound5=MediaPlayer.create(Chapter2.this,R.raw.vch2n5);
        sound6=MediaPlayer.create(Chapter2.this,R.raw.vch2n6);
        sound7=MediaPlayer.create(Chapter2.this,R.raw.vch2n7);
        sound8=MediaPlayer.create(Chapter2.this,R.raw.vch2n8);
        sound9=MediaPlayer.create(Chapter2.this,R.raw.vch2n9);
        sound10=MediaPlayer.create(Chapter2.this,R.raw.vch2n10);
        sound11=MediaPlayer.create(Chapter2.this,R.raw.vch2n11);
        sound12=MediaPlayer.create(Chapter2.this,R.raw.vch2n12);
        sound13=MediaPlayer.create(Chapter2.this,R.raw.vch2n13);
        sound14=MediaPlayer.create(Chapter2.this,R.raw.vch2n14);
        sound15=MediaPlayer.create(Chapter2.this,R.raw.vch2n15);
        sound16=MediaPlayer.create(Chapter2.this,R.raw.vch2n16);
        sound17=MediaPlayer.create(Chapter2.this,R.raw.vch2n17);
        sound18=MediaPlayer.create(Chapter2.this,R.raw.vch2n18);
        sound19=MediaPlayer.create(Chapter2.this,R.raw.vch2n19);
        sound20=MediaPlayer.create(Chapter2.this,R.raw.vch2n20);
        sound21=MediaPlayer.create(Chapter2.this,R.raw.vch2n21);
        sound22=MediaPlayer.create(Chapter2.this,R.raw.vch2n22);
        sound23=MediaPlayer.create(Chapter2.this,R.raw.vch2n23);
        sound24=MediaPlayer.create(Chapter2.this,R.raw.vch2n24);
        sound25=MediaPlayer.create(Chapter2.this,R.raw.vch2n25);
        sound26=MediaPlayer.create(Chapter2.this,R.raw.vch2n26);
        sound27=MediaPlayer.create(Chapter2.this,R.raw.vch2n27);
        sound28=MediaPlayer.create(Chapter2.this,R.raw.vch2n28);
        sound29=MediaPlayer.create(Chapter2.this,R.raw.vch2n29);
        sound30=MediaPlayer.create(Chapter2.this,R.raw.vch2n30);
        sound31=MediaPlayer.create(Chapter2.this,R.raw.vch2n31);
        sound32=MediaPlayer.create(Chapter2.this,R.raw.vch2n32);
        sound33=MediaPlayer.create(Chapter2.this,R.raw.vch2n33);
        sound34=MediaPlayer.create(Chapter2.this,R.raw.vch2n34);
        sound35=MediaPlayer.create(Chapter2.this,R.raw.vch2n35);
        sound36=MediaPlayer.create(Chapter2.this,R.raw.vch2n36);
        sound37=MediaPlayer.create(Chapter2.this,R.raw.vch2n37);
        sound38=MediaPlayer.create(Chapter2.this,R.raw.vch2n38);
        sound39=MediaPlayer.create(Chapter2.this,R.raw.vch2n39);
        sound40=MediaPlayer.create(Chapter2.this,R.raw.vch2n40);
        sound41=MediaPlayer.create(Chapter2.this,R.raw.vch2n41);
        sound42=MediaPlayer.create(Chapter2.this,R.raw.vch2n42);
        sound43=MediaPlayer.create(Chapter2.this,R.raw.vch2n43);
        sound44=MediaPlayer.create(Chapter2.this,R.raw.vch2n44);
        sound45=MediaPlayer.create(Chapter2.this,R.raw.vch2n45);
        sound46=MediaPlayer.create(Chapter2.this,R.raw.vch2n46);
        sound47=MediaPlayer.create(Chapter2.this,R.raw.vch2n48);
        sound48=MediaPlayer.create(Chapter2.this,R.raw.vch2n48);

        sound49=MediaPlayer.create(Chapter2.this,R.raw.vch2n49);
        sound50=MediaPlayer.create(Chapter2.this,R.raw.vch2n50);
        sound51=MediaPlayer.create(Chapter2.this,R.raw.vch2n51);
        sound52=MediaPlayer.create(Chapter2.this,R.raw.vch2n52);
        sound53=MediaPlayer.create(Chapter2.this,R.raw.vch2n53);
        sound54=MediaPlayer.create(Chapter2.this,R.raw.vch2n54);
        sound55=MediaPlayer.create(Chapter2.this,R.raw.vch2n55);
        sound56=MediaPlayer.create(Chapter2.this,R.raw.vch2n56);
        sound57=MediaPlayer.create(Chapter2.this,R.raw.vch2n57);
        sound58=MediaPlayer.create(Chapter2.this,R.raw.vch2n58);
        sound59=MediaPlayer.create(Chapter2.this,R.raw.vch2n59);
        sound60=MediaPlayer.create(Chapter2.this,R.raw.vch2n60);
        sound61=MediaPlayer.create(Chapter2.this,R.raw.vch2n61);
        sound62=MediaPlayer.create(Chapter2.this,R.raw.vch2n62);
        sound63=MediaPlayer.create(Chapter2.this,R.raw.vch2n63);
        sound64=MediaPlayer.create(Chapter2.this,R.raw.vch2n64);
        sound65=MediaPlayer.create(Chapter2.this,R.raw.vch2n65);
        sound66=MediaPlayer.create(Chapter2.this,R.raw.vch2n66);
        sound67=MediaPlayer.create(Chapter2.this,R.raw.vch2n67);
        sound68=MediaPlayer.create(Chapter2.this,R.raw.vch2n68);
        sound69=MediaPlayer.create(Chapter2.this,R.raw.vch2n69);
        sound70=MediaPlayer.create(Chapter2.this,R.raw.vch2n70);
        sound71=MediaPlayer.create(Chapter2.this,R.raw.vch2n71);
        sound72=MediaPlayer.create(Chapter2.this,R.raw.vch2n72);
        sound73=MediaPlayer.create(Chapter2.this,R.raw.vch2n73);
        sound74=MediaPlayer.create(Chapter2.this,R.raw.vch2n74);
        sound75=MediaPlayer.create(Chapter2.this,R.raw.vch2n75);
        sound76=MediaPlayer.create(Chapter2.this,R.raw.vch2n76);
        sound77=MediaPlayer.create(Chapter2.this,R.raw.vch2n77);
        sound78=MediaPlayer.create(Chapter2.this,R.raw.vch2n78);
        sound79=MediaPlayer.create(Chapter2.this,R.raw.vch2n79);
        sound80=MediaPlayer.create(Chapter2.this,R.raw.vch2n80);
        sound81=MediaPlayer.create(Chapter2.this,R.raw.vch2n81);
        sound82=MediaPlayer.create(Chapter2.this,R.raw.vch2n82);
        sound83=MediaPlayer.create(Chapter2.this,R.raw.vch2n83);
        sound84=MediaPlayer.create(Chapter2.this,R.raw.vch2n84);



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    public void Playc2n1(View v){
        sound1.start();

    }
    public void Playc2n2(View v){
        sound2.start();

    }
    public void Playc2n3(View v){
        sound3.start();

    }
    public void Playc2n4(View v){
        sound4.start();

    }

    public void Playc2n5(View v){
        sound5.start();

    }

    public void Playc2n6(View v){
        sound6.start();

    }
    public void Playc2n8(View v){
        sound8.start();

    }
    public void Playc2n9(View v){
        sound9.start();

    }
    public void Playc2n7(View v){
        sound7.start();

    }
    public void Playc2n10(View v){
        sound10.start();

    }

    public void Playc2n11(View v){
        sound11.start();

    }

    public void Playc2n12(View v){
        sound12.start();

    }
    public void Playc2n13(View v){
        sound13.start();


    }
    public void Playc2n14(View v){
        sound14.start();

    }
    public void Playc2n15(View v){
        sound15.start();

    }
    public void Playc2n16(View v){
        sound16.start();

    }
    public void Playc2n17(View v){
        sound17.start();

    }

    public void Playc2n18(View v){
        sound18.start();

    }

    public void Playc2n19(View v){
        sound19.start();

    }
    public void Playc2n20(View v){
        sound20.start();

    }
    public void Playc2n21(View v){
        sound21.start();

    }
    public void Playc2n22(View v){
        sound22.start();

    }
    public void Playc2n23(View v){
        sound23.start();

    }
    public void Playc2n24(View v){
        sound24.start();

    }

    public void Playc2n25(View v){
    sound25.start();

    }
    public void Playc2n26(View v){
        sound26.start();

    }
    public void Playc2n27(View v){
        sound27.start();

    }
    public void Playc2n28(View v){
        sound28.start();

    }
    public void Playc2n29(View v){
        sound29.start();

    }


    public void Playc2n30(View v){
        sound30.start();

    }

    public void Playc2n31(View v){
        sound31.start();

    }
    public void Playc2n32(View v){
        sound32.start();

    }
    public void Playc2n33(View v){
        sound33.start();

    }
    public void Playc2n34(View v){
        sound34.start();

    }
    public void Playc2n35(View v){
        sound35.start();

    }

    public void Playc2n36(View v){
        sound36.start();

    }

    public void Playc2n37(View v){
        sound37.start();

    }
    public void Playc2n38(View v){
        sound38.start();


    }
    public void Playc2n39(View v){
        sound39.start();

    }
    public void Playc2n40(View v){
        sound40.start();

    }
    public void Playc2n41(View v){
        sound42.start();

    }
    public void Playc2n43(View v){
        sound43.start();

    }

    public void Playc2n44(View v){
        sound44.start();

    }

    public void Playc2n45(View v){
        sound45.start();

    }
    public void Playc2n46(View v){
        sound46.start();

    }
    public void Playc2n47(View v){
        sound47.start();

    }
    public void Playc2n48(View v){
        sound48.start();

    }
    public void Playc2n49(View v){
        sound49.start();

    }
    public void Playc2n50(View v){
        sound50.start();

    }

    /////

    public void Playc2n51(View v){
        sound51.start();

    }
    public void Playc2n52(View v){
        sound52.start();

    }
    public void Playc2n53(View v){
        sound53.start();

    }
    public void Playc2n54(View v){
        sound54.start();

    }

    public void Playc2n55(View v){
        sound55.start();

    }

    public void Playc2n56(View v){
        sound56.start();

    }
    public void Playc2n57(View v){
        sound57.start();

    }
    public void Playc2n58(View v){
        sound58.start();

    }
    public void Playc2n59(View v){
        sound59.start();

    }
    public void Playc2n60(View v){
        sound60.start();

    }

    public void Playc2n61(View v){
        sound61.start();

    }

    public void Playc2n62(View v){
        sound62.start();

    }
    public void Playc2n63(View v){
        sound63.start();


    }
    public void Playc2n64(View v){
        sound64.start();

    }
    public void Playc2n65(View v){
        sound65.start();

    }
    public void Playc2n66(View v){
        sound66.start();

    }
    public void Playc2n67(View v){
        sound67.start();

    }

    public void Playc2n68(View v){
        sound68.start();

    }

    public void Playc2n69(View v){
        sound69.start();

    }
    public void Playc2n70(View v){
        sound70.start();

    }
    public void Playc2n71(View v){
        sound71.start();

    }
    public void Playc2n72(View v){
        sound72.start();

    }
    public void Playc2n73(View v){
        sound73.start();

    }
    public void Playc2n74(View v){
        sound74.start();

    }

    public void Playc2n75(View v){
        sound75.start();

    }
    public void Playc2n76(View v){
        sound76.start();

    }
    public void Playc2n77(View v){
        sound77.start();

    }
    public void Playc2n78(View v){
        sound78.start();

    }
    public void Playc2n79(View v){
        sound79.start();

    }

    public void Playc2n80(View v){
        sound80.start();

    }

    public void Playc2n81(View v){
        sound81.start();

    }
    public void Playc2n82(View v){
        sound82.start();

    }
    public void Playc2n83(View v){
        sound83.start();

    }
    public void Playc2n84(View v){
        sound84.start();

    }

}