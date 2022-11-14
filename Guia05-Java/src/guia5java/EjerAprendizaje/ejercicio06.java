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
public class ejercicio06 {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        
        if (num % 2 != 0) {
            System.out.println("el numero " + num + " es impar");
             }
        else  {
            System.out.println("el numero " + num + " es par");
        }
    }
    
}
