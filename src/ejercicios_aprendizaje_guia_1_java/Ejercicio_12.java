 
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
public class Ejercicio_12 {
    
    public static void main (String []arg){
    
     String cadena; 
        int cuentaCorrectas = 0, cuentaIncorrectas = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingres cadena de 5 caracteres: ");
        cadena = leer.nextLine(); 
        while (!"&&&&&".equals(cadena))
                {        
            if (cadena.length() >= 5)
             {
                if ("X".equalsIgnoreCase(cadena.substring(0,1)) && "O".equalsIgnoreCase(cadena.substring(4,5)) && (cadena.length() == 5)) {
                    cuentaCorrectas++;
                } else {
                    cuentaIncorrectas++;
                }
             } else { cuentaIncorrectas++;
                    }
                System.out.print("Ingres cadena de 5 caracteres: ");
                cadena = leer.nextLine();     
                }
    System.out.println("Salio por recibir la cadena: " + cadena);
    System.out.println("Cadenas Correctas : " + cuentaCorrectas);
    System.out.println("Cadenas Inccorrectas : " + cuentaIncorrectas);
    }
    
}
