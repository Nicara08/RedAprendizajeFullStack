
package guia13.jpa.Services;

import guia13.jpa.Entities.Editorial;
import guia13.jpa.Persistances.EditorialControladora;
import java.util.Scanner;


public class EditorialService {
    EditorialControladora editorialControladora = new EditorialControladora();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void altaEditorial() {
        System.out.println("Ingrese el nombre de la editorial a cargar");
        Editorial editorial = new Editorial (0, leer.next(), true);
        editorialControladora.altaEditorial(editorial);
    }

    public void editarEditorial() {
        System.out.println("Ingrese el ID de la editorial a modificar");
        int id = leer.nextInt();
        Editorial editorial = editorialControladora.buscarEditorial(id);
        if (editorial == null) {
            System.out.println("Editorial no encontrada");
        }else{
            System.out.println("Ingrese el nombre nuevo de la editorial");
            String nombre = leer.next();
            editorial.setNombre(nombre);
            editorialControladora.editarEditorial(editorial);
            System.out.println("Editorial modificada");
        }
    }

    void eliminarEditorial() {
        System.out.println("Ingrese el id de la editorial a eliminar");
        int id = leer.nextInt();
        Editorial editorial = editorialControladora.buscarEditorial(id);
        if (editorial == null) {
            System.out.println("La editorial no se encuentra en la base de datos");
        }else{
            editorialControladora.eliminarEditorial(id);
        }
       
    }
}
