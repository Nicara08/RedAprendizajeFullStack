
package Services;

import Entities.Editorial;
import Persistances.EditorialControladoraPersistencia;
import Persistances.EditorialJpaController;

public class EditorialService {
    EditorialControladoraPersistencia editorialControladora = new EditorialControladoraPersistencia();
    
    public void altaEditorial (Editorial editorial){
        editorialControladora.altaEditorial(editorial);
    }
}
