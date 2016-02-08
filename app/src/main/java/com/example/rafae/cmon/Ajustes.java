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

    public void Contactos(View view)
    {
        Intent intent = new Intent(this, Contactos.class);
        startActivity(intent);
    }

    public void Perfil(View view)
    {
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void Favoritos(View view)
    {
        Intent intent = new Intent(this, Favoritos.class);
        startActivity(intent);
    }

    public void Inicio(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Ajustes(View view)
    {
        Intent intent = new Intent(this, Ajustes.class);
        startActivity(intent);
    }

}
