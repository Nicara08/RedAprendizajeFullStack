
package guia13.jpa.Services;

import guia13.jpa.Entities.Cliente;
import guia13.jpa.Persistances.ClienteControladora;
import java.util.Scanner;


public class ClienteService {
    ClienteControladora cliControladora = new ClienteControladora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    void altaCliente() {
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido del cliente");
        String apellido = leer.next();
        System.out.println("Ingrese el DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese el numero de telefono");
        String telefono = leer.next();
        Cliente cliente = new Cliente(0, dni, nombre, apellido, telefono);
        cliControladora.altaCliente(cliente);
    }

    void editarCliente() {
        System.out.println("Ingrese el ID del cliente a modificar");
        int id = leer.nextInt();
        Cliente cliente = cliControladora.buscarCliente(id);
        if (cliente == null) {
            System.out.println("Cliente no encontrado");
        }else{
            System.out.println("Ingrese el nombre actualizado");
            cliente.setNombre(leer.next());
            System.out.println("Ingrese el apellido actualizado");
            cliente.setApellido(leer.next());
            System.out.println("Ingrese el telefono actualizado");
            cliente.setTelefono(leer.next());
            cliControladora.editarCliente(cliente);
        }
    }

    void eliminarCliente() {
        System.out.println("Ingrese el ID del cliente a eliminar");
        int id = leer.nextInt();
        Cliente cliente = cliControladora.buscarCliente(id);
        if (cliente == null) {
            System.out.println("Cliente no encontrado");
        }else{
            cliControladora.eliminarCliente(id);
            System.out.println("Cliente eliminado correctamente");
        }
        
    }
}
