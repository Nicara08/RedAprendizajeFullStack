package Estancias.Services;

import Estancias.Entities.Estancias;
import Estancias.Persistence.EstanciasDAO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class EstanciasService {
    private EstanciasDAO daoEstancias = new EstanciasDAO();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void cargarEstancias () throws Exception{
        Estancias estancia = new Estancias ();
        System.out.println("");
        System.out.println("ingrese id de la estancia");
        int id_estancia = leer.nextInt();
        estancia.setId_estancia(id_estancia);
        System.out.println("ingrese id del cliente");
        int cliente = leer.nextInt();
        estancia.setId_cliente(cliente);
        System.out.println("ingrese id de la casa");
        int casa = leer.nextInt();
        estancia.setId_casa(casa);
        System.out.println("Ingrese el nombre del huesped");
        String nombre = leer.next();
        estancia.setNombre_huesped(nombre);
        System.out.println("Ingrese el año, mes y dia de ingreso");
        Date fechaDesde = new Date (leer.nextInt(), leer.nextInt(), leer.nextInt());
        estancia.setFecha_desde(fechaDesde);
        System.out.println("Ingrese el año, mes y dia de salida");
        Date fechaSalida = new Date (leer.nextInt(), leer.nextInt(), leer.nextInt());
        estancia.setFecha_hasta(fechaSalida);
        daoEstancias.cargarEstancia(estancia);
    }
    
    public void listarEstancias (String sql) throws Exception{
        ArrayList<Estancias> lista = daoEstancias.listarEstancias(sql);
        System.out.println("");
        for (Estancias estancias : lista) {
            System.out.println(estancias);
        }
    }
}
