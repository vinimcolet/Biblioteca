package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean atraso;
    private Usuario usuario;
    private Material material;

    ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    public Emprestimo(Date dataEmprestimo, Date dataDevolucao, boolean atraso, Usuario usuario, Material material) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.atraso = atraso;
        this.usuario = usuario;
        this.material = material;
    }

    public void verificaAtraso (Emprestimo emprestimo){
        Date date = new Date();
        if (date.compareTo(emprestimo.dataDevolucao) > 0){
            emprestimo.setAtraso(true);
        }
    }

    public void addEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return atraso == that.atraso && Objects.equals(dataEmprestimo, that.dataEmprestimo) && Objects.equals(dataDevolucao, that.dataDevolucao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataEmprestimo, dataDevolucao, atraso);
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", atraso=" + atraso +
                '}';
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAtraso() {
        return atraso;
    }
    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
