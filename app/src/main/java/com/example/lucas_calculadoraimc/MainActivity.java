package com.example.lucas_calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        editIdade = findViewById(R.id.editIdade);
        editSexo = findViewById(R.id.editSexo);
        textViewResultado = findViewById(R.id.txtResultado);
    }
    EditText editPeso,editAltura,editIdade,editSexo;
    TextView textViewResultado;
    float peso, altura;
    int idade;
    String sexo;
    public void Calcula(View view){
        peso = Float.parseFloat(editPeso.getText().toString());
        altura = Float.parseFloat(editAltura.getText().toString());
        idade = Integer.parseInt(editIdade.getText().toString());
        sexo = (editSexo.getText().toString().equals("Masculino")) ? "M" : "F";
        String resultado = "oi";
        textViewResultado.setText(Integer.valueOf(resultado));
    }
}