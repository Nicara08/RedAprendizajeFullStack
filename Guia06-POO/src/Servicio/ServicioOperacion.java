package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioOperacion {
    Scanner leer = new Scanner (System.in);
    double num1, num2;
   
    public Operacion crearOperacion(){
        System.out.println("Ingrese numero 1");
        num1 = leer.nextDouble(); 
        System.out.println("Ingrese numero 2");
        num2 = leer.nextDouble();
        
        return new Operacion (num1, num2);
    }
    
    public void sumar (Operacion op){
        double suma;
        suma = op.getNumero1() + op.getNumero2();
        System.out.println("La suma de los numeros es "+ suma);        
    }
    
    public void resta (Operacion op){
        double resta;
        resta = op.getNumero1() - op.getNumero2();
        System.out.println("La resta de los numeros es "+ resta);
    }
    
    public void multiplicar (Operacion op){
        double multi;
        if (op.getNumero1() ==0 || op.getNumero2()==0) {
            System.out.println("El resultado es cero porque uno de los numeros fue 0");
        }else{
            multi = op.getNumero1() * op.getNumero2();
            System.out.println("La multiplicacion de los numeros es "+multi);
        }
        
    }
    
    public void dividir (Operacion op){
        double dividir;
        if (op.getNumero1() ==0 || op.getNumero2()==0) {
            System.out.println("El resultado es cero porque uno de los numeros fue 0");
        }else{
            dividir = op.getNumero1() / op.getNumero2();
            System.out.println("La multiplicacion de los numeros es "+dividir);
        }
        
    }
    
}
