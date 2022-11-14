package Servicio;

import Entidad.Razas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class ServicioRazas {

    Scanner leer = new Scanner(System.in);

//atributo publico, trabajo directamente con la clase
    public Razas crearRazas() {
        ArrayList<String> nombre = new ArrayList();
        String opc;
        do {
            System.out.println("Ingrese la raza del perro");
            nombre.add(leer.next());
            System.out.println("Quiere guardar otra raza? S o N");
            opc = leer.next().toUpperCase();

        } while (opc.equalsIgnoreCase("S"));

        return new Razas(nombre);
    }

// atributo privado, envio a traves del set de la clase
    public void crearRazas2(Razas r1) {
        String opc;
        ArrayList<String> nombre = new ArrayList();
        do {
            System.out.println("Ingrese la raza del perro");
            nombre.add(leer.next());
            //r1.perro.add(leer.next());//si el atributo es publico

            System.out.println("Quiere guardar otra raza? S o N");
            opc = leer.next().toUpperCase();

        } while (opc.equalsIgnoreCase("S"));

        r1.setPerro(nombre);
    }

    public void eliminarPerro(Razas r1) {
        System.out.println("Ingrese el perro que desea eliminar");
        String opc = leer.next();
        int contador = 0;

        Iterator<String> it = r1.perro.iterator();
        // it es un objeto de tipo iterator al cual es iniciado con el arraylist perro de la 
        // clase raza, en este caso r1 con el metodo iterator
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(opc)) {
                it.remove();
                contador++;
            }
            
        }
        if (contador ==0) {
            System.out.println("El perro que queria borrar no se encuentra");
        }
        Collections.sort(r1.perro);
        System.out.println(r1.perro.toString());
        }
    }

