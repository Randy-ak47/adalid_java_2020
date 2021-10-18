
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
public class _02Libro {
    public static void main(String[] args) {
        //recoger isbn, titulo, precio, moneda
        
        Scanner imprimir = new Scanner(System.in);
        System.out.println("Introducir el ISBN del libro.");
        String isbn = imprimir.nextLine();
        System.out.println("El ISBN es: " + isbn);
        System.out.println(" ");
        System.out.println("Introducir el Titulo del libro.");
        String titulo = imprimir.nextLine();
        System.out.println("El Titulo es: " + titulo);
        System.out.println(" ");
        System.out.println("Introducir el Precio del libro.");
        float precio = Integer.parseInt(imprimir.nextLine());
        System.out.println("El valor es: " + precio);
        System.out.println(" ");
        System.out.println("Introducir la Moneda del libro.");
        
        String moneda = imprimir.nextLine();
        System.out.println("El valor es: " + moneda.charAt(0));
        System.out.println(" ");
        
        System.out.println("Datos del libro son: "+ isbn + " " + titulo + " " + precio + " " + moneda);
    }
}
