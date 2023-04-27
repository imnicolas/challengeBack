package com.CRUD.challenge.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double montoTotal;
    @Column(name = "cuotas")
    private int cuota;
    private Date fechaEmision;
    @Column(name = "mensual")
    private double cuotaMensual;
    @Column(name = "tasa_de_interes")
    private String interes;

    public Prestamo() {
    }
    public Prestamo(int id, double montoTotal, int cuota, Date fechaEmision, double cuotaMensual, String interes) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.cuota = cuota;
        this.fechaEmision = fechaEmision;
        this.cuotaMensual = cuotaMensual;
        this.interes = interes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
}
