package com.example.rafae.cmon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start4);
    }

    public void Pregunta5(View view)
    {
        Intent intent = new Intent(this, Start5.class);
        startActivity(intent);
    }
}
