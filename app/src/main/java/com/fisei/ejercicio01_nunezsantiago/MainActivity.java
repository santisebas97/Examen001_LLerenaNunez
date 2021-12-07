package com.fisei.ejercicio01_nunezsantiago;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numeroA;
    private EditText numeroB;
    private TextView resultado;
    private Button sumar;
    private Button siguiente;
    int[]resultados;
    private String resultado1;


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
        //intent.putExtra("key_A", numeroA);
        this.startActivity(intent);
    }

    public void Sumar(View view){
        String numA = numeroA.getText().toString();
        String numB = numeroB.getText().toString();

        char[] A = numA.toCharArray();
        char[] B = numB.toCharArray();


        if(A.length==B.length){
             resultados=new int[A.length];
            for(int i=0; i<=A.length;i++){

                 resultados[i] = Integer.valueOf(A[i])+Integer.valueOf(B[i]);
            }
        }else{
            Toast.makeText(this, "Ingrese numeros de igual longitud",Toast.LENGTH_LONG).show();
        }

/*
        for(int i=0;i<=A.length;i++){
            resultado1 += (resultados[i] + "\n");
        }

        resultado.setText(resultado1);
*/
    }



}