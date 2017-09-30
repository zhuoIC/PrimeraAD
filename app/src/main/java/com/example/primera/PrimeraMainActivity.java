package com.example.primera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

/**
 * Esta clase muestra una imagen con la hora local que se actualiza al pulsar el botón
 * @author Nicolás Hernández Jiménez
 */

public class PrimeraMainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView texto;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        actualizar();
    }

    @Override
    public void onClick(View view) {
        if (view == button)
        {
            actualizar();
        }
    }

    // Muestra en el TextView la hora actual
    private void actualizar() {
        texto.setText(new Date().toString());
    }

}
