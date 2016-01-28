package com.example.rafae.cmon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class Perfil2 extends ActionBarActivity {

    private Boolean chilaut = false;
    private Boolean compras = false;
    private Boolean deportes = false;
    private Boolean espectaculos = false;
    private Boolean restaurante = false;
    private Boolean tapear = false;
    private Boolean monumentos = false;
    private Boolean museos = false;
    private Boolean musica = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);
    }

    public void Perfil4(View view)
    {
        Intent i = new Intent(this, Perfil2.class);
        startActivity(i);
    }


    public void Chilaut(View view)
    {
        if(chilaut == true)
        {

            ImageView img= (ImageView) findViewById(R.id.chilaut);
            img.setImageResource(R.drawable.chilaut_boton_on);
            chilaut = false;

        }else{

            ImageView img= (ImageView) findViewById(R.id.chilaut);
            img.setImageResource(R.drawable.chilaut_boton_off);
            chilaut = true;

        }
    }

    public void Compras(View view)
    {
        if (compras == true)
        {
            ImageView img = (ImageView) findViewById(R.id.compras);
            img.setImageResource(R.drawable.compras_boton_on);
            compras = false;
        }else{

            ImageView img = (ImageView) findViewById(R.id.compras);
            img.setImageResource(R.drawable.compras_boton_off);
            compras = true;
        }
    }

    public void Deportes(View view)
    {

        if(deportes == true)
        {
            ImageView img= (ImageView) findViewById(R.id.deportes);
            img.setImageResource(R.drawable.deportes_boton_on);
            deportes = false;
        }else
        {
            ImageView img= (ImageView) findViewById(R.id.deportes);
            img.setImageResource(R.drawable.deportes_boton_off);
            deportes = true;
        }
    }

    public void Espectaculos(View view)
    {
        if(espectaculos == true)
        {
            ImageView img= (ImageView) findViewById(R.id.espectaculos);
            img.setImageResource(R.drawable.espectaculos_boton_on);
            espectaculos = false;

        }else
        {
            ImageView img= (ImageView) findViewById(R.id.espectaculos);
            img.setImageResource(R.drawable.espectaculos_boton_off);
            espectaculos = true;
        }
    }

    public void Restaurante(View view)
    {
        if(restaurante == true)
        {
            ImageView img= (ImageView) findViewById(R.id.restaurante);
            img.setImageResource(R.drawable.restaurante_boton_on);
            restaurante = false;
        }else
        {
            ImageView img= (ImageView) findViewById(R.id.restaurante);
            img.setImageResource(R.drawable.restaurante_boton_off);
            restaurante = true;
        }
    }

    public void Tapear(View view)
    {
        if(tapear == true)
        {
            ImageView img= (ImageView) findViewById(R.id.tapear);
            img.setImageResource(R.drawable.tapear_boton_on);
            tapear=false;

        }else
        {
            ImageView img= (ImageView) findViewById(R.id.tapear);
            img.setImageResource(R.drawable.tapear_boton_off);
            tapear = true;
        }
    }

    public void Monumentos(View view)
    {
        if(monumentos == true)
        {
            ImageView img= (ImageView) findViewById(R.id.monumentos);
            img.setImageResource(R.drawable.monumentos_boton_on);
            monumentos = false;

        }else
        {
            ImageView img= (ImageView) findViewById(R.id.monumentos);
            img.setImageResource(R.drawable.monumentos_boton_off);
            monumentos = true;
        }
    }

    public void Museos(View view)
    {
        if(museos == true)
        {
            ImageView img= (ImageView) findViewById(R.id.museos);
            img.setImageResource(R.drawable.museos_boton_on);
            museos = false;

        }else
        {
            ImageView img= (ImageView) findViewById(R.id.museos);
            img.setImageResource(R.drawable.museos_boton_off);
            museos = true;
        }
    }

    public void Musica(View view)
    {
        if(musica == true)
        {
            ImageView img= (ImageView) findViewById(R.id.musica);
            img.setImageResource(R.drawable.musica_boton_on);
            musica = false;

        }else
        {
            ImageView img= (ImageView) findViewById(R.id.musica);
            img.setImageResource(R.drawable.musica_boton_off);
            musica = true;
        }
    }

}
