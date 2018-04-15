package com.example.uninorte.organizo.classes;

public class Tarefas {

    private String titulo;
    private String date;
    private String detalhes;
    private int cor;

    public Tarefas(){}
    public Tarefas(String titulo, String date, String detalhes, int cor){
        this.titulo = titulo;
        this.date = date;
        this.detalhes = detalhes;
        this.cor = cor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String data) {
        this.date = data;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
