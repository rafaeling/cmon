package com.example.rafae.cmon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Notificaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
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
