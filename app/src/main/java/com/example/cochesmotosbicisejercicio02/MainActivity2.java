package com.example.cochesmotosbicisejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button btnCancelar;
    private Button btnCrear;
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnCancelar = findViewById(R.id.btnCancelarMain2);
        btnCrear = findViewById(R.id.btnCrearCocheMain2);
        txtMarca = findViewById(R.id.txtMarcaCocheMain2);
        txtModelo = findViewById(R.id.txtModeloCocheMain2);
        txtColor = findViewById(R.id.txtColorCocheMain2);

    }
}