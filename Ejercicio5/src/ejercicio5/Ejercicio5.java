/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author gimen
 */
public class Ejercicio5 {

    /* Escribir un programa que lea un número entero por teclado y 
     muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        public static void main(String[] args) {
        int numeroEntero ;        
        float doble,triple,raizCuadrada;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Por favor ingrese un numero entero");
        numeroEntero=sc.nextInt(); 
        doble=numeroEntero*numeroEntero; 
        triple=numeroEntero*numeroEntero*numeroEntero; 
        System.out.println(" raiz cuadrada:"+Math.sqrt(numeroEntero));    
        System.out.println("El doble del numero:"+doble); 
        System.out.println("El triple del numero:"+triple);
    }
        
 }
