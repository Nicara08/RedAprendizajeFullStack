
package Utilidad;

import Entidad.Pelicula;
import java.util.Comparator;

public class ComparadorPelicula {
    /**
     * ordenar duracion descendente
     */
      public static Comparator <Pelicula> duraMaxMin = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }       
    };
      
      /**
     * ordenar duracion ascendente
     */
      public static Comparator <Pelicula> duraMinMax = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }       
    };
      /**
     * ordenar Titulo alfabeticamente
     */
      public static Comparator <Pelicula> titulo = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }       
    };
       /**
     * ordenar director alfabeticamente
     */
      public static Comparator <Pelicula> director = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }       
    };
}
