
package Estancias.Persistence;

import Estancias.Entities.Estancias;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstanciasDAO extends DAO_Estancias{
    
    public ArrayList<Estancias> listarEstancias (String sql) throws Exception{
        ArrayList<Estancias> lista = new ArrayList();
        try {
            consultarBase(sql);
            
            while (resultado.next()) {
                Estancias estancia = new Estancias ();
                estancia.setId_estancia(resultado.getInt(1));
                estancia.setId_cliente(resultado.getInt(2));
                estancia.setId_casa(resultado.getInt(3));
                estancia.setNombre_huesped(resultado.getString(4));
                estancia.setFecha_desde(resultado.getDate(5));
                estancia.setFecha_hasta(resultado.getDate(6));
                lista.add(estancia);
            }
            
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void cargarEstancia (Estancias estancia) throws SQLException, Exception{
        try {
            if (estancia == null) {
                throw new Exception ("Debe ingresar una estancia para cargar");
            }
            
            String sql = "INSERT INTO estancias (id_estancia,id_cliente,id_casa,nombre_huesped,fecha_desde,fecha_hasta) VALUES ('" + estancia.getId_estancia() + "','" + estancia.getId_cliente() + "','" + estancia.getId_casa() + "','" + estancia.getNombre_huesped() + "','" + estancia.getFecha_desde() + "','" + estancia.getFecha_hasta() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
}
