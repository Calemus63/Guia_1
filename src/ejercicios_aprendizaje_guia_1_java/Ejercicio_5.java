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
public class Ejercicio_5 {
public static void main (String[] arg){
    
Scanner leer = new Scanner(System.in);

int num,doble,triple,raiz;

    System.out.println("Ingresa un numero:  ");
    num = leer.nextInt();
    
    doble = num*num;
    triple = num*num*num;
    
    System.out.println("El doble del numero es   : " + doble + "  el triple es: " + triple + "  Su raiz es " + Math.sqrt(num));
    
    
    
    




}
}
