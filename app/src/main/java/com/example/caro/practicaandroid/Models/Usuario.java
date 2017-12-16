package com.example.caro.practicaandroid.Models;

import java.io.Serializable;

/**
 * Created by Caro on 16/12/2017.
 */

public class Usuario implements Serializable {
    private int id;
    private String usuario;
    private int edad;

    public Usuario(int id, String usuario, int edad) {
        this.id = id;
        this.usuario = usuario;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
