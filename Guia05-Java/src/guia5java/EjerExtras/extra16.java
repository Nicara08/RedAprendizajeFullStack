
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opcion;
        String respuesta;
        do {
        System.out.println("Ingrese la cantidad de personas a ingresar");
        opcion = leer.nextInt(); 
        } while (opcion < 1);
        
        do {
         mostrarPersonas (opcion); 
         System.out.println("Quiere seguir mostrando personas? SI para continuar, NO para salir");
         respuesta = leer.next();
         respuesta = respuesta.toUpperCase();
            if (!respuesta.equals("NO")) {
                System.out.println("Ingrese cuantas personas quiere mostrar");
                opcion = leer.nextInt();
                
            }
        } while (!respuesta.equals("NO"));
        
        System.out.println("");
        System.out.println("Muchas gracias");
        
       
        
        
    }
    
    public static void mostrarPersonas (int opcion){
        Scanner leer = new Scanner (System.in);
        int edad;
        String nombre;
        for (int i = 0; i < opcion; i++) {
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            if (edad < 18) {
                System.out.println("");
                System.out.println(nombre+" es menor de edad ya que tiene "+edad+" años");
            } else {
                System.out.println("");
               System.out.println(nombre+" es mayor de edad ya que tiene "+edad+" años"); 
            }
            
            
        }
    }
    
}
