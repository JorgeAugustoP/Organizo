package com.example.uninorte.organizo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.uninorte.organizo.adapter.RecyclerViewOnClickListener;
import com.example.uninorte.organizo.adapter.TarefasAdapter;
import com.example.uninorte.organizo.classes.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewOnClickListener{

    RecyclerView rvLista;
    private List<Tarefas> trLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLista = (RecyclerView) findViewById(R.id.rv_lista);
        rvLista.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rvLista.setLayoutManager(manager);

        trLista = (this.setList());
        TarefasAdapter adapter = new TarefasAdapter(this, trLista);
        adapter.setRecyclerViewOnClickListener(this);
        rvLista.setAdapter(adapter);

    }


    public List<Tarefas> setList (){
        String[] titulos = new String[]{"Tarefa 1", "Tarefa 2", "Tarefa 3", "Tarefa 4", "Tarefa 5",};
        String[] detalhes = new String[]{"Trabalho | Alta", "Estudo | Alta", "Outros | Média", "Outros | Baixa", "Estudo | Baixa"};
        String[] datas = new String[] {"Amanhã", "05/05/2018", "20/05/2018", "Amanhã", "17/05/2018"};
        int[] cores = new int[]{R.color.pAlta,
                R.color.pAlta,
                R.color.pMedia,
                R.color.pBaixa,
                R.color.pBaixa};

        List<Tarefas> list = new ArrayList<>();

        for (int i=0; i<20; i++){
            Tarefas tarefas = new Tarefas(titulos[i % titulos.length], datas[i % datas.length], detalhes[i % detalhes.length],  cores[i % cores.length]);
            list.add(tarefas);
        }

        return list;
    }

    @Override
    public void onClickListener(View view, int position) {
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
    }
}
