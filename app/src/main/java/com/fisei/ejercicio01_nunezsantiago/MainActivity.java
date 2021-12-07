package com.fisei.ejercicio01_nunezsantiago;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    public void Siguiente(View view){
        Intent intent = new Intent(this, SegundaActividad.class);
        this.startActivity(intent);
    }

    public void Sumar(View view){
            String numA = numeroA.getText().toString();
        String numB = numeroB.getText().toString();

        char[] A = numA.toCharArray();
        char[] B = numB.toCharArray();


        if(A.length==B.length){
            int[] resultados=new int[A.length];
            for(int i=0; i<=A.length;i++){

                 resultados[i] = Integer.valueOf(A[1])+Integer.valueOf(B[i]);
            }
        }

        //resultado.setText(String.valueOf());



    }

}