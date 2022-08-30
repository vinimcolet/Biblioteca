package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Material {
    private int codigo;
    private String assunto;
    private String titulo;
    private String editora;
    private Livro livro;
    private Revista revista;

    public Material(){}

    public Material(int codigo, String assunto, String titulo, String editora, Livro livro, Revista revista, ArrayList<Reserva> reservas) {
        this.codigo = codigo;
        this.assunto = assunto;
        this.titulo = titulo;
        this.editora = editora;
        this.livro = livro;
        this.revista = revista;
    }


    public void remover(Material material){
        material = null;
        revista.remover(material.getRevista());
    }

    // get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

}
