
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      int opcion;  
      do {
            System.out.println("Ingrese un numero del 1 al 10");
            opcion = leer.nextInt();
        } while (opcion > 10 || 1 > opcion);
      
    BuscadorNroRomano (opcion);
       
        
        
    }
    public static void BuscadorNroRomano (int opcion){
         switch (opcion) {
            case 1:
                System.out.println("El numero "+opcion+" en numero romano es I");
                break;
            case 2:
                System.out.println("El numero "+opcion+" en numero romano es II");
                break; 
            case 3:
                System.out.println("El numero "+opcion+" en numero romano es III");
                break; 
            case 4:
                System.out.println("El numero "+opcion+" en numero romano es IV");
                break;   
            case 5:
                System.out.println("El numero "+opcion+" en numero romano es V");
                break;
            case 6:
                System.out.println("El numero "+opcion+" en numero romano es VI");
                break;
            case 7:
                System.out.println("El numero "+opcion+" en numero romano es VII");
                break;
            case 8:
                System.out.println("El numero "+opcion+" en numero romano es VIII");
                break;
            case 9:
                System.out.println("El numero "+opcion+" en numero romano es IX");
                break;
            default:
                System.out.println("El numero "+opcion+" en numero romano es X");
        }
    }
}
