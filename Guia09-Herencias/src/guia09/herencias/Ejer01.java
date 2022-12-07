
package guia09.herencias;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro ("Lola", "croquetas", 6, "Calleja");
        Animal caballo1 = new Caballo ("Rayo", "Pasto", 5, "Criollo");
        Animal gato1 = new Gato ("Michina", "Balanceado", 4, "Tricolor");
        
        perro1.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
        
    }   
    
    
}
