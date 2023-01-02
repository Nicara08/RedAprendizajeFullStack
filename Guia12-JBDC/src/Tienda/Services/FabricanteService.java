
package Tienda.Services;

import Tienda.Entities.Fabricante;
import Tienda.Persistence.FabricanteDao;
import java.util.ArrayList;
import java.util.Scanner;

public class FabricanteService {
    
    private FabricanteDao fabDAO = new FabricanteDao ();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    protected Fabricante agregarFabricante (){
        System.out.println("Ingrese el codigo del fabricante");
        int codigo = leer.nextInt();
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = leer.next();
        
        return new Fabricante (codigo, nombre);
    }
    
    protected void ingresarFabricanteEnBD () throws Exception{
        try {
            Fabricante f1 = agregarFabricante();
            fabDAO.cargarFabricante(f1);
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void listaFabricantes () throws Exception{
        ArrayList <Fabricante> listaFabricante = fabDAO.listarFabricantes();
        
        for (Fabricante fabricante : listaFabricante) {
            System.out.println(fabricante);
        }
    }
}
