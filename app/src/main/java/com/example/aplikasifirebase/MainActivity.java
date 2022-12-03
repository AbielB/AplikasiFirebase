package com.example.aplikasifirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //create function pindah() that move to other activity
    public void pindah(View view) {
        // create intent
        Intent intent = new Intent(this, TambahMhsActivity.class);
        // start activity
        startActivity(intent);
    }

    //create function listMhs() that move to ListMhsActivity
    public void listMhs(View view) {
        // create intent
        Intent intent = new Intent(this, ListMhsActivity.class);
        // start activity
        startActivity(intent);
    }
}