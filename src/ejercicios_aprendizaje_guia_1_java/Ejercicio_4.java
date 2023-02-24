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
public class Ejercicio_4 {
    
public static void main (String[] arg){
    
 Scanner leer = new Scanner(System.in);
    
int num,operacion;

    System.out.println("Por favor ingresa los grados centigrados:");
    num = leer.nextInt();
    
    operacion = (32+(9*num/5));
    
    System.out.println("Los grados Fahernheit son:  "+operacion);


    
}
}
