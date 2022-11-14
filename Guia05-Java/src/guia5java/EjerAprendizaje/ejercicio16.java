
package guia5java.EjerAprendizaje;

import static java.lang.Math.random;
import java.util.Scanner;


public class ejercicio16 {

    /**
     *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     * @param args
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la dimension del vector");
        int num = leer.nextInt();
        int contador=0;
        
        int[] vector = new int [num];
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
        System.out.println("Ingrese un numero del 1 al 10 para evaluar si se encuentra dentro del vector");
        int num2 = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == num2) {
                System.out.println("El numero "+num2+" se econtro en el vector ["+i+"]");
                contador = contador + 1;
                
                
            }
            
        }
        System.out.println("el numero buscado "+num2+" se repitio "+contador+" veces.");
    }
    
    
}
