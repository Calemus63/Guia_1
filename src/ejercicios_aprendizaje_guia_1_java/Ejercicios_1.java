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
public class Ejercicios_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2, suma;
        
        System.out.println("Ingresa un numero");
        num1 = leer.nextInt();
        System.out.println("Ingresa un segundo numero");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de los numero es "+ suma);
        
        // TODO code application logic here
    }
    
}
