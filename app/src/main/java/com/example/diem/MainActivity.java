package com.example.diem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView IdTexto_1,IdTexto_2;
    Button IdBoton_1, IdBoton_2, IdBoton_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdTexto_1 = (TextView) findViewById(R.id.IdTexto_1);
        IdTexto_2 = (TextView) findViewById(R.id.IdTexto_2);

        IdBoton_1 = (Button) findViewById(R.id.IdBoton_1);
        IdBoton_2 = (Button) findViewById(R.id.IdBoton_2);
        IdBoton_3 = (Button) findViewById(R.id.IdBoton_3);

        IdBoton_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                Toast.makeText(getBaseContext(), "Se ha presionado el boton 1", Toast.LENGTH_SHORT).show();

            }
        });

        IdBoton_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                Toast.makeText(getBaseContext(), "Se ha presionado el boton 2", Toast.LENGTH_SHORT).show();

            }
        });

        IdBoton_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                Toast.makeText(getBaseContext(), "Se ha presionado el boton 3", Toast.LENGTH_SHORT).show();

            }
        });
    }
}