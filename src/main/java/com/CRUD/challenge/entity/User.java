package com.CRUD.challenge.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo_dni;
    private int dni;
    private int telefono;
    private String imagen;

    public User() {
    }

    public User(int id, String nombre, String tipo_dni, int dni, int telefono, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_dni = tipo_dni;
        this.dni = dni;
        this.telefono = telefono;
        this.imagen = imagen;
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

    public String getTipo_dni() {
        return tipo_dni;
    }

    public void setTipo_dni(String tipo_dni) {
        this.tipo_dni = tipo_dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
