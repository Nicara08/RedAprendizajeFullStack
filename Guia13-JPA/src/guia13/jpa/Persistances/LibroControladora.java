
package guia13.jpa.Persistances;

import guia13.jpa.Entities.Libro;
import guia13.jpa.Persistances.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibroControladora {
    LibroJpaController liJpa = new LibroJpaController();            

    public void altaLibro(Libro libro) {
        liJpa.create(libro);
    }

    public Libro buscarLibro(int isbn) {
        Libro libro = liJpa.findLibro(isbn);
        return libro;
    }

    public void editarLibro(Libro libro) {
        try {
            liJpa.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(LibroControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarLibro(int isbn) {
        try {
            liJpa.destroy(isbn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(LibroControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
