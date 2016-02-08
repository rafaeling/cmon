package com.example.rafae.cmon;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.rafae.cmon.R.layout.activity_contactos;

public class Contactos extends AppCompatActivity {

    private String[] contactos = { "Alberto", "Vicente", "Alba", "Rafael",
            "Francisco", "Antonio", "Juan" };

    private String[] telefono = { "605987748", "698325147", "632145987",
            "659874123", "687495123", "698325471", "632145789" };

    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_contactos);
        tv1=(TextView)findViewById(R.id.tv1);
        lv1 =(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, contactos);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                tv1.setText(" El teléfono de "+ lv1.getItemAtPosition(posicion) + " es "+ telefono[posicion]);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(activity_contactos, menu);
        return true;
    }
}
