package Servicio;

import Entidad.Pelicula;
import Utilidad.ComparadorPelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones: 22 
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas
 * de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * •
 * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
 * en pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo
 * en pantalla. • Ordenar las películas por director, alfabéticamente y
 * mostrarlo en pantalla.
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Pelicula> listaPeli = new ArrayList();

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion en minutos de la pelicula");
        Float duracion = leer.nextFloat();
        duracion = duracion / 60;

        return new Pelicula(titulo, director, duracion);

    }

    public void cargarPeliculas() {
        String opc;
        do {
            System.out.println("Desea cargar una pelicula? S o N");
            opc = leer.next();
            if (opc.equalsIgnoreCase("S")) {
              listaPeli.add(crearPelicula ());
            }else if (!opc.equalsIgnoreCase("N")) {
                System.out.println("Opcion invalida"); 
            }

        } while (!opc.equalsIgnoreCase("N"));

    }
    
    public void mostrarPeli (){
        
        for (Pelicula aux : listaPeli) {
            System.out.println("Titulo: "+aux.getTitulo()+" Director: "+aux.getDirector()+" Duracion: "+aux.getDuracion());
         }
    }
    
    public void mostrarPelimasUno () {
        System.out.println("La/s pelicula/s con duracion mayor a 1 hora son: ");
        
        for (Pelicula aux : listaPeli) {
            
            if (aux.getDuracion()>1) {
                System.out.println("Titulo: "+aux.getTitulo()+" Director: "+aux.getDirector()+" Duracion: "+aux.getDuracion());
            }
        }
        
    }
    
    public void ordenaDescendiente (){
        Collections.sort(listaPeli, ComparadorPelicula.duraMaxMin);
        mostrarPeli();
    }
    
   public void ordenaAscendiente (){
        Collections.sort(listaPeli, ComparadorPelicula.duraMinMax);
        mostrarPeli();
    }
    public void ordenaTitulo (){
        Collections.sort(listaPeli, ComparadorPelicula.titulo);
        mostrarPeli();
    }
   public void ordenaDirector (){
        Collections.sort(listaPeli, ComparadorPelicula.director);
        mostrarPeli();
    }
   
   public void ejecucion (){
       cargarPeliculas();
       System.out.println("");
       mostrarPeli();
       System.out.println("");
       mostrarPelimasUno();
       System.out.println("");
       System.out.println("Las peliculas estan ordenadas en duracion descendente");
       ordenaDescendiente();
       System.out.println("");
       System.out.println("Las peliculas estan ordenadas en duracion ascendente");
       ordenaAscendiente();
       System.out.println("");
       System.out.println("Las titulos estan ordenadas alfabeticamente ");
       ordenaTitulo();
       System.out.println("");
       System.out.println("Los directores estan ordenadas alfabeticamente ");
       ordenaDirector();
       System.out.println("");
   }
}
