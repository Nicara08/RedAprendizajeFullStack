
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
public class extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int fila, columna;
        System.out.println("Ingrese la cantidad de filas y de columnas");
        fila = leer.nextInt(); columna = leer.nextInt();
        
        int [][] matriz = new int [fila][columna];
        
        llenadoMatriz (matriz, fila, columna);
        System.out.println("");
    }
    public static void  llenadoMatriz (int[][] matriz, int fila, int columna){
        int suma=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                
                matriz [i][j] = (int)(Math.random()*(100-1)+1);
                suma= matriz[i][j]+suma;
                /*if (i < fila-1 && j < columna ) {
                    System.out.print(matriz[i][j]+" + ");
                }else if (i == fila-1 && j == columna-2) {
                    System.out.print(matriz[i][j]+" + "); 
                }                   
                else {
                    System.out.print(matriz[i][j]+" = "+suma);
                }*/
               
            }
                 
            
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (i < fila-1 ){ 
                    System.out.print(matriz[i][j]+" + ");
                    
                }else if (i == fila-1 && j <= columna-2) {
                    System.out.print(matriz[i][j]+" + ");
                }else{
                    System.out.print(matriz[i][j]+" = "+suma);
                }
            }
        }
    }
}
