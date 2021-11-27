package com.example.academia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] alunos = {"Huryel","Teste","Teste2"};
        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        Button novoAluno = findViewById(R.id.main_buttonAdd);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbreFormulario = new Intent(MainActivity.this, FormularioActivity.class);
                startActivity(intentAbreFormulario);
            }
        });
    }
}