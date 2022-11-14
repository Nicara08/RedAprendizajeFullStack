/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package guia5java.EjerAprendizaje;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        num1 = leer.nextInt(); num2 = leer.nextInt();
        System.out.println("el total de la suma es " + (num1 + num2));
        
    }
    
}
