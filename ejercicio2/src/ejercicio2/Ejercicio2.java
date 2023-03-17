/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gimen
 */
public class Ejercicio2 {
    /*Escribir un programa que pida tu nombre, lo guarde en una variable 
    y lo muestre por pantalla.*/


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner nom =new Scanner(System.in);
        System.out.println("ingrese su nombre");
       
       String nombre = nom.nextLine();
        System.out.println(" su nombre es " + nombre);
      
    }
    
}
