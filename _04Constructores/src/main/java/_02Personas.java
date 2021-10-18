/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public  class _02Personas {
    public  String nombre;
    public  int edad;
    
     public  _02Personas(String nom, int ed){
         this.nombre = nom;
         this.edad = ed;
         
     }
     public void imprimirDatos(){
         System.out.println("Nombre: " + this.nombre+" edad: "+this.edad);
     }
}
