
package Estancias.Persistence;

import Estancias.Entities.Casas;
import java.sql.SQLException;
import java.util.ArrayList;

public class CasasDAO extends DAO_Estancias {
    
    public ArrayList<Casas> listarCasas () throws Exception, SQLException{
     ArrayList<Casas> lista = new ArrayList ();
     String sql = "select * from casas;";
     
        try {
            consultarBase(sql);
            
            while (resultado.next()) {
                Casas casas = new Casas ();
                casas.setId_casa(resultado.getInt(1));
                casas.setCalle(resultado.getString(2));
                casas.setNumero(resultado.getInt(3));
                casas.setCodigo_postal(resultado.getInt(4));
                casas.setCiudad(resultado.getString(5));
                casas.setPais(resultado.getString(6));
                casas.setFecha_desde(resultado.getDate(7));
                casas.setFecha_hasta(resultado.getDate(8));
                casas.setTiempo_minimo(resultado.getInt(9));
                casas.setTiempo_maximo(resultado.getInt(10));
                casas.setPrecio_habitacion(resultado.getDouble(11));
                casas.setTipo_vivienda(resultado.getString(12));
                lista.add(casas);
            }
            desconectarBase();
            return lista; 
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void cargarCasa (Casas casa) throws SQLException, Exception{
        try {
            if (casa == null) {
                throw new Exception ("Debe ingresar datos de la casa");
            }
            
            String sql = "INSERT INTO casas (id_casa,calle,numero,codigo_postal,ciudad,pais,fecha_desde,fecha_hasta,tiempo_minimo,tiempo_maximo,precio_habitacion,tipo_vivienda) VALUES ('" + casa.getId_casa() + "','" + casa.getCalle() + "','" + casa.getNumero()+ "','" + casa.getCodigo_postal() + "','" + casa.getCiudad() + "','" + casa.getPais() + "','" + casa.getFecha_desde() + "','" + casa.getFecha_hasta() + "','" + casa.getTiempo_minimo() + "','" + casa.getTiempo_maximo() + "','" + casa.getPrecio_habitacion() + "','" + casa.getTipo_vivienda()+ "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }
    
    public ArrayList<Casas> listarCasasCondicion (String sql) throws Exception{
        ArrayList<Casas> lista = new ArrayList();
        
        try {
            consultarBase(sql);
            
            while (resultado.next()) {
               Casas casas = new Casas ();
               casas.setId_casa(resultado.getInt(1));
               casas.setCalle(resultado.getString(2));
               casas.setNumero(resultado.getInt(3));
               casas.setCodigo_postal(resultado.getInt(4));
               casas.setCiudad(resultado.getString(5));
               casas.setPais(resultado.getString(6));
               casas.setFecha_desde(resultado.getDate(7));
               casas.setFecha_hasta(resultado.getDate(8));
               casas.setTiempo_minimo(resultado.getInt(9));
               casas.setTiempo_maximo(resultado.getInt(10));
               casas.setPrecio_habitacion(resultado.getDouble(11));
               casas.setTipo_vivienda(resultado.getString(12));
               lista.add(casas);
            }
            
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void modificarPrecioCasasXPais (String sql) throws ClassNotFoundException, SQLException{
        try {
            insertarModificarEliminar(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    public void consultarCasas (String sql) throws ClassNotFoundException, SQLException{
        try {
            consultarBase(sql);
        } catch (ClassNotFoundException | SQLException e) {
        throw e;
        }
    }
}
