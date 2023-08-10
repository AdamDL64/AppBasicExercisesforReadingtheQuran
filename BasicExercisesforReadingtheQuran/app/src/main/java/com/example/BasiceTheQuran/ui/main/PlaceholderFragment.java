package com.example.BasiceTheQuran.ui.main;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.BasiceTheQuran.R;

/**
 * A placeholder fragment containing a simple view.
 */

public class PlaceholderFragment extends Fragment {
    MediaPlayer sound1,sound2 , sound3 ,sound4,sound5,sound6 ;

    private static final String ARG_SECTION_NUMBER = "section_number";




    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);

        return fragment;



    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }

    }


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_frament, container, false);

        final TextView textView = root.findViewById(R.id.section_label);

        return root;


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

}