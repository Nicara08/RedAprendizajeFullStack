
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
public class extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, num2, num3, contador=0;
        
               
        do {
        System.out.println("Ingrese la dimension de los dos vectores");
        num = leer.nextInt();
        } while (num < 0);
               
        int [] vectorA = new int [num];
        int [] vectorB = new int [num];
        System.out.println("");
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese valores para vector A y B subindice ["+i+"]");
            num2 = leer.nextInt();
            num3 = leer.nextInt();
            vectorA[i] = num2;
            vectorB[i] = num3;
            
            if (vectorA[i]==vectorB[i]) {
              contador = contador + 1;                 
            } else {
                System.out.println("");
                System.out.println("Se encontro una diferencia en el subindice ["+i+"]");
                System.out.println("Siendo "+num2+" el valor del vectorA y "+num3+" el valor de vectorB");
                System.out.println("");
                break;
            }
            
            
        }
        System.out.println("");
        if (contador==num) {
            System.out.println("El vectorA y el vectorB son iguales en todos sus elementos"); 
        }
        System.out.println("");
    }
    
}
