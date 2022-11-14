
package guia06.poo;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
import java.util.Scanner;

/**
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo ();
        Rectangulo r1 = sr.CrearRectangulo();
        sr.Superficie(r1);
        sr.Perimetro(r1);
        sr.Dibujo(r1);
        
        
        
        
//        Scanner leer = new Scanner (System.in);
//        Rectangulo R1 = new Rectangulo();
//        System.out.println("Ingrese la base y la altura del rectangulo");
//        R1.CrearRectangulo(leer.nextDouble(), leer.nextDouble());
//        System.out.println("La superficie del rectangulo es "+R1.Superficie());
//        System.out.println("");
//        System.out.println("El perimetro del rectangulo es "+R1.Perimetro());
//        System.out.println("");
//        System.out.println("El rectangulo dibujado con *");
//        R1.Dibujo();
//        System.out.println("");
//        
    }
    
}
