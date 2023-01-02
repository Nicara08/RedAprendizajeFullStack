
package Tienda.Persistence;

import Tienda.Entities.Fabricante;
import java.sql.SQLException;
import java.util.ArrayList;

public class FabricanteDao extends DAO_Tienda{
    
    public void cargarFabricante (Fabricante fabricante) throws SQLException, Exception{
        try {
            if (fabricante == null) {
                throw new Exception ("Debe ingresar un fabricante");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre) VALUES ('" + fabricante.getNombre() + "','" + fabricante.getCodigo() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }
    
    public void modificarFabricante (Fabricante fabricante) throws Exception{
        try {
            if (fabricante == null) {
                throw new Exception ("Debe ingresar un fabricante");
            }
            String sql = "UPDATE fabricante SET" + "nombre='" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricantePorNombre (String nombre) throws Exception{
        try {
            if (nombre == null) {
                throw new Exception ("Debe indicar el fabricante a eliminar");
            }
            
            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList <Fabricante> listarFabricantes () throws Exception{
        ArrayList <Fabricante> lista = new ArrayList ();
        String sql ="SELECT * FROM fabricante;";
        
        try {
            consultarBase(sql);
            while (resultado.next()) {
                Fabricante fabricante = new Fabricante ();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                lista.add(fabricante);
                
            }
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    
}
