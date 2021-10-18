
import java.util.Scanner;

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
        Scanner v1 = new Scanner(System.in);
        System.out.println("Introducir un valor: ");
        int edad = Integer.parseInt(v1.nextLine());
        Scanner v2 = new Scanner(System.in);
        System.out.println("Introducir un texto: ");
        String nombre = v2.nextLine();
        _02Persona p1 = new _02Persona();
        p1.setNombre(nombre);
        p1.getNombre();
        System.out.println(p1);
        
    }
}
