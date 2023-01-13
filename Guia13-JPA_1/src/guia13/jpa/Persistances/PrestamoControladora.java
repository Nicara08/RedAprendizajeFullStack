
package guia13.jpa.Persistances;

import guia13.jpa.Entities.Prestamo;
import guia13.jpa.Persistances.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PrestamoControladora {
    PrestamoJpaController presJpa = new PrestamoJpaController();

    public void altaPrestamo(Prestamo prestamo) {
        presJpa.create(prestamo);
    }

    public Prestamo buscarPrestamo(int nextInt) {
        Prestamo prestamo = presJpa.findPrestamo(nextInt);
        return prestamo;
    }

    public void editarPrestamo(Prestamo prestamo) {
        try {
            presJpa.edit(prestamo);
        } catch (Exception ex) {
            Logger.getLogger(PrestamoControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPrestamo(int id) {
        try {
            presJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PrestamoControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
