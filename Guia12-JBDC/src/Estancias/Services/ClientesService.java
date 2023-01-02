
package Estancias.Services;

import Estancias.Entities.Clientes;
import Estancias.Persistence.ClientesDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientesService {
    private ClientesDAO daoClientes = new ClientesDAO();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void cargarClientes () throws Exception{
        Clientes clientes = new Clientes ();
        System.out.println("");
        System.out.println("Ingrese id del cliente");
        int id_cliente = leer.nextInt();
        clientes.setId_cliente(id_cliente);
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        clientes.setNombre(nombre);
        System.out.println("Ingrese la calle de la casa");
        String calle = leer.next();
        clientes.setCalle(calle);
        System.out.println("Ingrese el numero de la casa");
        int numero = leer.nextInt();
        clientes.setNumero(numero);
        System.out.println("Ingrese el codigo postal de la casa");
        int codigo_postal = leer.nextInt();
        clientes.setCodigo_postal(codigo_postal);
        System.out.println("Ingrese la ciudad y pais de la casa");
        String ciudad = leer.next();
        clientes.setCiudad(ciudad);
        String pais = leer.next();
        clientes.setPais(pais);
        System.out.println("Ingrese el email");
        String email = leer.next();
        clientes.setEmail(email);
        
        daoClientes.cargarClientes(clientes);
        
        
    }
    
    public void listarClientes (String sql) throws Exception{
        ArrayList<Clientes> lista = daoClientes.listarClientes(sql);
        System.out.println("");
        for (Clientes clientes : lista) {
            System.out.println(clientes);
        }
    }
    
    public void buscarClienteID (int ID) throws Exception{
        String sql = "select * from clientes where id_cliente = "+ID+";";
        Clientes cliente = daoClientes.buscarClienteID(sql);
        
        System.out.println(cliente);
    }
    
   
}
