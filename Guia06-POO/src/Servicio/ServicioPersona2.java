package Servicio;

import Entidad.Persona2;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioPersona2 {
    Scanner leer = new Scanner (System.in);
    int edad; String nombre, sexo; double peso, altura;
    
    public Persona2 CrearPersona2 (){
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        
        while (edad < 0) {
            System.out.println("Edad ingresada incorrecto");
            System.out.println("Ingrese nuevamente su edad");
            edad = leer.nextInt();
        }
        
        do {
        System.out.println("Ingrese su sexo, H, M u O");
        sexo = leer.next();
        sexo = sexo.toUpperCase();
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")); 
        
        System.out.println("Ingrese su peso");
        peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        altura = leer.nextDouble ();
        System.out.println("");
        System.out.println("");
        return new Persona2 (nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC (Persona2 p0){
        double IMC;
        IMC = p0.getPeso() / (p0.getAltura() * p0.getAltura());
        if (IMC < 20 ) {
            System.out.println("Usted se encuentra por debajo del peso ideal");
            return -1;
        }else if (20 <= IMC && IMC <= 25) {
            System.out.println("Usted se encuentra en su peso ideal");
            return 0;
        }else{
            System.out.println("Usted se encuentra con sobre peso");
            return 1;
        }
        
        
    }
    
    public boolean mayorEdad (Persona2 p0){
        if (p0.getEdad()<18) {
            System.out.println("Usted es menor de edad");
            return false;
        }else{
            System.out.println("Usted es mayor de edad");
            return true;
        }
    }
}
