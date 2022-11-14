
package guia5java.EjerAprendizaje;

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int [10][10];
        int [][] matrizP = new int [3][3];
        int num=10, xp=0, yp=0, auxI=0, auxJ=0;
        matrizP [0][0]=50; matrizP [0][1]=51; matrizP [0][2]=52;
        matrizP [1][0]=61; matrizP [1][1]=62; matrizP [1][2]=63;
        matrizP [2][0]=72; matrizP [2][1]=73; matrizP [2][2]=74;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j]=i+j+num;
                System.out.print(" ["+i+"]["+j+"] "+matrizM[i][j]);
                
            }
            num = num + 10;
            System.out.println(" ");
        }
        System.out.println(" ");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ["+i+"]["+j+"] "+matrizP[i][j]);
                
            }
            System.out.println(" ");
        }
         System.out.println(" ");
        
        for (int i = 0; i < 10; i++) {
           // auxI=i;
            for (int j = 0; j < 10; j++) {
               // auxJ=j;
                if (matrizM[i][j] == matrizP[xp][yp]) {
                    System.out.print("["+i+", "+j+"] ");
                    
                    if (yp < 2) {
                      yp = yp + 1;  
                    }
                  } 
                             
            }
            System.out.println(" ");
            if (yp > 0 && xp < 2 ) {
                yp = 0; 
                xp = xp + 1;
            }
            
        }
        System.out.println(" ");
    }
    
}
