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
        int arr[] = new int[4];
        arr[0]=1;
        arr[1]=0;
        arr[2]=1;
        arr[3]=1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        System.out.println("");
        
        _03Personas[] d = new _03Personas[3];
        d[0] = new _03Personas("Hola!");
        d[1] = new _03Personas("Que tal !");
        d[2]=new _03Personas("Diego");
        System.out.println(d[0]+ " , " +d[1]+ " , " +d[2]);
       
        
    }
}
