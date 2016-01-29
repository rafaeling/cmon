package com.example.rafae.cmon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ajustes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
    }

    public void Ayuda(View view)
    {
        Intent i = new Intent(this, Ayuda.class);
        startActivity(i);
    }

    public void DarBaja(View view)
    {
        Intent i = new Intent(this, DarBaja.class);
        startActivity(i);
    }

    public void Notificaciones(View view)
    {
        Intent i = new Intent(this, Notificaciones.class);
        startActivity(i);
    }

}
