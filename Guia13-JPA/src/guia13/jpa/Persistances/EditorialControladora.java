
package guia13.jpa.Persistances;

import guia13.jpa.Entities.Editorial;
import guia13.jpa.Persistances.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditorialControladora {
   EditorialJpaController ediJpa = new EditorialJpaController();

    public void altaEditorial(Editorial editorial) {
        ediJpa.create(editorial);
    }

    public Editorial buscarEditorial(int id) {
        Editorial editorial = ediJpa.findEditorial(id);
        return editorial;
    }

    public void editarEditorial(Editorial editorial) {
       try {
           ediJpa.edit(editorial);
       } catch (Exception ex) {
           Logger.getLogger(EditorialControladora.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public void eliminarEditorial(int id) {
       try {
           ediJpa.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(EditorialControladora.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
