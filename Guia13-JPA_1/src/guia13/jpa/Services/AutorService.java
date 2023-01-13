
package guia13.jpa.Services;

import guia13.jpa.Entities.Autor;
import guia13.jpa.Persistances.AutorControladora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutorService {
    AutorControladora autorControladora = new AutorControladora();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void altaAutor() {
        System.out.println("Ingres el nombre del autor");
        String nombre = leer.next();
        Autor autor = new Autor (0, nombre, true);
        autorControladora.altaAutor(autor);
    }

    public void editarAutor() {
        System.out.println("Ingrese el ID del autor");
        int id = leer.nextInt();
        Autor autor = autorControladora.buscarAutor(id);
        if (autor == null) {
            System.out.println("El autor no se encontro");
        }else{
            System.out.println("Ingrese el nombre acutalizaro del autor");
            autor.setNombre(leer.next());
            autorControladora.editarAutor(autor);
            System.out.println("El autor ha sido modificado");
        }
        
    }

    public void eliminarAutor() {
        System.out.println("Ingrese el ID del autor a eliminar");
        int id = leer.nextInt();
        Autor autor = autorControladora.buscarAutor(id);
        if (autor == null) {
            System.out.println("El autor no se encontro");
        }else{
            autorControladora.eliminarAutor(id);
            System.out.println("El autor ha sido eliminado");
        }
    }

    public void buscarAutorPorNombre() {
        System.out.println("Ingrese el nombre del autor a buscar");
        String nombre = leer.next();
        List<Autor> listita = autorControladora.traerAutores();
        ArrayList<Autor> listaAutores = new ArrayList(listita);
        boolean coincidencia=false;
        for (Autor autores : listaAutores) {
            if (autores.getNombre().equalsIgnoreCase(nombre)) {
                Autor autor = autores;
                System.out.println(autor.toString());
                coincidencia=true;
            }
        }
        if (coincidencia == false) {
            System.out.println("El autor no se encontro");
        }
    }
    
}
