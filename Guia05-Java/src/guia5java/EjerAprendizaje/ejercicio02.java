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
public class ejercicio02 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     * @param args
     */
    public static void main(String[] args) {
        
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre completo");
        nombre = leer.nextLine();
        System.out.println(nombre);
        
    }
    
}
