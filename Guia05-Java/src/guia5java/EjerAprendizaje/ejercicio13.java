
package guia5java.EjerAprendizaje;

import java.util.Scanner;

/**
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
* 
 */
public class ejercicio13 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Ingrese el largo de los lados del cuadrado");
        num = leer.nextInt();
               
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print(" * ");
                } else { 
                    System.out.print("   ");
                }
                    
                }
             System.out.println(" ");
            }
                   
        }
        
    }
    

