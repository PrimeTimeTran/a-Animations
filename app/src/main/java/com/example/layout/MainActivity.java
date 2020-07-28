package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean bartIsShowing = true;

    public void fade(View view) {
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);


//        Left
        bartImageView.animate().translationXBy(-1000).setDuration(2000);

//        Right
        bartImageView.animate().translationYBy(1000).setDuration(2000);

//        Fade In/Out in/out bart/homer
//        if (bartIsShowing) {
//            bartIsShowing = false;
//            bartImageView.animate().alpha(0).setDuration(1000);
//            homerImageView.animate().alpha(1).setDuration(2000);
//        } else {
//            bartIsShowing = true;
//            bartImageView.animate().alpha(1).setDuration(1000);
//            homerImageView.animate().alpha(0).setDuration(2000);
//        }

    }

}