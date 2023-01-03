
package Services;

import Entities.Libro;
import Persistances.LibroControladoraPersistencia;
import Persistances.LibroJpaController;

public class LibroService {
    LibroControladoraPersistencia libroControladora = new LibroControladoraPersistencia();
    
    public void altaLibro (Libro libro){
        libroControladora.altaLibro(libro);
    }
}
