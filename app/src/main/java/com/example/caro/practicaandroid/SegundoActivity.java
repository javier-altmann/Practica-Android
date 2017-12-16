package com.example.caro.practicaandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.caro.practicaandroid.Models.Usuario;

public class SegundoActivity extends AppCompatActivity {

    private TextView txtView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        txtView = (TextView) findViewById(R.id.textView);
        context = this;

        Bundle bundle = getIntent().getExtras();

       if(bundle != null ){
          String texto = bundle.getString("texto");
          txtView.setText(texto);

          Toast.makeText(context,texto,Toast.LENGTH_SHORT);
          Usuario user = (Usuario) bundle.getSerializable("user");
        
        }else{
            Toast.makeText(context,"Error",Toast.LENGTH_SHORT);
        }
    }
}
