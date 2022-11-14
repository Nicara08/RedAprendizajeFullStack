
package guia5java.EjerExtras;

import java.util.Scanner;
/**
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break
 */
public class extra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, contador=0, suma=0, contadorPar=0, contadorImpar=0;
        do {
        System.out.println("Ingrese numeros enteros");
        num = leer.nextInt();
            if (num > 0) {
                contador = contador + 1;
                suma = suma + num;
                if ((num % 2 ) == 0) {
                    contadorPar = contadorPar + 1;
                } else {
                    contadorImpar = contadorImpar + 1;
                }
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros enteros leidos fue de "+contador);
        System.out.println("La cantidad de numeros pares fue de "+contadorPar);
        System.out.println("La cantidad de numeros impares fue de "+contadorImpar);
        System.out.println("La suma de todos los numeros leidos fue de "+suma);
    }
    
}
