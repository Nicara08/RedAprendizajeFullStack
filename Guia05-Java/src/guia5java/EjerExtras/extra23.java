
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
public class extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String [][] matriz = new String [20][20];
       String palabra="", numPalabra; 
       int largo=0, ubi1, ubi2, ubi3, ubi4, ubi5, columna, aux=0,aux2, num;
       
       
               
       ubi1 = (int)(Math.random()*((3-0)+1)+0);
       ubi2 = (int)(Math.random()*((7-4)+1)+4);
       ubi3 = (int)(Math.random()*((11-8)+1)+8);
       ubi4 = (int)(Math.random()*((15-12)+1)+12);
       ubi5 = (int)(Math.random()*((19-16)+1)+16);

        for (int i = 0; i < 20; i++) {
            columna = (int)(Math.random()*((14-0)+1)+0);
            aux2=columna;
            for (int j = 0; j < 20; j++) {
                
                if (i == ubi1 || i == ubi2 || i == ubi3 || i == ubi4 || i == ubi5) {
                    
                    while (columna==j && aux2==columna) {
                        do {
                           System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                    palabra = leer.next();
                    largo = palabra.length();  
                    
                        } while (largo < 3 || largo > 5); 
                        aux2=columna+1;
                    }
                                      
                    if (columna<=j && (largo+columna>j)) {
                        matriz [i][j] = palabra.substring(aux, aux+1);
                        aux=aux+1;
                    }else {
                    num = (int)(Math.random()*((9-0)+1)+0);
                    numPalabra = String.valueOf(num);
                    matriz[i][j]= numPalabra;
                }
 
                }else {
                    num = (int)(Math.random()*((9-0)+1)+0);
                    numPalabra = String.valueOf(num);
                    matriz[i][j]= numPalabra;
                }
                
                
                
            }
            aux=0;
            
        }
        System.out.println("");
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
     }
    
}
