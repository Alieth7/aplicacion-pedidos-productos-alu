package com.example.alunethproyect;

public class Cuaderno {
    int id;
    String codigo;
    double precio;
    Boolean personalizado;
    String nombre;
    String especificaciones;
    int imagen; // no me deja manejarlo el recycler como String, solo como int

    public Cuaderno() {
    }

    public Cuaderno(int id, String codigo, double precio, Boolean personalizado, String nombre, String especificaciones, int imagen) {
        this.id = id;
        this.codigo = codigo;
        this.precio = precio;
        this.personalizado = personalizado;
        this.nombre = nombre;
        this.especificaciones = especificaciones;
        this.imagen = imagen;
    }

    public Cuaderno(String codigo, double precio, Boolean personalizado, String nombre, String especificaciones, int imagen) {
        this.codigo = codigo;
        this.precio = precio;
        this.personalizado = personalizado;
        this.nombre = nombre;
        this.especificaciones = especificaciones;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Boolean getPersonalizado() {
        return personalizado;
    }

    public void setPersonalizado(Boolean personalizado) {
        this.personalizado = personalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
