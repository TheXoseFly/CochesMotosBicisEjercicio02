package com.example.cochesmotosbicisejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private Button btnCancelar;
    private Button btnCrear;
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtCilindrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnCancelar = findViewById(R.id.btnCancelarMotoMain3);
        btnCrear = findViewById(R.id.btnCrearMotoMain3);

    }
}