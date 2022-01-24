/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitivas2;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author JMRivera
 */
public class Repetitivas2 {

  /**
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int op;
    do{
      op = menu(teclado);
      switch (op) {
        case 1 :
            ejercicio1(teclado);
        break;
        case 2 :
            ejercicio2(teclado);
        break;
        case 3 :
            ejercicio3(teclado);
        break;   
        case 4 :
            ejercicio4(teclado);
        break;
        case 5 :
            ejercicio5(teclado);
        break;
        case 6 :
            ejercicio6(teclado);
        break;
        case 7 :
            ejercicio7(teclado);
        break;
        case 8 :
            ejercicio8(teclado);
        break;
        case 9 :
            ejercicio9(teclado);
        break;
        case 10 :
            ejercicio10(teclado);
        break;
        default : 
          // Nada que hacer
      }
        // Nada que hacer
      if(op != 0){
        System.out.print("\nPulse intro para continuar...");
        teclado.nextLine();
      }else{
        System.out.println("\nFin del programa.");
      }
      
    }while(op != 0);
  }
  
  public static int menu(Scanner t){

    System.out.println("Menu");
    System.out.println("----");
    System.out.println();
    System.out.println("1.- Ejercicio 1");
    System.out.println("2.- Ejercicio 2");
    System.out.println("3.- Ejercicio 3");
    System.out.println("4.- Ejercicio 4");
    System.out.println("5.- Ejercicio 5");
    System.out.println("6.- Ejercicio 6");
    System.out.println("7.- Ejercicio 7");
    System.out.println("8.- Ejercicio 8");
    System.out.println("9.- Ejercicio 9");
    System.out.println("10.- Ejercicio 10");
    System.out.println("0.- Fin del programa");
    System.out.println();
    System.out.print("Introduzca opción: ");    
    int op = Integer.parseInt(t.nextLine());
    System.out.println();
    return op;
  }
  
  public static void ejercicio1(Scanner t) {
    // TODO code application logic here
    System.out.println("Ejercicio 1");
    System.out.println("-----------");
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(t.nextLine());
    for(int i = 0; i<=num; i++){
      System.out.print(i+" ");
    }
    System.out.println();
    int i=0;
    while (i<=num){
        System.out.print(i+" ");
        i++;
    }
    
    } 
 
    public static void ejercicio2(Scanner t) {
    int num1, num2, i;
    System.out.println("Ejercicio 2");
    System.out.println("-----------");
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    num1 = Integer.parseInt(t.nextLine());
    System.out.print("Introduzca un número mayor que el anterior: ");
    num2 = Integer.parseInt(t.nextLine());
    i= num1;
    while ( i <= num2) {
            System.out.print(" "+i);
            i++;
        }
    
    
    }
    public static void ejercicio3(Scanner t) {
    int num1, num2, i, suma=0;
    System.out.println("Ejercicio 3");
    System.out.println("-----------");
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    num1 = Integer.parseInt(t.nextLine());
    System.out.print("Introduzca un número mayor que el anterior: ");
    num2 = Integer.parseInt(t.nextLine());
    i= num1;
    while ( i <= num2) {
        suma+=i;
            System.out.print(" "+i);
            i++;
        }
        System.out.print("\nLa suma es: "+suma);
    
    }
     public static void ejercicio4(Scanner t) {
    int num1, num2, num3,i=1;
    System.out.println("Ejercicio 4");
    System.out.println("-----------");
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    num1 = Integer.parseInt(t.nextLine());
    System.out.print("Introduzca un número mayor que el anterior: ");
    num2 = Integer.parseInt(t.nextLine());
    System.out.print("Escriba un número para mostrar sus divisores: ");
    num3 = Integer.parseInt(t.nextLine());
    i = num1;
    while ( i <= num2) {
        if (num3 % i==0){
            System.out.print(" "+i);
        }
        i++;
    }
    }
    public static void ejercicio5(Scanner t) {
    int num1, num2, num3,i,suma=0;
    System.out.println("Ejercicio 5");
    System.out.println("-----------");
    System.out.println();
    
    System.out.print("Introduzca un número: ");
    num1 = Integer.parseInt(t.nextLine());
    System.out.print("Introduzca un número mayor que el anterior: ");
    num2 = Integer.parseInt(t.nextLine());
    System.out.print("Escriba un número para mostrar sus divisores: ");
    num3 = Integer.parseInt(t.nextLine());
    i = num1;
    while ( i <= num2) {
        if (num3 % i==0){
            suma += i;
        }
        i++;
    }
    System.out.print("\nLa suma es: "+suma);
    }
    public static void ejercicio6(Scanner t) {
    int num;
    System.out.println("Ejercicio 6");
    System.out.println("-----------");
    System.out.println();
    
     System.out.print("Escriba un número, 0 para terminar:");
     num = Integer.parseInt(t.nextLine());
     while ( 0!= num ) {
         if (num >= 0){
             System.out.println("Positivo");
             
         } else {
             System.out.println("Negativo");
         }
        num = Integer.parseInt(t.nextLine());
     }   
}
    public static void ejercicio7(Scanner t) {
    int num, suma=0;
    System.out.println("Ejercicio 7");
    System.out.println("-----------");
    System.out.println();
    
     System.out.print("Escriba un número, negativo para terminar:");
     num = Integer.parseInt(t.nextLine());
     while (!(num < 0)) {
        suma = suma + num;
        num = Integer.parseInt(t.nextLine());
     }   
        System.out.print("\nLa suma es: "+suma);
}
        public static void ejercicio8(Scanner t) {
    int num, numSecreto;
    System.out.println("Ejercicio 8");
    System.out.println("-----------");
    System.out.println();
    numSecreto = (int)(Math.random()*21);
    System.out.println("Escriba un número entre 0 y 20, para averiguar el número secreto");
    num = Integer.parseInt(t.nextLine());
    while (num != numSecreto){
        if (num < numSecreto){
            System.out.println("El número secreto es mayor");
        } else {
            System.out.println("El número secreto es menor");
        }
        num = Integer.parseInt(t.nextLine());
    }
    System.out.println("Has acertado");
    }
        
    public static void ejercicio9(Scanner t) {
    int num, i, suma = 0;
    System.out.println("Ejercicio 9");
    System.out.println("-----------");
    System.out.println();
    
    System.out.println("Escriba 10 números");
    for(i=0 ; i<10; i++){
      num = Integer.parseInt(t.nextLine());
      suma = suma + num;
    }
    System.out.println("\nLa suma total es: "+suma);
    }
    
    public static void ejercicio10(Scanner t) {
    int num, n, i, min=0, max=0, suma = 0;
    float med;
    System.out.println("Ejercicio 10");
    System.out.println("-----------");
    System.out.println();
    
    System.out.println("Escriba cuantos números va a introducir:");
    n = Integer.parseInt(t.nextLine());
    for(i=0 ; i<n; i++){
      num = Integer.parseInt(t.nextLine());
      if (i==0){
        min = num;
	max = num;
      }
      if (min > num){
        min = num;
      }
      if (max < num){
	max = num;
      }
      suma = suma + num;
    }
    med = suma / n;
    System.out.println("El mínimo es: "+min);
    System.out.println("El máximo es: "+max);
    System.out.println("La media es: "+med);
    }
}
  