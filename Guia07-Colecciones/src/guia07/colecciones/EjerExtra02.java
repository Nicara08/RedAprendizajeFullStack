package guia07.colecciones;

import Entidad.CantanteFamoso;
import Servicio.ServicioCantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos
 * y tendrá como atributos el nombre y discoConMasVentas. Se debe, además, en el
 * main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
 * CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
 * cantante y su disco con más ventas por pantalla. Una vez agregado los 5, en
 * otro bucle, crear un menú que le de la opción al usuario de agregar un
 * cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista
 * con todos los cambios.
 */
public class EjerExtra02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<CantanteFamoso> lista = new ArrayList ();
        ServicioCantanteFamoso sc = new ServicioCantanteFamoso();              
        
        for (int i = 0; i < 2; i++) {
            lista.add(sc.cargaCantantes());
        }
        System.out.print(lista.toString());
        //sc.menu(lista);
        lista = sc.menu (lista);
        System.out.println(lista.toString());
    }
}
