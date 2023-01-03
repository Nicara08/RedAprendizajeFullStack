
package Services;

import Entities.Autor;
import Persistances.AutorControladoraPersistencia;
import Persistances.AutorJpaController;

public class AutorService {
    AutorControladoraPersistencia autorControladora = new AutorControladoraPersistencia();
    
    public void altaAutor (Autor autor){
        autorControladora.altaAutor(autor);
    }
    
    public void bajaAutor (Integer id){
        autorControladora.bajaAutor(id);
    }
}
