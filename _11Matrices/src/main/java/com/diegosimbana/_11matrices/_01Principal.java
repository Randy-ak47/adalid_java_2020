/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegosimbana._11matrices;

/**
 *
 * @author tarde
 */
public class _01Principal {
    public static void main(String[] args) {
        int edades[][]= new int[4][2];
        edades[0][0]=34;
        edades[0][1]=2;
        edades[1][0]=34;
        edades[1][1]=8;
        edades[2][0]=1;
        edades[2][1]=44;
        edades[3][0]=5;
        edades[3][1]=4;
     
            
        System.out.println(" "+edades[3][1]);
      
        for (int i = 0; i < edades.length; i++) {
            for (int k = 0; k < edades[i].length; k++) {
                System.out.println("...."+edades[i][k]);   
            }    
        }
        
        _02Personas persona1[][] = new _02Personas[2][3];
        persona1[0][0]= new _02Personas("Linux");
        persona1[0][1]= new _02Personas("Mac");
        persona1[0][2]= new _02Personas("Windows");
        persona1[1][1]= new _02Personas("Unix");
        
        System.out.println("..."+ persona1[0][1]);
        for (int i = 0; i < persona1.length; i++) {
            for (int j = 0; j < persona1[i].length; j++) {
                System.out.println("......... "+ persona1[i][j]);
            }
        }
    }
}
