
package guia13.jpa.Persistances;

import guia13.jpa.Entities.Autor;
import guia13.jpa.Persistances.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AutorControladora {
    AutorJpaController auJpa = new AutorJpaController();

    public void altaAutor(Autor autor) {
        auJpa.create(autor);
    }

    public Autor buscarAutor(int id) {
        Autor autor = auJpa.findAutor(id);
        return autor;
    }

    public void editarAutor(Autor autor) {
        try {
            auJpa.edit(autor);
        } catch (Exception ex) {
            Logger.getLogger(AutorControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAutor(int id) {
        try {
            auJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(AutorControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
