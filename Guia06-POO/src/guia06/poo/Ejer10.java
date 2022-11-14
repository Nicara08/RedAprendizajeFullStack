
package guia06.poo;

import java.text.DecimalFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Arrays;
import java.util.Collections;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        double[] vectorC = new double[50];
        double num, num1;
        int contador=0;
//        num = Math.sqrt(2);
//        System.out.println(num);
//        //1 manera, solo utilizando Math.round
//        num1 = (double) Math.round(num*100d)/100;
//        System.out.println(num1);
//        
//        //segunda manera import.text.DecimalFormat;, creamos un objeto
//        DecimalFormat df = new DecimalFormat ("#.00");
//        System.out.println(df.format(num));

        //tercer manera utilizando String format
        //System.out.println(String.format("%.2f", num));
        
        //cuarta manera utilizando Big decimal importando dos clases import java.math.bigdecimal; e import java.math.roundingmode;
//        BigDecimal bd = new BigDecimal (num);
//        bd = bd.setScale(2, RoundingMode.HALF_UP);
//        System.out.println(bd.doubleValue());
        
        System.out.println("VectorA aleatorio");
        for (int i = 0; i < 50; i++) {
            num = Math.random() * ((99 - 1) + 1);
            num = (double) Math.round(num * 100d) / 100;
            vectorA[i] = num;
            System.out.print(num + ", ");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("vectorA ordenado de menor a mayor");
        Arrays.sort(vectorA);
        System.out.print(Arrays.toString(vectorA)+", ");
        System.out.println("");
        System.out.println("");
        
        System.out.print("vectorA ordenado solo los primeros 10 elementos");
        
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
            //System.out.print(vectorA[i]+", ");;  
        }
        System.out.println("");
        
        for (int i = 0; i < 20; i++) {
            if (i < 10 ) {
                System.out.print(vectorB[i]+", ");
            }else{
                vectorB[i] = 0.5;
                System.out.print(vectorB[i]+", ");
            }
        }
        System.out.println("");
        System.out.println("");
        
        //ordenamiento con metodo burbuja
        System.out.println("vectorC ordenado por burbuja");
        for (int i = 0; i < vectorC.length-1; i++) {
            num = Math.random() * ((99 - 1) + 1);
            num = (double) Math.round(num * 100d) / 100;
            vectorC[i] = num;
            System.out.print(vectorC[i]+", ");
        }
        
        int cuentaIntercambios = 0;
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < vectorC.length-1; i++) {
                //-1 porque se analiza el valor actual y el que sigue
                if (vectorC[i]>vectorC[i+1]) {
                    //intercambiamos valores
                    double auxIntercambiable=vectorC[i];
                    vectorC[i]=vectorC[i+1];
                    vectorC[i+1] = auxIntercambiable;
                    cuentaIntercambios++;
                    contador += 1;
                }
            }
            if (cuentaIntercambios==0) {
                    ordenado = true;
                }
            cuentaIntercambios=0;
        }
            System.out.println("");
            System.out.println("");
            System.out.println("vectorC ordenado con burbuja");
            for (int i = 0; i < vectorC.length; i++) {
                System.out.print(vectorC[i]+", ");
        }
            System.out.println("");
            System.out.println("");
        }
    }


