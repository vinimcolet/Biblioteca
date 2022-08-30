package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Revista {
    private int colecao;
    private long issn;
    private int numero;
    private ArrayList<Artigo> artigos = new ArrayList<>();

    public Revista(int colecao, long issn, int numero) {
        this.colecao = colecao;
        this.issn = issn;
        this.numero = numero;
    }

    public void remover(Revista revista){
        revista = null;
    }

    public void mostraRevista(Revista revista){
        System.out.println("Coleção: " + revista.getColecao());
        System.out.println("ISSN: " + revista.getIssn());
        System.out.println("Número: " + revista.getNumero());
    }

    //adiciona um artigo a revista
    public void publica(Artigo artigo){
        artigos.add(artigo);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "colecao=" + colecao +
                ", issn=" + issn +
                ", numero=" + numero +
                ", artigos=" + artigos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revista revista = (Revista) o;
        return colecao == revista.colecao && issn == revista.issn && numero == revista.numero && Objects.equals(artigos, revista.artigos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colecao, issn, numero, artigos);
    }

    //get e set
    public int getColecao() {
        return colecao;
    }

    public void setColecao(int colecao) {
        this.colecao = colecao;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
