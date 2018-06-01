package com.example.kid.konversiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onSejarah (View view){
        Intent i = new Intent(this, MenuSejarah.class);
        startActivity(i);
    }

    public void onKonversi (View view){
        Intent i = new Intent(this, MenuKonversi.class);
        startActivity(i);
    }


}
