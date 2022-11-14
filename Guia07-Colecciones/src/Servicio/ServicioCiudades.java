/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ciudades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioCiudades {
    Scanner leer = new Scanner (System.in);
    HashMap <Integer, String> map = new HashMap();
    
    public void cargarCiudades (Ciudades c1){
        System.out.println("Ingrese la cidudad");
        String nombre = leer.next();
        System.out.println("Ingrese el CP");
        int cp = leer.nextInt();
        /*map.put(1234, "Mendoza");
        map.put(4321, "San Juan");
        map.put(2234, "La Rioja");
        map.put(3234, "San Luis");
        map.put(4234, "Cordoba");
        map.put(5234, "Santa Fe");
        map.put(6234, "Bs As");
        map.put(7234, "Neuquen");
        map.put(8234, "Salta");
        map.put(9234, "Jujuy");*/
        
        
        c1.setCodigo(cp);
        c1.setNombre(nombre);
    }
    
    public int eliminarCiudad (HashMap<Integer,String> map, String nombre){
        int contador =0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
             if (entry.getValue().equalsIgnoreCase(nombre)) {
                    contador++;
                    System.out.println("La ciudad ha sido removida");
                    map.remove(key);
                }
        }
       return contador;
    }
}
