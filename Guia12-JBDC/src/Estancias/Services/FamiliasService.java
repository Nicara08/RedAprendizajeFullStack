
package Estancias.Services;

import Estancias.Entities.Familias;
import Estancias.Persistence.FamiliasDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class FamiliasService {
    private FamiliasDAO daoFamilias = new FamiliasDAO();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void cargarFamilia () throws Exception{
        Familias familia = new Familias ();
        System.out.println("Ingrese id de la familia");
        familia.setId_familia(leer.nextInt());
        System.out.println("Ingrese el nombre de la familia");
        familia.setNombre(leer.next());
        System.out.println("Ingrese la edad minima");
        familia.setEdad_minima(leer.nextInt());
        System.out.println("Ingrese la edad maxima");
        familia.setEdad_maxima(leer.nextInt());
        System.out.println("Ingrese numero de hijos");
        familia.setNum_hijos(leer.nextInt());
        System.out.println("Ingrese un email");
        familia.setEmail(leer.next());
        System.out.println("Ingrese el id de la casa");
        familia.setId_familia(leer.nextInt());
        daoFamilias.cargarFamilia(familia);
    }
    
    public void listarFamilias (String sql) throws Exception{
        ArrayList<Familias> lista = daoFamilias.listarFamilias(sql);
        System.out.println("");
        for (Familias familias : lista) {
            System.out.println(familias);
        }
    }
}
