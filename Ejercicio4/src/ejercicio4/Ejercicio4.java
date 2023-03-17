/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gimen
 */
public class Ejercicio4 {
    /**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
     La fórmula correspondiente es: F = 32 + (9 * C / 5). */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Por favor la temperatura en grados");     
        float grados= sc.nextFloat();  
        float F ;
        F = 32 + (9 * grados / 5);       
        System.out.println(" su grado en fahrenheit :"+F);
    }
    
}
