package com.example.academia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.academia.DAO.AlunoDAO;
import com.example.academia.modelo.Aluno;

public class FormularioActivity extends AppCompatActivity {

    FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        helper = new FormularioHelper(this);

        Button buttonSalvar = findViewById(R.id.formulario_buttonSalvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastraAluno();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_formulario_ok:
                cadastraAluno();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void cadastraAluno() {
        Aluno aluno = helper.getAluno();
        AlunoDAO dao= new AlunoDAO(this);
        dao.insere(aluno);
        dao.close();

        Toast.makeText(FormularioActivity.this, "Cadastrado!", Toast.LENGTH_SHORT).show();
        finish();
    }
}