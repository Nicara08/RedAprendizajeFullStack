
package guia5java.EjerExtras;

import java.util.Scanner;
public class extra03B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int largo; String letra;
        
        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            letra = letra.toLowerCase();
            largo = letra.length();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                letra = "ok";
            }
            
        } while (largo > 1 || !letra.equals("ok"));
        
        System.out.println("La letra ingresada es una VOCAL");
//!letra.equals("a")       
    }
    
}
