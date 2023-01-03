
package Persistances;

import Entities.Editorial;

public class EditorialControladoraPersistencia {
    EditorialJpaController ediJpa = new EditorialJpaController();

    public void altaEditorial(Editorial editorial) {
        ediJpa.create(editorial);
    }
}
