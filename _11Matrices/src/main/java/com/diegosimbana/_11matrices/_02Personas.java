package com.diegosimbana._11matrices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class _02Personas {
    private String nombre;
    
    public _02Personas() {
    }

    public _02Personas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "_03Personas{" + "nombre=" + nombre + '}';
    }
    
}
