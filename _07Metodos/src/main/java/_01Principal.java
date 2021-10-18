
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class _01Principal {
    public static void main(String[] args) {
        _02Suma Operacion = new _02Suma();
        
        System.out.println("Suma de enteros: "+Operacion.sumaEnteros(22, 45));
        System.out.println("Suma de un double y entero: "+Operacion.sumaEnteros(22d, 45));
        System.out.println("Suma de un entero y double: " +Operacion.sumaEnteros(22, 45d));
        System.out.println("Suma de dos doubles: "+Operacion.sumaEnteros(22d, 45d));
        
    }    
}
