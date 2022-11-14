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
public class ejercicio09 {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        String frase, letra;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        letra = frase.substring(0, 1);
       // System.out.println(letra);
        if (letra.equals("A")) {
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
