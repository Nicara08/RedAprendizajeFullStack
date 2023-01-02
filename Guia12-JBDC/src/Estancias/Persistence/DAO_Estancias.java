
package Estancias.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Estancias {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USUARIO = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "estancias_exterior";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase () throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDatos, USUARIO, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex ) {
            throw ex;
        }
    }
    
    protected void desconectarBase () throws SQLException{
        try {
            if (conexion == null) {
                conexion.close();                
            }
            if (resultado == null) {
                resultado.close();
            }
            if (sentencia == null) {
                sentencia.close();
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar (String sql) throws ClassNotFoundException, SQLException{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase (String sql) throws ClassNotFoundException, SQLException{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        } 
 
   }
}
