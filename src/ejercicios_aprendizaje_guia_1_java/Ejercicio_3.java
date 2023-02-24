/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_aprendizaje_guia_1_java;

import java.util.Scanner;

/**
 *
 * @author CARLOS ANDRES LEMUS
 */
public class Ejercicio_3 {
    
public static void main (String[] args){
    
Scanner leer = new Scanner (System.in);

String palabra;

    System.out.println("Por favor ingresa una Frase:  ");
    palabra = leer.nextLine();
    
    System.out.println(palabra.toUpperCase());
    System.out.println(palabra.toLowerCase());
    
 }
    
}
