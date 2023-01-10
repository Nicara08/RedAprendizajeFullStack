package guia13.jpa.Services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuService {

    AutorService as = new AutorService();
    EditorialService es = new EditorialService();
    LibroService ls = new LibroService();
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
                System.out.println("4. Salir");
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
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 4);

    }

    private void altas() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Alta de Autor");
                System.out.println("2. Alta de Editorial");
                System.out.println("3. Alta de Libro");
                System.out.println("4. Volver al menú");
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
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 4);
    }

    private void modificaciones() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Modificar Autor");
                System.out.println("2. Modificar Editorial");
                System.out.println("3. Modificar Libro");
                System.out.println("4. Volver al menú");
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
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 4);
    }

    private void bajas() throws Exception {
        int opc;
        do {
            try {
                System.out.println("-----------------");
                System.out.println("1. Eliminar Autor");
                System.out.println("2. Eliminar Editorial");
                System.out.println("3. Eliminar Libro");
                System.out.println("4. Volver al menú");
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
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error de ingreso");
                leer.next();
                opc = 0;
            }
        } while (opc != 4);
    }

}
