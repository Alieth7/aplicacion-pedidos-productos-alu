package com.example.alunethproyect;

public class Persona {
    byte   id;
    String nombre;
    String apellido;
    String ci;
    int nroCelular;
    String rol;

    public Persona() {
    }

    public Persona(byte id, String nombre, String apellido, String ci, int nroCelular, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.nroCelular = nroCelular;
        this.rol = rol;
    }

    public Persona(String nombre, String apellido, String ci, int nroCelular, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.nroCelular = nroCelular;
        this.rol = rol;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
