
package guia5java.EjerExtras;

/**
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
public class extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num = (int) (Math.random()*(10-5)+5);
        int vector[]=new int [num];
        int vectorA[] = new int [num];
        
        funcionLlenarVector (num, vector);
        funcionImprimirVector (num, vector);
                
       
    }
    public static int[] funcionLlenarVector (int num, int [] vector){
        
        
        for (int i = 0; i < num; i++) {
        vector[i] = (int)(Math.random()*((10-1)+1));
            
        }
        return vector;
    }
    public static void  funcionImprimirVector (int num, int [] vector){
        for (int i = 0; i < num; i++) {
            System.out.print("["+i+"] "+vector[i]+"  ");
            
        }
        System.out.println(" ");
    }
            
}
