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
public class ejercicio03 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase");
        frase = leer.nextLine();
        System.out.println("la frase ingresada en minuscula es " + frase.toLowerCase());
        System.out.println("la frase ingresada en mayuscula es " + frase.toUpperCase());
        
    }
    
}
