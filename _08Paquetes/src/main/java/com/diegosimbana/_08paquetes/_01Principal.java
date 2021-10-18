/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegosimbana._08paquetes;

import com.diegoasimbana.otropaquete._01OtraClase;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tarde
 */
public class _01Principal {

    public static void main(String[] args) {
        
        String nombre;
        
        _01OtraClase c1 = new _01OtraClase();
        System.out.println(c1.suma(4, 45));
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce un nombre:  ");
        nombre = dato.nextLine();
        c1.setNombre(nombre);
        System.out.println(c1.getNombre());
        //JOptionPane.showMessageDialog(null, c1.getNombre());
        
    }
    

}
