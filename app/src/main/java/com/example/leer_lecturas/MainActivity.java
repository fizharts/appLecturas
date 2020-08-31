package com.example.leer_lecturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // aqui van las variables
    private Button btn_accion;
    private final String GREETER = "HOla desde el otro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_accion = (Button) findViewById(R.id.btn_presentacion);
        btn_accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola a todos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(
                        MainActivity.this,
                        Contenido.class
                );
                intent.putExtra(
                        "greeter",
                        GREETER
                );
                startActivity(intent);


            }
        });

    }

}