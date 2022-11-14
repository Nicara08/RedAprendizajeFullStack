
package guia5java.EjerAprendizaje;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * (X-Y+1)+Y.
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la dimension del vector");
        int n = leer.nextInt();
        int uno=0, dos=0, tres=0, cuatro=0, cinco=0;
        
        int [] vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*(((15000-1)+1)+1));
            if (vector[i] <= 9) {
                uno = uno + 1;
            } else if (vector[i] <= 99 && vector[i] >= 10 ) {
                dos = dos + 1;                                      
            }
            else if (vector[i] <= 999 && vector[i] >= 100 ) {
                tres = tres + 1;
                
            }
            else if (vector[i] <= 9999 && vector[i] >= 1000 ) {
                cuatro = cuatro + 1;
                
            }
            else {
                cinco = cinco + 1;
            }
        }
        System.out.println("la cantidad de numeros de 1 digitos fue de: "+uno);
        System.out.println("la cantidad de numeros de 2 digitos fue de: "+dos);
        System.out.println("la cantidad de numeros de 3 digitos fue de: "+tres);
        System.out.println("la cantidad de numeros de 4 digitos fue de: "+cuatro);
        System.out.println("la cantidad de numeros de 5 digitos fue de: "+cinco);
    }
    
}
