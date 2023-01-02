package Estancias.Services;

import Estancias.Entities.Casas;
import Estancias.Persistence.CasasDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CasasService {

    private CasasDAO daoCasas = new CasasDAO();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Casas altaCasa() {
        System.out.println("");
        System.out.println("Ingrese ID de la casa");
        int id = leer.nextInt();
        System.out.println("Ingrese calle");
        String calle = leer.next();
        System.out.println("Ingrese el numero de la casa");
        int numero = leer.nextInt();
        System.out.println("Ingrese el codigo postal");
        int codigo_postal = leer.nextInt();
        System.out.println("Ingrese ciudad");
        String ciudad = leer.next();
        System.out.println("Ingrese pais");
        String pais = leer.next();
        System.out.println("Ingrese año, mes y dia de inicio");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fechaInicio = new Date(anio, mes, dia);
        System.out.println("Ingrese año, mes y dia de finalizacion");
        anio = leer.nextInt();
        mes = leer.nextInt();
        dia = leer.nextInt();
        Date fechaFinal = new Date(anio, mes, dia);
        System.out.println("Tiempo minimo");
        int min = leer.nextInt();
        System.out.println("Tiempo maximo");
        int max = leer.nextInt();
        System.out.println("Precio de la habitacion");
        double precio = leer.nextDouble();
        System.out.println("Tipo de vivienda");
        String vivienda = leer.next();
        return new Casas(dia, calle, numero, codigo_postal, ciudad, pais, fechaFinal, fechaFinal, min, max, precio, vivienda);
    }

    public void cargarCasaBD() throws Exception {
        try {
            Casas c1 = altaCasa();
            daoCasas.cargarCasa(c1);
        } catch (Exception e) {
            throw e;
        }

    }
    
    public void listarCasas () throws Exception{
        ArrayList<Casas> lista = new ArrayList();
        lista = daoCasas.listarCasas();
        
        for (Casas casas : lista) {
            System.out.println(casas);
        }
    }
    
     public void listarCasasCondicion (String sql) throws Exception {
        ArrayList<Casas> lista = new ArrayList();
        lista = daoCasas.listarCasasCondicion(sql);
        
        for (Casas casas : lista) {
            System.out.println(casas);
        }
    }
     
     public void modificarPrecioXcondicionPais (String sql) throws ClassNotFoundException, SQLException{
         daoCasas.modificarPrecioCasasXPais(sql);
     }
     
     public void consultarCasas (String sql) throws ClassNotFoundException, SQLException{
         daoCasas.consultarCasas(sql);
     }
}
