package com.example.BasiceTheQuran;

import java.util.Random;

public class BacaanHarokat {

    private int listhuruf[] = {
            R.drawable.pop_ain,
            R.drawable.pop_ba,
            R.drawable.pop_ta,
            R.drawable.pop_haa,
            R.drawable.pop_jim,
            R.drawable.pop_tha,
            R.drawable.pop_wawu,
            R.drawable.pop_tsa,
            R.drawable.pop_qaf,
            R.drawable.pop_lam,
            R.drawable.pop_mim,
            R.drawable.pop_nun,
            R.drawable.pop_ha,
            R.drawable.pop_alif,
            R.drawable.pop_ra,
            R.drawable.pop_zai,
            R.drawable.pop_ya,
            R.drawable.pop_kha,
            R.drawable.pop_dal,
            R.drawable.pop_shad
    };

    private int listhuruf2[] = {
            R.drawable.b_hijaiyah_ain,
            R.drawable.b_hijaiyah_ba,
            R.drawable.b_hijaiyah_ta,
            R.drawable.b_hijaiyah_dha,
            R.drawable.b_hijaiyah_dha,
            R.drawable.b_hijaiyah_dza,
            R.drawable.b_hijaiyah_dzha,
            R.drawable.b_hijaiyah_fa,
            R.drawable.b_hijaiyah_ghain,
            R.drawable.b_hijaiyah_ha,
            R.drawable.b_hijaiyah_haa,
            R.drawable.b_hijaiyah_jim,
            R.drawable.b_hijaiyah_lam,
            R.drawable.b_hijaiyah_mim,
            R.drawable.b_hijaiyah_nun,
            R.drawable.b_hijaiyah_zai,
            R.drawable.b_hijaiyah_ya,
            R.drawable.b_hijaiyah_wau,
            R.drawable.b_hijaiyah_ta,
            R.drawable.b_hijaiyah_ghain
    };

    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }}
