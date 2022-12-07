package guia09.herencias;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServicioElectrodomestico;

/**
 *
 * @author hans chang 201708
 */
public class Ejer02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico e1, e2;
        Lavadora lavadora1, lavadora2;
        Televisor t1, t2;
        ServicioElectrodomestico se = new ServicioElectrodomestico();
        
        
        lavadora1 = se.crearLavadora();
        System.out.println("El precio de la lavadora es: "+lavadora1.getPrecio());
        lavadora2 = se.crearLavadora();
        t1 = se.crearTele();
        System.out.println("El precio de la tele es: "+t1.getPrecio());
        t2 = se.crearTele();
        System.out.println(lavadora1);
        System.out.println("");
        se.listasElectro(t1, t2, lavadora1, lavadora2);
        
        
      
        
        
        
        
    }
    
    
}
