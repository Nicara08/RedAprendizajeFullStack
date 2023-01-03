
package Persistances;

import Entities.Autor;
import Persistance.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutorControladoraPersistencia {
    AutorJpaController auJpa = new AutorJpaController();

    public void altaAutor(Autor autor) {
        auJpa.create(autor);
    }

    public void bajaAutor(Integer id) {
        try {
            auJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(AutorControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
