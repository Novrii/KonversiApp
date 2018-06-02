package com.example.kid.konversiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MenuSejarah extends AppCompatActivity {
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sejarah);

        gambar = (ImageView) findViewById(R.id.imageView);
        gambar.setImageResource(R.drawable.man);
    }
}
