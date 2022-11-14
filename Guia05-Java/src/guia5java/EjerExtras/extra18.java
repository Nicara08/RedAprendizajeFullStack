
package guia5java.EjerExtras;

import java.util.Scanner;

/**
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
public class extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tamaño, num, suma=0;
        
        do {
            System.out.println("Ingrese la dimension del vector");
            tamaño = leer.nextInt();
        } while (tamaño < 1);
        
        int [] vector = new int [tamaño];
        System.out.println("");
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el valor para el subindice numero ["+i+"]");
            num = leer.nextInt();
            vector[i]=num;
            suma = vector[i] + suma;
           // System.out.println(num+" + ");
            /*if (i==tamaño-2) {
               // System.out.println(num+" = "+suma);
            }*/
                }
        System.out.println("");

        for (int j = 0; j < tamaño; j++) {
                
            if (j<tamaño-1) {
                 System.out.print(vector[j]+" + ");
                     
            } else  {
                System.out.print(vector[j]+" = "+suma);     
                 }
            }
        
        System.out.println("");
    
}
}