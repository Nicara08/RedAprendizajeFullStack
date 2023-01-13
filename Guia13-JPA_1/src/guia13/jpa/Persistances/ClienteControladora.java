
package guia13.jpa.Persistances;

import guia13.jpa.Entities.Cliente;
import guia13.jpa.Persistances.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteControladora {
    ClienteJpaController cliJpa = new ClienteJpaController();

    public void altaCliente(Cliente cliente) {
        cliJpa.create(cliente);
    }

    public Cliente buscarCliente(int id) {
        Cliente cliente = cliJpa.findCliente(id);
        return cliente;
    }

    public void editarCliente(Cliente cliente) {
        try {
            cliJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ClienteControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCliente(int id) {
        try {
            cliJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ClienteControladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
