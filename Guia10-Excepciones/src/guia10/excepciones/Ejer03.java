
package guia10.excepciones;

import java.util.Scanner;

/**
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String aux, aux1;
        
        System.out.println("Ingrese dos numeros");
        aux = leer.next();
        aux1 = leer.next();
        
        int aux2 = Integer.parseInt(aux);
        int aux3 = Integer.parseInt(aux1);
        int aux4;
        try {
            aux4 = aux2 / aux3;
            System.out.println(aux4);
        } catch (ArithmeticException e) {
            System.out.println("Numero divido por 0");
        }
    }
    
    
}

