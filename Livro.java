package com.company;

import java.util.Objects;

public class Livro {
    private long isbn;
    private String autor;

    public Livro(long isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public void mostraLivro(Livro livro){
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return isbn == livro.isbn && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, autor);
    }

    //get e set
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
