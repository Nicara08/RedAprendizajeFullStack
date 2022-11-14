
package guia5java.EjerAprendizaje;

import java.util.Scanner;


public class ejercicio11 {

 
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese dos numeros enteros positivos");            
            num1 = leer.nextInt(); num2 = leer.nextInt();
            
        while (num1 < 0 ) {            
             //System.out.println("el primer numero ingresado "+num1+" es incorrecto");
                System.out.println("primer numero incorrecto, 2"
                        + "vuelva a ingresar un nuermo entero positivo"); 
                num1 = leer.nextInt();
        }
        while (num2 < 0 ) {            
             //System.out.println("el primer numero ingresado "+num1+" es incorrecto");
                System.out.println("segundo numero incorrecto, vuelva a ingresar un nuermo entero positivo"); 
                num2 = leer.nextInt();
        }
        int opcion; String opcion2;
        
        do {            
           mostrarMenu(); 
                   
            opcion = leer.nextInt();

            while (opcion < 1 || opcion > 5 ) {            
                System.out.println("Opcion ingresada incorrecta, vuelva a intentar");
                opcion = leer.nextInt();
            }
            if (opcion < 5 ) {
                ejecutarMenu(num1, num2, opcion);
            }
            
            if (opcion == 5){
                System.out.println("Realmente quiere salir? S / N");
                opcion2 = leer.next();
                opcion2 = opcion2.toLowerCase();
                if ("s".equals(opcion2)) {
                    System.out.println("Muchas gracias por utilizar el sistema");
                } else if ("n".equals(opcion2)) {
                    opcion = 1;
                    }
                else {
                    System.out.println("valor incorrecto");
                    opcion=1;
                }


                
            }
        } while (opcion != 5);
        
    }
     public static void mostrarMenu (){
        System.out.println("------------------");
        System.out.println("|     MENU       |");
        System.out.println("| 1. Sumar       |");
        System.out.println("| 2. Restar      |");
        System.out.println("| 3. Multiplicar |");
        System.out.println("| 4. Dividir     |");
        System.out.println("| 5. Salir       |");
        System.out.println("| Elija opcion:  |");
        System.out.println("------------------");

}
    public static void ejecutarMenu(int num1, int num2, int opcion){
        
        switch (opcion){
            case 1:
                System.out.println("la suma de "+num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println("la resta de "+num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println("la multiplicacion de "+num1+" * "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println("la division de "+num1+" / "+num2+" = "+(num1/num2));
                break;
                            
        }   
                
    }
            
}
