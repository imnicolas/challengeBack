package com.CRUD.challenge.entity;

import javax.persistence.*;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "mi_saldo")
    private double saldo;
    @Column(name = "valida_hasta")
    private String validez;
    private int cbu;
    private double ingreso;
    private double egreso;


    public Tarjeta() {
    }

    public Tarjeta(int id, double saldo, String validez, int cbu, double ingreso, double egreso) {
        this.id = id;
        this.saldo = saldo;
        this.validez = validez;
        this.cbu = cbu;
        this.ingreso = ingreso;
        this.egreso = egreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }
}
