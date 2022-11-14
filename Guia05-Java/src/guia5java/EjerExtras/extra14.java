
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int M, H, edad, suma=0;
        do {
            System.out.println("Ingrese la cantidad de familias");
            M = leer.nextInt();
        } while (M < 0);
        
        for (int i = 0; i < M; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia numero "+(i+1));
            H = leer.nextInt();
            for (int j = 0; j < H; j++) {
                System.out.println("Ingese la edad del hijo numero "+(j+1));
                edad = leer.nextInt();
                suma=suma+edad;
            }
            System.out.println("La edad media de la familia numero "+(i+1)+" es de "+(suma/H)+" años");
            System.out.println("");
            suma=0;
        }
        
    }
    
}
