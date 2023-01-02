
package Estancias.Persistence;

import Estancias.Entities.Clientes;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientesDAO extends DAO_Estancias{
    
    public ArrayList<Clientes> listarClientes (String sql) throws Exception{
        ArrayList<Clientes> lista = new ArrayList ();
              
        try {
            consultarBase(sql);
            
            while (resultado.next()) {
                Clientes clientes = new Clientes ();
                clientes.setId_cliente(resultado.getInt(1));
                clientes.setNombre(resultado.getString(2));
                clientes.setCalle(resultado.getString(3));
                clientes.setNumero(resultado.getInt(4));
                clientes.setCodigo_postal(resultado.getInt(5));
                clientes.setCiudad(resultado.getString(6));
                clientes.setPais(resultado.getString(7));
                clientes.setEmail(resultado.getString(8));
                lista.add(clientes);                
            }
            
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void cargarClientes (Clientes clientes) throws SQLException, Exception{
        try {
            if (clientes == null) {
                throw new Exception ("Ingrese un cliente");
            }
            String sql = "INSERT INTO clientes (id_clientes,nombre,calle,numero,codigo_postal,ciudad,pais,email) VALUES ('" + clientes.getId_cliente() + "','" + clientes.getNombre() + "','" + clientes.getCalle() + "','" + clientes.getNumero() + "','" + clientes.getCodigo_postal() + "','" + clientes.getCiudad() + "','" + clientes.getPais() + "','" + clientes.getEmail() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
    public Clientes buscarClienteID (String sql) throws SQLException, Exception{
        try {
            consultarBase(sql);
            Clientes cliente = new Clientes ();
            while (resultado.next()) {
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getInt(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
            }
            desconectarBase();
            return cliente;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
}
