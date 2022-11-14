
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int personas, contadorAltura=0; float altura, sumaAltura=0, sumaTotal=0;
        
        do {            
            System.out.println("Ingrese cuantas personas van a ingresar sus alturas");
            personas = leer.nextInt();
        } while (personas < 2);
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona numero "+(i+1));
            altura = leer.nextFloat();
            if (altura < 1.60 ) {
                    
                contadorAltura = contadorAltura + 1;
                sumaAltura = sumaAltura + altura;                
            }
            sumaTotal = sumaTotal + altura;
            
            
        }
        System.out.println("la cantidad de personas por debajo de 1.60 es de "+contadorAltura+" y el promedio de altura es de "+sumaAltura/contadorAltura);
        System.out.println("el total de personas fue de "+personas+" con un promedio de altura de "+sumaTotal/personas);
    }
    
}
