
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
        
        try{
            
        Scanner v1 = new Scanner(System.in);
        int e= Integer.parseInt(v1.nextLine());
        Scanner v2 = new Scanner(System.in);
        String n= v2.nextLine();
        _02Personas Persona1 = new _02Personas(n, e);
        Persona1.imprimirDatos();
        
        }catch (Error e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        
    }
}
