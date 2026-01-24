package com.example.alunethproyect;

public class SessionClass {

    private String tokenUsuario;
    private String nomUsuario;
    private int    idCuentaUsu;
    private String rolUsu;


    private String nombre;
    private String apPaternos;
    private int    nroCelular;
    private int    ciUsuario;

    public SessionClass() {
    }

    public SessionClass(String tokenUsuario, String nomUsuario, int idCuentaUsu, String rolUsu) {
        this.tokenUsuario = tokenUsuario;
        this.nomUsuario = nomUsuario;
        this.idCuentaUsu = idCuentaUsu;
        this.rolUsu = rolUsu;
    }

    public SessionClass(String tokenUsuario, String nomUsuario, int idCuentaUsu, String rolUsu,String nombre, String apPaternos) {
        this.tokenUsuario = tokenUsuario;
        this.nomUsuario = nomUsuario;
        this.idCuentaUsu = idCuentaUsu;
        this.rolUsu = rolUsu;
        this.nombre= nombre;
        this.apPaternos = apPaternos;
    }

    public SessionClass(String tokenUsuario, String nomUsuario, int idCuentaUsu, String rolUsu, String apPaternos, int nroCelular, int ciUsuario) {
        this.tokenUsuario = tokenUsuario;
        this.nomUsuario = nomUsuario;
        this.idCuentaUsu = idCuentaUsu;
        this.rolUsu = rolUsu;
        this.apPaternos = apPaternos;
        this.nroCelular = nroCelular;
        this.ciUsuario = ciUsuario;
    }

    public String getTokenUsuario() {
        return tokenUsuario;
    }

    public void setTokenUsuario(String tokenUsuario) {
        this.tokenUsuario = tokenUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getIdCuentaUsu() {
        return idCuentaUsu;
    }

    public void setIdCuentaUsu(int idCuentaUsu) {
        this.idCuentaUsu = idCuentaUsu;
    }

    public String getRolUsu() {
        return rolUsu;
    }

    public void setRolUsu(String rolUsu) {
        this.rolUsu = rolUsu;
    }

    public String getApPaternos() {
        return apPaternos;
    }

    public void setApPaternos(String apPaternos) {
        this.apPaternos = apPaternos;
    }

    public int getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }

    public int getCiUsuario() {
        return ciUsuario;
    }

    public void setCiUsuario(int ciUsuario) {
        this.ciUsuario = ciUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
