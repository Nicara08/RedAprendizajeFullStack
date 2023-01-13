package guia13.jpa.Services;

import guia13.jpa.Entities.Autor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuService {

    AutorService as = new AutorService();
    EditorialService es = new EditorialService();
    LibroService ls = new LibroService();
    ClienteService cs = new ClienteService();
    PrestamoService ps = new PrestamoService();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() throws Exception {
        int opc;
        boolean continua;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Altas");
                System.out.println("2. Modificaciones");
                System.out.println("3. Bajas");
                System.out.println("4. Busquedas");                         
                System.out.println("5. Salir");
                System.out.println("-----------------");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        altas();                        
                        break;
                    case 2:
                        modificaciones();                       
                        break;
                    case 3:
                        bajas();                        
                        break;
                    case 4:
                        busquedas();                        
                        break;
                    
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 5);

    }

    private void altas() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Alta de Autor");
                System.out.println("2. Alta de Editorial");
                System.out.println("3. Alta de Libro");
                System.out.println("4. Alta de Cliente");                
                System.out.println("5. Alta de Prestamo");                
                System.out.println("6. Volver al menú");
                System.out.println("-----------------");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        as.altaAutor();
                        System.out.println("Autor cargado correctamente");                       
                        break;
                    case 2:
                        es.altaEditorial();
                        System.out.println("Editorial cargada correctamente");                        
                        break;
                    case 3:
                        ls.altaLibro();                        
                        break;
                    case 4:
                        cs.altaCliente();
                        System.out.println("Ciente cargado correctamente");                        
                        break;
                    case 5:
                        ps.altaPrestamo();                                                
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 6);
    }

    private void modificaciones() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Modificar Autor");
                System.out.println("2. Modificar Editorial");
                System.out.println("3. Modificar Libro");
                System.out.println("4. Modificar Cliente");
                System.out.println("5. Modificar Prestamo");
                System.out.println("6. Volver al menú");
                System.out.println("-----------------");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        as.editarAutor();                       
                        break;
                    case 2:
                        es.editarEditorial();                        
                        break;
                    case 3:
                        ls.editarLibro();                        
                        break;
                    case 4:
                        cs.editarCliente();                        
                        break;
                    case 5:
                        ps.editarPrestamo();                        
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 6);
    }

    private void bajas() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Eliminar Autor");
                System.out.println("2. Eliminar Editorial");
                System.out.println("3. Eliminar Libro");
                System.out.println("4. Eliminar Cliente");
                System.out.println("5. Eliminar Prestamo");
                System.out.println("6. Volver al menú");
                System.out.println("-----------------");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        as.eliminarAutor();                        
                        break;
                    case 2:
                        es.eliminarEditorial();                        
                        break;
                    case 3:
                        ls.eliminarLibro();                       
                        break;
                    case 4:
                        cs.eliminarCliente();                       
                        break;
                    case 5:
                        ps.eliminarPrestamo();                       
                        break;    
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 6);
    }

    private void busquedas() {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Buscar Autor por nombre");
                System.out.println("2. Búsqueda de un libro por ISBN");
                System.out.println("3. Búsqueda de un libro por Título.");
                System.out.println("4. Búsqueda de un libro/s por nombre de Autor");
                System.out.println("5. Búsqueda de un libro/s por nombre de Editorial");
                System.out.println("6. Volver al menú");
                System.out.println("-----------------");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        as.buscarAutorPorNombre();                        
                        break;
                    case 2:
                        ls.buscarLibroPorISBN();                        
                        break;
                    case 3:
                        ls.buscarLibroPorTItulo();                       
                        break;
                    case 4:
                        ls.buscarLibroPorNombreAutor();                       
                        break;
                    case 5:
                        ls.buscarLibroPorEditorial();                       
                        break;    
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 6);
    }

}
