package Utilidad;

import Entidad.Paises;
import java.util.Comparator;

public class ComparadorPaises {

    public static Comparator<Paises> Comparador = new Comparator<Paises>() {
        @Override
        /*
        Paises ordenados alfabeticamente
         */
        public int compare(Paises t, Paises t1) {
            return t.getPais().compareTo(t1.getPais());

        }
    };
}
