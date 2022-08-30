package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Artigo {
    private String autor;
    private String titulo;
    private String resumo;

    public Artigo(String autor, String titulo, String resumo) {
        this.autor = autor;
        this.titulo = titulo;
        this.resumo = resumo;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artigo artigo = (Artigo) o;
        return Objects.equals(autor, artigo.autor) && Objects.equals(titulo, artigo.titulo) && Objects.equals(resumo, artigo.resumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo, resumo);
    }

    //get e set
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
