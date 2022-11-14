
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
public class extra07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, max=0, min=0, suma=0, contador=0;
        
        do {            
        System.out.println("Ingrese un numero mayor a cero. Para salir ingrese cero");
        num = leer.nextInt();
        suma = suma + num;
        contador=contador+1;
            if (contador==1) {
                max=num;
                min=num;
            }else if (num < min && num != 0) {
                min=num;
            }else if (num > max) {
                max=num;                
            }

            } while (num != 0);
       
        System.out.println("el numero ingresado mayor es: "+max);
        System.out.println("el numero ingresado menor es: "+min);
        System.out.println("el promedio de los nros ingresados es: "+suma/contador);
    
    }
    
}
