
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
public class _05Estaciones {
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner scan = new Scanner (System.in);
        System.out.println("Escribe un mes (en números) ");
        byte mes = Byte.parseByte(scan.nextLine());
        switch(mes){
            case 1: case 2: case 12:
                System.out.println("Es invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("Es primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("Es Verano");
                break;
            case 9: case 10: case 11:
                System.out.println("Es Otoño");
                break;
            default:  
                System.out.println("Mes no valido");
                break;
        }
    }
}
