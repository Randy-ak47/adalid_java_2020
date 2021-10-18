
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
public class _04Notas {
    public static void main(String[] args) {
       Scanner selec = new Scanner(System.in);
        System.out.println("----SELECCIONAR UNA ACCIÓN----");
        System.out.println(" ");
        System.out.println("----1.- EVALUAR NOTA----");
        System.out.println("----2.- SALIR----");
       int num = Integer.parseInt(selec.nextLine());
       
                do {                   
       switch(num){
           case 1:

               System.out.println(" ");
                System.out.println("------NOTAS DE CALIFICACIÓN-------");
                System.out.println("Menos de 5 insuficiente ");
                System.out.println("Más de 5 suficiente ");
                System.out.println("Entre 6 y 7 bien ");
                System.out.println("Entre 7 y 8 notable ");
                System.out.println("entre 9 y 10 sobresaliente ");
                System.out.println("--- ");
                System.out.println(" ");
                Scanner scan = new Scanner(System.in);
               double nota = Double.parseDouble(scan.nextLine());
               if(nota >=0 && nota < 5){
                   System.out.println("La nota: "+nota+" obtenida es un INSUFICIENTE ");     
               }else if(nota >= 5 && nota < 6){
                   System.out.println("La nota: "+nota+" obtenida es un SUFICIENTE ");
               }else if(nota >= 6 && nota < 7){
                   System.out.println("La nota: "+nota+" obtenida es un BIEN ");
               }else if(nota >= 7 && nota < 9){
                   System.out.println("La nota: "+nota+" obtenida es un NOTABLE ");
               }else if(nota >= 9 && nota <= 10){
                   System.out.println("La nota: "+nota+" obtenida es un SOBRESALIENTE ");
               }else{
                System.out.println("La nota no es la indicada!");
               }
               break;
           case 2:
               System.out.println("Hasta pronto!");
               break;
           default:
               System.out.println("Seleccionar un número adecuado.");
               break;
       }
               } while (num!=1);
    }
}
