
package Estancias.Persistence;

import Estancias.Entities.Comentarios;
import Estancias.Entities.Estancias;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComentariosDAO extends DAO_Estancias {
    ArrayList<Comentarios> lista = new ArrayList();
    
    public ArrayList<Comentarios> listarComentarios (String sql) throws Exception{
        
        try {
            consultarBase(sql);
            
            while (resultado.next()) {
               Comentarios comentario = new Comentarios ();
               comentario.setId_comentario(resultado.getInt(1));
               comentario.setId_casa(resultado.getInt(2));
               comentario.setComentario(resultado.getString(3));
               lista.add(comentario);
            }
            
            desconectarBase();
            return lista;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void cargarComentario (Comentarios comentario) throws SQLException, Exception{
        try {
            if (comentario == null) {
                throw new Exception ("Ingrese un comentario");
            }
            
            
            String sql = "INSERT INTO comentarios (id_comentario,id_casa,comentario) VALUES ('" + comentario.getId_comentario() + "','" + comentario.getId_casa() + "','" + comentario.getComentario() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
}
