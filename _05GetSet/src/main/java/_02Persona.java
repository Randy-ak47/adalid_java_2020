/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class _02Persona {
    private String nombre;
    private int idNombre;
    private static int contador;
    public  _02Persona(){    
    }
    public _02Persona( String nom){
        this.nombre = nom;
        this.idNombre= ++contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //System.out.println(this.nombre);
    }

    @Override
    public String toString() {
        return "_02Persona{" + "nombre=" + nombre + ", idNombre=" + idNombre + '}';
    }
    
    
}
