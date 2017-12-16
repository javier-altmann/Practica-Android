package com.example.caro.practicaandroid;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.caro.practicaandroid.Models.Usuario;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String TEXTO = "Hola mundo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Usuario user = new Usuario(1,"javier.altmann",21);

        btn = findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SegundoActivity.class);

                //intent.putExtra("texto",TEXTO);
               intent.putExtra("user", (Serializable) user);

                startActivity(intent);
            }
        });
    }
}
