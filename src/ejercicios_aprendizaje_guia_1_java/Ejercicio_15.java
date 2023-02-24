/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_aprendizaje_guia_1_java;

/**
 *
 * @author CARLOS ANDRES LEMUS
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
       int[] numeros = new int[100]; // Creamos un vector de 100 elementos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 100 - i; // Rellenamos el vector con los 100 primeros números enteros de forma descendente
        }
        
        System.out.println("Números en orden descendente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " "); // Mostramos los números en orden descendente
        }
    }
}
