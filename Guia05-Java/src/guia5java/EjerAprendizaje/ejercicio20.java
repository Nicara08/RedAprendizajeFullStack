
package guia5java.EjerAprendizaje;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        int num, sumaF=0, contadorF=0, sumaC=0, contadorC=0, sumaDI=0, contadorDI=0, sumaDD=0, contadorDD=0, centinelaI=0, centinelaJ=2;
       Scanner leer = new Scanner (System.in);
       
      /* matriz[0][0]= 2; matriz[0][1]= 7; matriz[0][2]= 6;
       matriz[1][0]= 9; matriz[1][1]= 5; matriz[1][2]= 1;
       matriz[2][0]= 4; matriz[2][1]= 3; matriz[2][2]= 8;*/
         
              
       /*matriz[0][0]= 3; matriz[0][1]= 10; matriz[0][2]= 5;
       matriz[1][0]= 8; matriz[1][1]= 6; matriz[1][2]= 4;
       matriz[2][0]= 7; matriz[2][1]= 2; matriz[2][2]= 9;*/
   
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                   System.out.println("ingrese numeros entero rango de 1 a 9");
                   num = leer.nextInt();
                   matriz[i][j]=num;
                   while (num<1 || num>11 ) {                    
                       System.out.println("numero incorrecto, ingrese nuevamente");
                       num = leer.nextInt();
                    matriz[i][j]=num;
                }
                } 
                
                
            }
            
       
       for (int i = 0; i < 3; i++) {
            centinelaI=i;
            for (int j = 0; j < 3; j++) {
                sumaF = sumaF + matriz[i][j];
                sumaC = sumaC + matriz[j][i];
                if (i == j) {
                sumaDI = sumaDI + matriz[i][j];
                    
                }
                if (centinelaI==i && centinelaJ==j) {
                    sumaDD = sumaDD + matriz[i][j];
                }
                if ((sumaF == 15)){
                    contadorF = contadorF + 1;
                                        
                }
                if (sumaC == 15) {
                    contadorC = contadorC + 1;
                }
                if (sumaDI == 15) {
                    contadorDI = contadorDI + 1;
                }
                if (sumaDD ==15 && j==0) {
                    contadorDD = contadorDD + 1;
}
            }
            sumaF=0; sumaC=0; centinelaJ=centinelaJ-1;
        }
        
        if (contadorF==3 && contadorC==3 && contadorDI==1 && contadorDD==1) {
            System.out.println("MATRIZ MAGICA!");
        } else {
            System.out.println("LA MATRIZ NO ES MAGICA");
        }
        System.out.println(" ");
    }
    
}
