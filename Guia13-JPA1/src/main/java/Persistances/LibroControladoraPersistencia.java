
package Persistances;

import Entities.Libro;

public class LibroControladoraPersistencia {
    LibroJpaController liJpa = new LibroJpaController();

    public void altaLibro(Libro libro) {
        liJpa.create(libro);
    }
}
