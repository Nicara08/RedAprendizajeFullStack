
package guia10.excepciones;

import java.util.ArrayList;

/**
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList ();
        nombres.add("Fede");
        nombres.add("Brune");
        
        try {
            System.out.println(nombres.get(-1));
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango");
        } catch (Exception e){
            System.out.println("Error");
        }
        
    }
    
}
