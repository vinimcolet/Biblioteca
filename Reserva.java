package com.company;

import java.util.Date;

public class Reserva {
    private Date dataReserva;
    private Usuario usuario;
    private Material material;

    public Reserva(Date dataReserva, Usuario usuario, Material material) {
        this.dataReserva = dataReserva;
        this.usuario = usuario;
        this.material = material;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
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

