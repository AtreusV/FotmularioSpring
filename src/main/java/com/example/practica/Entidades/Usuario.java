package com.example.practica.Entidades;

import java.time.LocalDate;

public class Usuario {

    public int idUsuario;
    public String nombreUsu;
    public String pais;
    public LocalDate fechaNa;
    public String correoUsu;

    public Usuario(int idUsuario, String nombreUsu, String pais, LocalDate fechaNa, String correoUsu) {
        this.idUsuario = idUsuario;
        this.nombreUsu = nombreUsu;
        this.pais = pais;
        this.fechaNa = fechaNa;
        this.correoUsu = correoUsu;
    }

    //Getter
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getFechaNa() {
        return fechaNa;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    //Setter
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFechaNa(LocalDate fechaNa) {
        this.fechaNa = fechaNa;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }
}
