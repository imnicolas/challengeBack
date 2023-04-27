package com.CRUD.challenge.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private double montoTransaccion;
    private Date fecha;
    @Column(name = "estado_transaccion")
    private String estado;

    public Transaccion() {
    }

    public Transaccion(int id, String nombre, double montoTransaccion, Date fecha, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.montoTransaccion = montoTransaccion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
