package com.example.rafae.cmon;

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

    public void Contactos(View view)
    {
        Intent i = new Intent(this, Contactos.class);
        startActivity(i);
    }


    public void Perfil(View view)
    {
        Intent i = new Intent(this, Perfil.class);
        startActivity(i);
    }

}
