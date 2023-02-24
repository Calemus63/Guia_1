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
public class Ejercicio_6 {

    public static void main(String[] arg) {

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("Por favor ingres un numero:  ");
        num = leer.nextInt();

        if (num % 2 == 0) {

            System.out.println("El numero es par: " + num);

        } else {
            System.out.println("El numero es impar: " + num);
        }

    }

}  
