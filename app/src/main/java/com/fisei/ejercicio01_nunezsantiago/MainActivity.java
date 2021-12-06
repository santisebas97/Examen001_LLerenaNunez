package com.fisei.ejercicio01_nunezsantiago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numeroA;
    private EditText numeroB;
    private TextView resultado;
    private Button sumar;
    private Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroA = findViewById(R.id.editTextNumeroA);
        numeroB = findViewById(R.id.editTextNumeroB);
        resultado = findViewById(R.id.textViewResultado);
        sumar = findViewById(R.id.buttonSumar);
        siguiente = findViewById(R.id.buttonSiguiente);
    }
}