
package guia07.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
public class EjerExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num=0, suma=0, suma2=0;
        ArrayList <Integer> lista = new ArrayList ();
        System.out.println("Ingrese numeros enteros, para salir escriba -99");
        
        do {
        num = leer.nextInt();
            if (num!=-99) {
                lista.add(num);
            }else{
                System.out.println("Muchas gracias");
            }
        } while (num!=-99);
        System.out.println("La cantidad de numeros ingresados fue de: "+lista.size());
        for (Integer aux : lista) {
            suma += aux;
        }
        System.out.println("La suma de los numeros ingresados fue de: "+suma);
        System.out.println("El promedio es: "+(suma/lista.size()));
        
       /* for (int i = 0; i < lista.size(); i++) {
            suma2 += lista.get(i);
        }
        System.out.println("otra suma "+suma2);*/
    }
    
}
