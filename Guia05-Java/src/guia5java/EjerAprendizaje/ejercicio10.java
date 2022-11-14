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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        int num, num2, suma=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero positivo");
        num = leer.nextInt();
        while (num < 1) {            
            System.out.println("Numero ingresado incorrecto, intente de vuelta");
            num = leer.nextInt();
        }
        suma=0;
        
        do {            
            System.out.println("Ingrese nuevamente un numero entero positivo");
            num2 = leer .nextInt();
            if (0<num2) {
                
                suma = suma + num2;
                
            } else {
                System.out.println("Numero incorrecto, intente de vuelta");
                num2 = leer.nextInt();
                suma = suma + num2;
            }
        } while (suma < num);
        
        
     }
    
}
