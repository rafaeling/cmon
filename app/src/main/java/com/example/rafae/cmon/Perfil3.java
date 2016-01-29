package com.example.rafae.cmon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Perfil3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil3);
    }

    public void Perfil5(View view)
    {
        Intent intent = new Intent(this, Perfil5.class);
        startActivity(intent);
    }

    public void Perfil4(View view)
    {
        Intent intent = new Intent(this, Perfil4.class);
        startActivity(intent);
    }
}
