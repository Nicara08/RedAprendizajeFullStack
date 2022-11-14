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
public class ejercicio08 {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        String palabra;
        int longitud;
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una palabra de 8 caracteres");
        palabra = leer.next();
       // longitud=palabra.length();
        //System.out.println(palabra.length());
       // System.out.println(longitud);
        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
            
        }
        else    {
            System.out.println("INCORRECTO");
        }
    }
    
}
