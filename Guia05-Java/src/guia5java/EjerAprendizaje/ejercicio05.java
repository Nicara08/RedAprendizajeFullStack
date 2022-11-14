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
public class ejercicio05 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        System.out.println("el doble del numero ingresado " + num + " es " + (num*2));
        System.out.println("el triple del numero ingresado " + num + " es " + (num*3));
       // num2 = (int)Math.sqrt(num);
        System.out.println("la raiz cuadradada del numero ingresado " + num + " es " + (Math.sqrt(num)));
      
    }
    
}
