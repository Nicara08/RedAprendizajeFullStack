
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, aux, aux2=0;
       
        do {
        System.out.println("Ingrese el largo de la escalera de numeros");
        num = leer.nextInt();
        } while (num<0);
        int [][] matriz = new int [num][num];
       
        for (int i =0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                aux=i;
                if (aux==i && j<=aux2 ) {
                matriz[i][j]=j+1;
                    System.out.print(matriz[i][j]);
                }else{
                    
                matriz[i][j]=1;
                }
                
                
            }
            aux2=aux2+1;
            System.out.println("");
        }
        
        
    }
    
}
