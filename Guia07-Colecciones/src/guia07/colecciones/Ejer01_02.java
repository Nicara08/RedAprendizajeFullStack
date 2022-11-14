
package guia07.colecciones;

import Entidad.Razas;
import Servicio.ServicioRazas;

/**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Ejer01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRazas sr = new ServicioRazas ();
        Razas r1 = new Razas ();
        r1 = sr.crearRazas();
       // r1.setPerro(perro);
        System.out.println(r1.toString());
        System.out.println(r1.getPerro().toString());
       // sr.crearRazas2(r1);
       sr.eliminarPerro(r1);
    }
    
}
