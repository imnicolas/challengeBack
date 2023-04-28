package com.CRUD.challenge.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "tarjetas")
    private String tarjeta;
    @NotNull
    @Column(name = "prestamos")
    private String prestamo;
    @NotNull
    @Column(name = "operaciones")
    private String operacion;
    @NotNull
    @Column(name = "te_ofrecemos")
    private String ofrece;
    @NotNull
    @Column(name = "seguros")
    private String seguro;
    @NotNull
    @Column(name = "puntos")
    private String punto;
    @NotNull
    private String ayuda;

    public Menu() {
    }

    public Menu(int id, String tarjeta, String prestamo, String operacion, String ofrece, String seguro, String punto, String ayuda) {
        this.id = id;
        this.tarjeta = tarjeta;
        this.prestamo = prestamo;
        this.operacion = operacion;
        this.ofrece = ofrece;
        this.seguro = seguro;
        this.punto = punto;
        this.ayuda = ayuda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOfrece() {
        return ofrece;
    }

    public void setOfrece(String ofrece) {
        this.ofrece = ofrece;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
    }

    public String getAyuda() {
        return ayuda;
    }

    public void setAyuda(String ayuda) {
        this.ayuda = ayuda;
    }
}
