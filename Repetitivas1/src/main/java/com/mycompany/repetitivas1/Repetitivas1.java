/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repetitivas1;

import java.util.Scanner;

/**
 *
 * @author Ángela
 */
public class Repetitivas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num, i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ejecutado con while");
        System.out.println("Escriba un número");
        num = in.nextInt();
       
        while ( i <= num) {
            System.out.print(" "+i);
            i++;
        }

        System.out.println("\nEjecutado con for");
        System.out.println("Escriba un número");
        num = in.nextInt();
        for( i=0;i<=num;i++)
            System.out.print(" "+i);

}
}
    
            
 
    

