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

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
public class Ejercicio_9 {

    public static void main(String[] arg) {

           Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Por favor ingresa una frase");
        frase = leer.nextLine();

        if (!frase.substring(0, 1).equals("A")) {
            System.out.println("Incorrecto");
        } else {
            System.out.println("Correcto");
        }
    }
}
        /*
        Scanner leer = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase");
        frase = leer.nextLine();
        Scanner leer = new Scanner(System.in);
        char letra = input.next().charAt(0);

        System.out.println(letra);

        if (letra == 'A') {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
*/
