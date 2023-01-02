
package Estancias.Services;

import Estancias.Entities.Comentarios;
import Estancias.Persistence.ComentariosDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ComentariosService {
    private ComentariosDAO daoComen = new ComentariosDAO();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    protected void cargarComentarios () throws Exception{
        Comentarios comentario = new Comentarios ();
        System.out.println("Ingrese el id del comentario");
        int id_comentario = leer.nextInt();
        comentario.setId_comentario(id_comentario);
        System.out.println("Ingrese el id de la casa");
        int id_casa = leer.nextInt();
        comentario.setId_casa(id_casa);
        System.out.println("Ingrese el comentario");
        comentario.setComentario(leer.next());
        
        daoComen.cargarComentario(comentario);
    } 
    
    public void listarComentarios (String sql) throws Exception{
        ArrayList<Comentarios> lista = daoComen.listarComentarios(sql);
        System.out.println("");
        
        for (Comentarios comentarios : lista) {
            System.out.println(comentarios);
        }
    }
}
