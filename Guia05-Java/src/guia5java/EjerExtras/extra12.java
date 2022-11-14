
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       int [][][] matriz = new int [10][10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    matriz[i][j][k]=k;
                    //System.out.println("["+i+"]["+j+"]["+k+"]"+matriz[i][j][k]+" ");
                   // String numCadena= String.valueOf(numEntero);
                    String kCadena = String.valueOf(k);
                    String jCadena = String.valueOf(j);
                    String iCadena = String.valueOf(i);
                    
                    if (iCadena.equals("3") && jCadena.equals("3") && kCadena.equals("3")) {
                        System.out.println("E"+"-"+"E"+"-"+"E");
                    }else if (jCadena.equals("3") && kCadena.equals("3")) {
                        System.out.println(i+"-"+"E"+"-"+"E");
                    }
                    else if (iCadena.equals("3") && jCadena.equals("3")) {
                        System.out.println("E"+"-"+"E"+"-"+k);
                    }
                    else if (iCadena.equals("3") && kCadena.equals("3")) {
                        System.out.println("E"+"-"+j+"-"+"E");
                    }
                    else if (iCadena.equals("3")) {
                        System.out.println("E"+"-"+j+"-"+k);
                    }
                    else if (jCadena.equals("3")) {
                        System.out.println(i+"-"+"E"+"-"+k);
                    }
                    else if (kCadena.equals("3")) {
                        System.out.println(i+"-"+j+"-"+"E");
                    }
                    else if (!iCadena.equals("3") && !jCadena.equals("3") && !kCadena.equals("3")) {
                        System.out.println(i+"-"+j+"-"+k);
                    }
 
           // System.out.println("");
        }
        /*int i=0, j=0, k=0, contador=0;
        for (int l = 0; l < 30; l++) {
            
        }*/
    }
    } 
}
}