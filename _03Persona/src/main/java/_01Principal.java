
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
        _03Persona persona1 = new _03Persona();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Introduce una edad: ");
        int num = scan1.nextInt();
        persona1.edad=num;
        //persona1.imprimir();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String name = scan2.nextLine();
        persona1.nombre=name;
        persona1.imprimir();
    }
}
