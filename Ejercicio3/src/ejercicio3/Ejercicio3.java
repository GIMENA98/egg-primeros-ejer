/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gimen
 */
public class Ejercicio3 {
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
    después toda en minúsculas. */
    
    public static void main(String[] args) {
       Scanner frase1 =new Scanner(System.in);
        System.out.println("Escriba una frase: "); 
         String frase =frase1.nextLine();       
         frase = frase.toUpperCase(); // convierte a Mayuscula la cadena        
         System.out.println("Su frase en mayuscula :"+frase);
         frase = frase.toLowerCase(); 
         System.out.println("Su frase en minuscula: "+ frase);
        
       
    }
    
}
