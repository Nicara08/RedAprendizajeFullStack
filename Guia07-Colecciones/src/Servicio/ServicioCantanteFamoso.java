package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
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
public class ServicioCantanteFamoso {

    Scanner leer = new Scanner(System.in);
    ArrayList<CantanteFamoso> lista3;

    public CantanteFamoso cargaCantantes() {
        System.out.println("");
        System.out.println("Ingrese el nombre del artista");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del disco con mas ventas");
        String disco = leer.next();
        System.out.println("");

        return new CantanteFamoso(nombre, disco);
    }

//    crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios.
    public ArrayList <CantanteFamoso> menu(ArrayList<CantanteFamoso> lista) {
        System.out.println("");
        String nombre;
        
        int opc = 0;
        this.lista3 = new ArrayList (lista);
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            opc = leer.nextInt();
            while (opc < 1 || opc > 4) {
                System.out.println("Opcion incorrecta, vuelva a intetar");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    lista.add(cargaCantantes());
                    break;
                case 2:
                    System.out.println(lista.toString());
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Ingrese el nombre del cantante a eliminar");
                    nombre = leer.next();
                    eliminarCantante(nombre, lista);
                    break;
            }
            //acciones(opc, lista);
        } while (opc != 4);
        return lista;
    }

 

    public ArrayList<CantanteFamoso> eliminarCantante(String nombre, ArrayList<CantanteFamoso> lista) {
        ArrayList<CantanteFamoso> lista2 = new ArrayList(lista);
        int contador = 0;
        Iterator<CantanteFamoso> it = lista.iterator();
        
        System.out.println("");

        while (it.hasNext()) {
           
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                contador++;
            }

        }
        if (contador == 1) {
            System.out.println("Artista removido");
        } else {
            System.out.println("El artista no se encuentra en la lista");
        }
        
       

        return lista;
    }
}
