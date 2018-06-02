package com.example.kid.konversiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihanSejarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_sejarah);

    }


    public void onPilihan(View view){
        Intent i = new Intent(this, MenuSejarah.class);
        startActivity(i);
    }

    public void onCelcius(View view){
        Intent i = new Intent(this, SejarahCelcius.class);
        startActivity(i);
    }
}
