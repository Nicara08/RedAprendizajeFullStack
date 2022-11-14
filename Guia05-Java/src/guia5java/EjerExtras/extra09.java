
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
public class extra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, aux=0, contador=1, num=0;
        
        do {
            System.out.println("Ingrese el primer numero entero");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero entero");
            num2 = leer.nextInt();
        } while (num1 < 0 || num2 < 0);
        
        if (num1 > num2) {
            System.out.println("Comienza la division por resta de "+num1+" dividido "+num2);
            aux = num1 - num2;
            System.out.println("");
            System.out.println(num1+" - "+num2+" = "+aux);
            while (num2 <= aux) {
                num1= aux - num2;
                System.out.println(aux+" - "+num2+" = "+num1);
                aux=num1;
                contador = contador + 1;
               num=num2;
            }
          
            
        } else {
            System.out.println("Comienza la division por resta de "+num2+" dividido "+num1);
            System.out.println("");
            aux = num2 - num1;
            System.out.println(num2+" - "+num1+" = "+aux);
            while (num1 <= aux) {
                num2= aux - num1;
                System.out.println(aux+" - "+num1+" = "+num2);
                aux=num2;
                contador = contador + 1;
                num=num1;
        }
       
    }
        System.out.println(""); 
        System.out.println("Dado que "+aux+" es menor que "+num+", entonces: el residuo es "+aux+" y el cociente es "+contador);
        }

}
