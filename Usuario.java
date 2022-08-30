package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Usuario {
    private String nome;
    private String senha;
    private int telefone;

    public Usuario(String nome, String senha, int telefone) {
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }

    //gets e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
