
package guia10.excepciones;

import Entidad.Persona;
import Servicio.ServicioPersona;

/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona ();
        Persona p1 = new Persona ();
        
        p1 = null;
        
      
        boolean aux;
        try {
            aux = sp.esMayorDeEdad(p1.getEdad());
//            if (aux = sp.esMayorDeEdad(17)) {
//                System.out.println("Edad correcta");
//            }
            
        } catch (Exception e) {
            System.out.println("Edad incompatible");
        }
        
    }
    
}
