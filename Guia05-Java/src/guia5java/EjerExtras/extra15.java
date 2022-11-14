
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
public class extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num1, num2, retorno=0; 
        int opc=0, opcion=0;
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("");
            opcion = mostrarMenu (opc);
            System.out.println("");
            switch (opcion) {
                case 1:
                    retorno = funcionSuma (num1, num2);
                    System.out.println("La suma es de "+retorno);
                    break;
                case 2:
                    retorno = funcionResta (num1, num2);
                    System.out.println("La resta es de "+retorno);
                    break;
                case 3:
                    retorno = funcionMulti (num1, num2);
                    System.out.println("La multiplicacion es de "+retorno);
                    break;
                case 4:
                    retorno = funcionDivi (num1, num2);
                    System.out.println("La division es de "+retorno);
                    break;
            }
        } while (opcion !=5);
        System.out.println("");
        System.out.println("MUCHAS GRACIAS!");
        System.out.println("");
        
        
        
    }
    public static int mostrarMenu (int opc){
        Scanner leer = new Scanner (System.in);
        do {
            System.out.println("___________________");
            System.out.println("| 1 - SUMAR       |");
            System.out.println("| 2 - RESTAR      |");
            System.out.println("| 3 - MULTIPLICAR |");
            System.out.println("| 4 - DIVIDIR     |");
            System.out.println("| 5 - SALIR       |");
            System.out.println("___________________");
            opc = leer.nextInt();
        } while (opc > 5 || opc < 1);
        return opc;
        
    }
    public static double funcionSuma (double num1, double num2){
        double suma;
        suma = num1 + num2;
        return suma;
    }
    public static double funcionResta (double num1, double num2){
        double resta;
        resta = num1 - num2;
        return resta;
    }   
    public static double funcionMulti (double num1, double num2){
        double multi;
        multi = num1 * num2;
        return multi;
    } 
    public static double funcionDivi (double num1, double num2){
        double divi;
        divi = num1 / num2;
        return divi;
    } 
}