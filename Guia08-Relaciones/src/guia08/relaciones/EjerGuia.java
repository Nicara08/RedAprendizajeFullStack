package guia08.relaciones;

import Entidad.DNI;
import Entidad.Persona;

/**
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
public class EjerGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona ();
        DNI d1 = new DNI ();
        d1.setNumero(33274211);
        d1.setSerie("A");
        p1.setApellido("Lorenzo");
        p1.setNombre("Fede");
        p1.setDni(d1);
        System.out.println(p1.toString());
       
    }
    
}
