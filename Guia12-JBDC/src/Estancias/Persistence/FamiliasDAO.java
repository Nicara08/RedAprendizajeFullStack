
package Estancias.Persistence;

import Estancias.Entities.Familias;
import java.sql.SQLException;
import java.util.ArrayList;

public class FamiliasDAO extends DAO_Estancias{
    
        
    public ArrayList<Familias> listarFamilias (String sql) throws Exception{
       ArrayList<Familias> lista = new ArrayList ();
        try {
           consultarBase(sql);
            while(resultado.next()) {
                Familias familia = new Familias ();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                lista.add(familia);
            }
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }               
    }
    
    public void cargarFamilia (Familias familia) throws Exception, SQLException{
        try {
            if (familia == null) {
                throw new Exception ("Ingrese una familia");
            }
            String sql = "INSERT INTO familias (id_familia,nombre,edad_minima,edad_maxima,num_hijos,email,id_casa_familia) VALUES ('" + familia.getId_familia() + "','" + familia.getNombre() + "','" + familia.getEdad_minima() + "','" + familia.getEdad_maxima() + "','" + familia.getNum_hijos() + "','" + familia.getEmail() + "','" + familia.getId_casa_familia() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
}
