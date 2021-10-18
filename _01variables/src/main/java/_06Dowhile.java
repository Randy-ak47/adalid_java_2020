
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
public class _06Dowhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        do {            
        System.out.println("Introduce un número: (DISTINTO DE 5) ");
        numero=Integer.parseInt(scan.nextLine());
        System.out.println("El número es: "+numero);
            
        } while (numero != 5);
        System.out.println("Hasta pronto!");
        
        System.out.println("----IMPRIME LOS PARES------");
        for (int i = 0; i < 10; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println("El número es: "+i);        
        }
        System.out.println("-----FIN----");
        System.out.println("----IMPRIME LOS IMPARES------");
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println("El número es: "+i);        
        }
        System.out.println("-----FIN----");
    }
}
