/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia5java.EjerAprendizaje;

import java.util.Scanner;

public class ejercicio12 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String palabra;
        int contador=0, correcto=0;
        
        do { 
            System.out.println("ingrese una frase");
            palabra = leer.next();
            palabra = palabra.toUpperCase();
            contador = contador + 1;
            
            if (palabra.length() < 6 && palabra.length() > 0 ) {
                if ("X".equals(palabra.substring(0,1)) && "O".equals(palabra.substring(palabra.length()-1, palabra.length()))) {
                    correcto = correcto + 1;
                }
                
            }
            
        } while (!"&&&&&".equals(palabra));
        System.out.println("los ingresos totales fueron de :"+(contador-correcto));
        System.out.println("los ingresos correctos fueron :"+correcto);
    }
    
}
