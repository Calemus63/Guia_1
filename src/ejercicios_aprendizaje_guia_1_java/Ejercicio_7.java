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
public class Ejercicio_7 {
    public static void main (String[] arg){
    
        Scanner leer = new Scanner (System.in);
        String frase, clave;
        clave = "eureka";
        
        System.out.println("Por favor ingresa una palabra:");
        frase = leer.nextLine();
        frase = frase.toLowerCase();
        
      
   
        if (clave.equals(frase)){
            
            System.out.println("CORRECTO");
           
        }else{
            System.out.println("INCORECTO");
        }
      
        
        
    }
}
