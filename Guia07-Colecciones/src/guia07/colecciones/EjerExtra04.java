package guia07.colecciones;

import Servicio.ServicioCiudades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
 * página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la
 * letra, solo el numero. • Pedirle al usuario que ingrese 10 códigos postales y
 * sus ciudades. • Muestra por pantalla los datos introducidos • Pide un código
 * postal y muestra la ciudad asociada si existe sino avisa al usuario. •
 * Muestra por pantalla los datos • Agregar una ciudad con su código postal
 * correspondiente más al HashMap. • Elimina 3 ciudades existentes dentro del
 * HashMap, que pida el usuario. • Muestra por pantalla los datos
 */
public class EjerExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCiudades sc = new ServicioCiudades();
        HashMap<Integer, String> map = new HashMap<>();
        String nombre = "";
        int contador = 0, aux = 0;

        map.put(1234, "Mendoza");
        map.put(4321, "San Juan");
        map.put(2234, "La Rioja");
        map.put(3234, "San Luis");
        map.put(4234, "Cordoba");
        map.put(5234, "Santa Fe");
        map.put(6234, "Bs As");
        map.put(7234, "Neuquen");
        map.put(8234, "Salta");
        map.put(9234, "Jujuy");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Ciudad: " + value + " CP: " + key);

        }

        System.out.println("");
        System.out.println("Ingrese un codigo postal para conocer la ciudad");
        Integer cod = leer.nextInt();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key == cod) {
                System.out.println("La ciudad corresponde a: " + value);
            }

        }

        System.out.println("");
        do {
            System.out.println("Ingrese el codigo postal de la ciudad a eliminar");
            //nombre = leer.next();
            cod = leer.nextInt();
            if (map.containsKey(cod)) {
                map.remove(cod);
                contador++;
            }
        } while (contador<3);

        /* for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key==cod) {
                System.out.println("La ciudad ha sido removida");
                map.remove(key);
            }
        }    */
 /* for (Integer key : map.keySet()) {
            if (key==cod) {
                System.out.println("La ciudad ha sido removida");
                map.remove(key);
            }
        }*/
        System.out.println("");
        System.out.println(map.toString());
    }

}
