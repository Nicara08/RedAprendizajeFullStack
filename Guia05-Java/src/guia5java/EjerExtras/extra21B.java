package guia5java.EjerExtras;

/**
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
public class extra21B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [6][11];
        
        llenarMatriz (matriz);
        
        
        
    }
    public static void llenarMatriz (int [][] matriz){
           double promedio=0; int aux=0, aux2, contador=0;    
        
           for (int i = 0; i < 6; i++) {
               for (int j = 0; j < 11; j++) {
                matriz [i][j] = (int) (Math.random()*(10-1)+1);
                  // System.out.print(matriz [i][j]);
               }
               //System.out.println("");
            
        }
           System.out.println("");
           for (int j = 0; j < 11; j++) {
               aux2=j;
               for (int i = 0; i < 6; i++) {
                   if (j == aux2 && i == 1) {
                      promedio = matriz [i][j] * 0.1;
                   }else if (j == aux2 && i == 2) {
                       promedio = promedio + (matriz [i][j] * 0.15);
                   }else if (j == aux2 && i == 3) {
                       promedio = promedio + (matriz [i][j] * 0.25);
                   }else if (j == aux2 && i == 4) {
                       promedio = promedio + (matriz [i][j] * 0.5);
                   }else if (j == aux2 && i == 5) {
                      aux2 = (int) promedio;
                      matriz [i][j] = aux2;
                       if (aux2 >= 7 ) {
                           contador= contador+1;
                       }
                   }
                   //System.out.println(promedio);
               }
               aux2=0; promedio=0;
                       
              // System.out.println("");
            
        }
           
           System.out.println("");
           
           
           for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (i==0 && j ==0) {
                    matriz[i][j]=0;
                    System.out.print("|          |");
                 }else if (i >= 1 && i <= 4 && j==0 ) {
                    matriz[i][j]=0;
                    System.out.print("|  NOTA  "+i+" |");
                }else if (i == 5 && j==0) {
                    matriz[i][j]=0;
                    System.out.print("| PROMEDIO |");
                                        
                }else if (i==0 && j >= 1 && j <= 10) {
                    matriz[i][j]=0;
                    System.out.print("| ALUMNO "+j+" |");
                }else if (i >= 1 && i <= 4 && j >= 1 && j <= 10) {
                   // matriz [i][j] = (int) (Math.random()*(10-1)+1);
                    System.out.print("|    "+matriz[i][j]+"     |");
                }else if (i==5 && j>= 1) {
                    System.out.print("|    "+matriz[i][j]+"     |");
                }
           
    }
             System.out.println("");
}
           System.out.println("");
           System.out.println("Aprobaron la cantidad de "+contador+" alumnos");
           System.out.println("Desaprobaron la cantidad de "+(10-contador)+" alumnos");
           System.out.println("");
    }
    
    }