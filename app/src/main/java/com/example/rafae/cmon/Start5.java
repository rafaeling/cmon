package com.example.rafae.cmon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start5);
    }

    public void Result1(View view)
    {
        Intent intent = new Intent(this, Result1.class); //Cambiar
        startActivity(intent);
    }
}
