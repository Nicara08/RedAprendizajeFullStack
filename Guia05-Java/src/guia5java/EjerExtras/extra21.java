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
public class extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [6][11];
        
        llenarMatriz (matriz);
        
        
        
    }
    public static void llenarMatriz (int [][] matriz){
           double promedio=0; int aux=0, aux2;    
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
                    matriz [i][j] = (int) (Math.random()*(10-1)+1);
                    System.out.print("|    "+matriz[i][j]+"     |");
                }else if (i ==4 && j == 10) {
                    
                    for (int k = 0; k < 11; k++) {
                        k=aux;
                        for (int l = 0; l < 6; l++) {
                            if (k==aux && l == 1) {
                                System.out.println("");
                                promedio = matriz[l][k] * 0.1;
                                System.out.println(promedio);
                            }else if (k==aux && l == 2) {
                                promedio = promedio + (matriz[l][k]*0.15);
                            }else if (k==aux && l == 3) {
                                promedio = promedio + (matriz[l][k]*0.25);
                            } else if (k==aux && l == 4) {
                                promedio = promedio + (matriz[l][k]*0.5);
                            }else if (k==aux && l == 5) {
                                aux2 = (int) promedio;
                                matriz [k][l] = aux2;
                            }
                        
                    }
                     promedio =0; aux2=0;       
                }
            }
                if (i == 5 && j >= 1 ) {
                    System.out.print("|    "+matriz[i][j]+"     |");
                }
            
        }
            System.out.println("");
    }
}
}