package com.example.uninorte.organizo.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.uninorte.organizo.R;
import com.example.uninorte.organizo.classes.Tarefas;

import java.util.List;

public class TarefasAdapter extends RecyclerView.Adapter<TarefasAdapter.mViewHolder> {

    private List<Tarefas> list;
    private LayoutInflater layoutInflater;
    private Context context;
    private RecyclerViewOnClickListener onClickListener;

    public TarefasAdapter (Context context, List<Tarefas> list){
        this.list = list;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        mViewHolder viewHolder = new mViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {

        holder.tvTitulo.setText(list.get(position).getTitulo());
        holder.tvDate.setText(list.get(position).getDate());
        holder.tvDetalhes.setText(list.get(position).getDetalhes());
        holder.vwPrioridade.setBackgroundColor(context.getResources().getColor(list.get(position).getCor()));
        //holder.vwPrioridade.setBackgroundColor(R.color.pAlta);
        holder.vwSeparator.setBackgroundColor(context.getResources().getColor(list.get(position).getCor()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setRecyclerViewOnClickListener(RecyclerViewOnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public class mViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tvTitulo;
        public TextView tvDetalhes;
        public TextView tvDate;
        public View vwPrioridade;
        public View vwSeparator;

        public mViewHolder(View itemView) {
            super(itemView);

            tvTitulo = (TextView) itemView.findViewById(R.id.tv_titulo);
            tvDetalhes = (TextView) itemView.findViewById(R.id.tv_detalhes);
            tvDate = (TextView) itemView.findViewById(R.id.tv_data);
            vwPrioridade = (View) itemView.findViewById(R.id.vw_prioridades);
            vwSeparator = (View) itemView.findViewById(R.id.vw_separator);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onClickListener.onClickListener(v, getAdapterPosition());
        }
    }

}
