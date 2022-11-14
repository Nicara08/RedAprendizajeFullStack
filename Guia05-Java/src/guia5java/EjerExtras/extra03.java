
package guia5java.EjerExtras;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String retorno="";
        System.out.println("Ingrese una letra");
       String letra = leer.nextLine();
       letra = letra.toLowerCase();
       int largo = letra.length();
        
       if (largo > 1) {
           retorno = evaluarLetra (largo);
            //System.out.println(retorno);
            if (retorno.equals("a") || retorno.equals("e") || retorno.equals("i") || retorno.equals("o") || retorno.equals("u")) {
                System.out.println("La letra ingresada es una VOCAL");
           }else{
                System.out.println("La letra ingresada NO es una vocal");
            }
            
       } 
        if (largo==1) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una VOCAL");
           }else{
                System.out.println("La letra ingresada NO es una vocal");
            }
            
        }
       
      // evaluarVocal (letra, retorno); 
       
       /*if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una VOCAL");    
        } else {
            do {
               evaluarVocal();
            } while (true);
            
        }*/
      
       
        /*if ((letra.equals("a"))
              ||  letra.equals("e")
                || letra.equals("i")
                || letra.equals("o")
                || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
            
        }else {
            System.out.println("La letra ingresada NO es una vocal");
        }*/
        
 
       
      
        

    }
    public static String evaluarLetra (int largo){
        Scanner leer = new Scanner (System.in);
          String letra="";    
        
         while (largo > 1) {  
            System.out.println("Ingreso incorrecto, vuelva a intentar con un caracter");
            letra = leer.next();
            
            largo = letra.length();
                    
        
        }
         return letra;
    }
    public static void evaluarVocal(String letra, String retorno) {
        
       if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una VOCAL");    
        } else {
            do {
               
            } while (true);
        
}
}
}