package guia13.jpa.Services;

import guia13.jpa.Entities.Cliente;
import guia13.jpa.Entities.Libro;
import guia13.jpa.Entities.Prestamo;
import guia13.jpa.Persistances.ClienteControladora;
import guia13.jpa.Persistances.LibroControladora;
import guia13.jpa.Persistances.PrestamoControladora;
import java.util.Date;
import java.util.Scanner;

public class PrestamoService {

    PrestamoControladora presControladora = new PrestamoControladora();
    ClienteControladora cliControladora = new ClienteControladora();
    LibroControladora liControladora = new LibroControladora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    void altaPrestamo() {
        System.out.println("Ingrese el ID del cliente");
        int id = leer.nextInt();
        Cliente cliente = cliControladora.buscarCliente(id);
        if (cliente == null) {
            System.out.println("Cliente no encontrado");
        } else {
            System.out.println("Ingrese el ISBN del libro a pedir");
            Libro libro = liControladora.buscarLibro(leer.nextInt());
            if (libro == null) {
                System.out.println("Libro no encontrado");
            } else {
                if (libro.getEjemplares() < 1) {
                    System.out.println("No hay libros disponibles para prestar");
                } else {
                    System.out.println("Ingrese año, mes y dia de inicio de prestamo");
                    Date inicio = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                    System.out.println("Ingrese año, mes y dia de finalizacion del prestamo");
                    Date fin = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
                    libro.setEjemplares(libro.getEjemplares()-1);
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                    liControladora.editarLibro(libro);
                    Prestamo prestamo = new Prestamo(0, inicio, fin, libro, cliente);                    
                    presControladora.altaPrestamo(prestamo);
                    System.out.println("Prestamo cargado correctamente");
                }

            }
        }

    }

    void editarPrestamo() {
        System.out.println("Ingrese el ID del prestamo a editar");
        Prestamo prestamo = presControladora.buscarPrestamo(leer.nextInt());
        if (prestamo == null) {
            System.out.println("Prestamo no encontrado");
        } else {
            System.out.println("Ingrese la fecha de devolucion nueva");
            Date fin = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
            prestamo.setFechaDevolucion(fin);
            presControladora.editarPrestamo(prestamo);
        }
    }

    void eliminarPrestamo() {
        System.out.println("Ingrese el ID del prestamo a eliminar");
        int id = leer.nextInt();
        Prestamo prestamo = presControladora.buscarPrestamo(id);
        if (prestamo == null) {
            System.out.println("El prestamo no se encuentra cargado");
        } else {
            presControladora.eliminarPrestamo(id);
            System.out.println("Prestamo eliminado");
        }
    }
}
