
package openbootcamp.Entrega1;

import java.util.Scanner;


public class OpenBootCamp {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);        
        int numero = 2;
        System.out.println("El numero es: " + numero);
        long numero2 = 23;
        System.out.println("El numero es: " + numero2);
        double numero3 = 32;
        System.out.println("El numero es: " + numero3);
        float numero4 = 2.45f;
        System.out.println("El numero es: " + numero4);        
        boolean variable = true;
        System.out.println("Ingrese su nombre");
        String variable2 = leer.next();
        System.out.println("El nombre es: " + variable2);
    }
    
}
