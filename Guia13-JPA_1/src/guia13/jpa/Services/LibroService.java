package guia13.jpa.Services;

import guia13.jpa.Entities.Autor;
import guia13.jpa.Entities.Editorial;
import guia13.jpa.Entities.Libro;
import guia13.jpa.Persistances.AutorControladora;
import guia13.jpa.Persistances.EditorialControladora;
import guia13.jpa.Persistances.LibroControladora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroService {

    LibroControladora libroControladora = new LibroControladora();
    EditorialControladora editorialControladora = new EditorialControladora();
    AutorControladora autorControladora = new AutorControladora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    void altaLibro() {
        System.out.println("Ingrese el id del autor del libro");
        int id = leer.nextInt();
        Libro libro = new Libro();

        Autor autor = autorControladora.buscarAutor(id);
        if (autor == null) {
            System.out.println("El autor no se encuentra cargado");
        } else {
            libro.setAutor(autor);
            System.out.println("Ingrese el ID de la editorial");
            id = leer.nextInt();
            Editorial editorial = editorialControladora.buscarEditorial(id);
            if (editorial == null) {
                System.out.println("La editorial no se encuentra cargada");
            } else {
                libro.setEditorial(editorial);
                System.out.println("Ingerese el nombre del libro");
                libro.setTitulo(leer.next());
                System.out.println("Ingrese el año del libro");
                libro.setAnio(leer.nextInt());
                System.out.println("Ingrese cuantos ejemplares tiene");
                libro.setEjemplares(leer.nextInt());
                System.out.println("Ingrese cuantos ejemplares se encuentran prestados");
                libro.setEjemplaresPrestados(leer.nextInt());
                libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
                libroControladora.altaLibro(libro);
            }
        }

    }

    void editarLibro() {
        System.out.println("Ingrese el ISBN del libro a editar");
        int isbn = leer.nextInt();
        Libro libro = libroControladora.buscarLibro(isbn);
        if (libro == null) {
            System.out.println("El libro no se encuentra en la base de datos");
        } else {
            System.out.println("Ingrese nombre nuevo");
            String nombre = leer.next();
            System.out.println("ingrese año del libro");
            int anio = leer.nextInt();
            libro.setAnio(anio);
            libro.setTitulo(nombre);
            libroControladora.editarLibro(libro);
        }
    }

    void eliminarLibro() {
        System.out.println("Ingrese el ISBN del libro a editar");
        int isbn = leer.nextInt();
        Libro libro = libroControladora.buscarLibro(isbn);
        if (libro == null) {
            System.out.println("El libro no se encuentra en la base de datos");
        } else {
            libroControladora.eliminarLibro(isbn);
        }
    }

    void buscarLibroPorISBN() {
        System.out.println("Ingrese el ISBN del libro a buscar");
        int isbn = leer.nextInt();
        List<Libro> listita = libroControladora.traerLibros();
        ArrayList<Libro> listaLibros = new ArrayList(listita);
        boolean coincidencia = true;
        for (Libro listaLibro : listaLibros) {
            if (listaLibro.getIsbn() == isbn) {
                Libro libro = listaLibro;
                System.out.println(libro.toString());
                coincidencia = false;
            }
        }
        if (coincidencia) {
            System.out.println("No se encontro el libro");
        }
    }

    void buscarLibroPorTItulo() {
        System.out.println("Ingrese el titulo del libro a buscar");
        String titulo = leer.next();
        List<Libro> listita = libroControladora.traerLibros();
        ArrayList<Libro> listaLibros = new ArrayList(listita);
        boolean coincidencia = true;
        for (Libro libros : listaLibros) {
            if (libros.getTitulo().equalsIgnoreCase(titulo)) {
                Libro libro = libros;
                System.out.println(libro.toString());
                coincidencia = false;
            }

        }
        if (coincidencia) {
            System.out.println("No se encontro el libro buscado");
        }
    }

    void buscarLibroPorNombreAutor() {
        System.out.println("Ingrese el nombre del autor para traer los libros");
        String nombre = leer.next();
        List<Libro> listita = libroControladora.traerLibros();
        ArrayList<Libro> listaLibros = new ArrayList(listita);
        boolean coincidencia = true;
        for (Libro libros : listaLibros) {
            if (libros.getAutor().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(libros.toString());
                coincidencia=false;
            }
        }
        if (coincidencia) {
            System.out.println("El autor no tiene libros cargados");
        }
    }

    void buscarLibroPorEditorial() {
        System.out.println("Ingrese el nombre de la editorial para conocer los libros cargados");
        String nombre = leer.next();
        List<Libro> listita = libroControladora.traerLibros();
        ArrayList<Libro>listaLibros = new ArrayList(listita);
        boolean coincidencia = true;
        for (Libro libros : listaLibros) {
            if (libros.getEditorial().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(libros.toString());
                coincidencia = false;
            }
        }
        if (coincidencia) {
            System.out.println("La editorial no tiene libros cargados");
        }
}
}
