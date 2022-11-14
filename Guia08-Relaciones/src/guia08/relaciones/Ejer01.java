
package guia08.relaciones;

import Entidad.*;
import Enum.EnumPerros;

/**
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona1 p1 = new Persona1 ("Pepe", "Ruiz", 15, "33215145");
        Persona1 p2 = new Persona1 ("Raul", "Gonzalez", 45, "15456145");
        Perro pe1 = new Perro ("Lola", EnumPerros.CALLEJERO, 5, "Mediano");
        Perro pe2 = new Perro ("Rocco", EnumPerros.GOLDEN, 3, "Grande");
        
        p1.setPerro(pe1);
        p2.setPerro(pe2);
        
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
                
    }
    
}
