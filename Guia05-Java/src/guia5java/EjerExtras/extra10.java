
package guia5java.EjerExtras;

import java.util.Random;
import java.util.Scanner;

/**
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Random aleatorio = new Random();
        int producto, num1, num2, respuesta, contador=1;
        num1 = (int) (Math.random()*10);
        num2 = aleatorio.nextInt(10);
        producto = num1*num2; 
        System.out.println("Ingrese un numero para adivinar la multiplicacion"+producto);
        respuesta = leer.nextInt();
        if (respuesta==producto) {
            //System.out.println("Respuesta correcta!");
        }
        while (respuesta!=producto) {
            System.out.println("Respuesta incorrecta, vuelva a intentar");
            respuesta = leer.nextInt();
            contador=contador+1;
        }
    
        System.out.println("Respuesta correcta en "+contador+" intentos");    }
    
}
