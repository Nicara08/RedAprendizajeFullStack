/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia5java.EjerAprendizaje;

import java.util.Scanner;

public class ejercicio14 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        double euro, opc=0;
        System.out.println("Ingrese la cantidad de euro a convertir");
        euro = leer.nextFloat(); String respuesta;
        do {            
            System.out.println("Ingrese a que moneda quiere convertir");
            System.out.println("Dolar");
            System.out.println("Yen");
            System.out.println("Libra");
            respuesta = leer.next();
            respuesta = respuesta.toLowerCase();
            
        } while (!"libra".equals(respuesta) && !"dolar".equals(respuesta) && !"yen".equals(respuesta));
       
        switch (respuesta) {
            case "dolar":
                opc = 1;
                break;
            case "yen":
                opc = 2;
                break;
            case "libra":
                opc = 3;
                break;
                  
        }
    double retorno = convertir(euro, opc);
        System.out.println("el valor convertido es "+retorno);
    }
    public static double convertir (double euro, double opc){
        double conversor=0;
        int opc1 = (int) opc;
        
        switch (opc1) {
                case 1:
                    conversor = euro * 1.28611;
                    return conversor;
                case 2:
                    conversor = euro * 129.852;
                    return conversor;
                case 3:
                    conversor = euro * 0.86;
                    return conversor;
                    
                }
       return conversor;
        }
}
