
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
public class extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    String opcion="";
        do {
             mostrarMenu(opcion);
             opcion = leer.next();
             opcion = opcion.toUpperCase();
             CalcularDcto (opcion);
        } while (!opcion.equals("D"));
            
   
        
    }
   
    public static void mostrarMenu (String opcion){
        String respuesta="";
        System.out.println("-----------------------");
        System.out.println("|BIENVENIDO AL SISTEMA |");
        System.out.println("-----------------------");
        System.out.println("|  Ingrese una opcion  |");
        System.out.println("| A - Tipo de socio A  |");
        System.out.println("| B - Tipo de socio B  |");
        System.out.println("| C - Tipo de socio C  |");
        System.out.println("| D - Salir del sistema|");
        System.out.println("------------------------");
       
                
}
    public static void CalcularDcto (String opcion){
       Scanner leer = new Scanner (System.in);
        float valor;
        if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")) {
            System.out.println("Ingrese el valor del tratamiento:");
            valor = leer.nextFloat();
          
            switch (opcion) {
                case "A":
                    System.out.println("Usted tiene 50% de descuento");
                    System.out.println("El descuento del monto $"+valor+" es de $"+(valor*0.5));
                    System.out.println("Monto total a abonar es de $"+valor*0.5);
                    break;
                case "B":
                    System.out.println("Usted tiene 35% de descuento");
                    System.out.println("El descuento del monto $"+valor+" es de $"+(valor*0.35));
                    System.out.println("Monto total a abonar es de $"+valor*0.65);
                    break;
                 case "C":
                    System.out.println("Usted no tiene descuento disponible");
                    System.out.println("Monto total a abonar es de $"+valor);
                    break;
            }
        } else {
        }
    }
}
