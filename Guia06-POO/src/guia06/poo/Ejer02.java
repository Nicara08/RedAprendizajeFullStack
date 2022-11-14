/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia06.poo;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi * radio2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ readio).
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Circunferencia C1 = new Circunferencia ();
        //C1.setRadio(34);
        System.out.println("Ingrese el radio");
        C1.CrearCircunferencia(leer.nextDouble());
        
        System.out.println("El area de la circunferencia es: ");
        C1.area();
        
        System.out.println("El perimetro de la circunferencia es: ");
        C1.perimetro();
        
        System.out.println("");
        
       // System.out.println(C1);
        
    }
    
}
