/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java.EjerAprendizaje;

import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ejercicio07 {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     */
    public static void main(String[] args) {
        String palabra;
        boolean palabra1;
       // palabra = "eureka";
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        palabra = leer.next();
        palabra = palabra.toLowerCase();
        //palabra1 = palabra.equals("eureka")
                
        if (palabra.equals("eureka")) {
            System.out.println("la palabra ingresada coincide con la guardada");
                    }
        else  {
            System.out.println("la palabra igresada no coincide con la guardada");
        } 
        /*palabra1 = palabra.equals("eureka");
        System.out.println(palabra1);*/
    }    
}