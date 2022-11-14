
package guia5java.EjerAprendizaje;

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = new int [3][3];
       
       matriz[0][0]= 0; matriz[0][1]= -2; matriz[0][2]= 4;
       matriz[1][0]= 2; matriz[1][1]= 0; matriz[1][2]= 2;
       matriz[2][0]= -4; matriz[2][1]= -2; matriz[2][2]= 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"] ");
                               
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[j][i]+"] ");
                   /* if ((matriz[i][j]) == (matriz[j][i]*-1)) {
                        System.out.print("[SI] ");
                } else {
                        System.out.print("[NO] ");
                }*/
       
            }
            System.out.println(" ");
        }
         System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print("["+matriz[j][i]+"] ");
                    if ((matriz[i][j]) == (matriz[j][i]*-1)) {
                        System.out.print("[SI] ");
                } else {
                        System.out.print("[NO] ");
                }
       
            }
            System.out.println(" ");
        }
        System.out.println(" ");
       
       
       
       /* for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*(9+1)); 
                System.out.print(matriz[i][j]+" ");
                              
            }
            System.out.println(" ");
        }
        System.out.println(" ");
       
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println(" ");*/
    }
    
  
    }
