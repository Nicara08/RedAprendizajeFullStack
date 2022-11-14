
package guia5java.EjerExtras;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A=2, B=4, C=6, D=8, aux=0;
        System.out.println("los valores iniciales fueron: ");
        System.out.println("Variable A: "+A+" Variable B: "+B+" Variable C: "+C+" y variable D: "+D);
    
      aux=B;
      B=C;
      C=A;
      A=D;
      D=aux;
      
        System.out.println("Variable A: "+A+" Variable B: "+B+" Variable C: "+C+" y variable D: "+D);
      
        
      
      
    }
  
    
}
