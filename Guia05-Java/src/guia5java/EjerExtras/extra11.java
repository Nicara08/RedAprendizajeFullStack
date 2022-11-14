
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int num, contador=0; 
     
     do {
            System.out.println("ingrese un numero entero");
            num = leer.nextInt();
        } while (num <= 0);
           
        do {
            num = num / 10;
            contador=contador+1;
            //num = (Math.trunc (num));
        } while (num!=0);
        System.out.println("El numero ingresado tiene "+contador+" cifras");
        
    }
    
}
