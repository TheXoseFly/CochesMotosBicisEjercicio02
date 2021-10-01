package com.example.cochesmotosbicisejercicio02;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //1. Atributos para las vistas

    private Button btnCoches;
    private Button btnMotos;
    private Button btnBicis;
    private TextView lbCoches;
    private TextView lbMotos;
    private TextView lbBicis;

    private ActivityResultLauncher<Intent> ventanaCoche;
    private ActivityResultLauncher<Intent> ventanaMoto;
    private ActivityResultLauncher<Intent> ventanaBici;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCoches = findViewById(R.id.btnCochesActivityMain);
        btnMotos = findViewById(R.id.btnMotosActivityMain);
        btnBicis = findViewById(R.id.btnBicisActivityMain);
        lbCoches = findViewById(R.id.txtCochesActivityMain);
        lbMotos = findViewById(R.id.txtMotosActivityMain);
        lbBicis = findViewById(R.id.txtBicisActivityMain);

        btnCoches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaCoche.launch(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        ventanaCoche = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {

            }
        });

        btnMotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaMoto.launch(new Intent(MainActivity.this,MainActivity3.class));
            }
        });
        ventanaMoto = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {

            }
        });

        btnBicis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaBici.launch(new Intent(MainActivity.this,MainActivity4.class));
            }
        });
        ventanaBici = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {

            }
        });
    }

}

/*

tnboton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intentSecond = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intentSecond);
        finish();
        }
        });*/
