
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
public class _03Condicionales {
    public static void main(String[] args) {
        
        System.out.println("Introducir un valor: ");
        Scanner scan = new Scanner (System.in);
        int valor = Integer.parseInt(scan.nextLine());
       
        
        if(valor <5){
            System.out.println("El valor es menor que cinco");
        }else if(valor >=5 && valor < 10){
            System.out.println("El valor esta entre 5 y 10");
        }else{
            System.out.println("El valor es mayor que 10");
                    
        }
        
        
        switch(valor){
            case 1:
                System.out.println("Es el valor 1");
                break;
            case 2:
                System.out.println("Es el valor 2");
                break;
            default:
                System.out.println("Otros valores");
                
        }
    }
}
