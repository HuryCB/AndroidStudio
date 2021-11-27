package com.example.academia;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.academia.modelo.Aluno;

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity){
         campoNome = activity.findViewById(R.id.formulario_nome);
       // String nome = campoNome.getText().toString();

         campoEndereco = activity.findViewById(R.id.formulario_endereco);
       // String endereco = campoEndereco.getText().toString();

         campoTelefone = activity.findViewById(R.id.formulario_telefone);
      //  String telefone = campoTelefone.getText().toString();

         campoSite = activity.findViewById(R.id.formulario_site);
       // String site = campoSite.getText().toString();

         campoNota = activity.findViewById(R.id.formulario_nota);
    }

    public Aluno getAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}
