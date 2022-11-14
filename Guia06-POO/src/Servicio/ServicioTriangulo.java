/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

/**
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
• Calcular área
• Calcular perímetro
• Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
public class ServicioTriangulo {
    Scanner leer = new Scanner (System.in);
    float lado1, lado2, lado3;
    
    public Triangulo crearTriangulos (){
        //System.out.println("El valor del lado 1:");
        lado1 = Math.round(Math.random()*10);
        //System.out.println(lado1);
        //System.out.println("Ingrese el lado 2");
        lado2 = Math.round(Math.random()*10);
        lado3 = lado1;
        return new Triangulo (lado1, lado2, lado3);
    }
    
    //Calcular área triangulo isoceles = b * raiz (a´2 - (b´2/4)) / 2
    
    public float calcularArea (Triangulo t1){
        float area;
        
        area =  (t1.getLado2()*(Math.round(Math.sqrt((Math.pow(t1.getLado2(), 2))-((Math.pow(t1.getLado2(), 2))/4)))))/2;
        System.out.println("El area del triangulo es: "+area+"\n");
        return area;
    }
    
    //Calcular perimetro = 2*a + b
    
    public float calcularPerimetro (Triangulo t1){
        float perimetro;
        
        perimetro = (2*t1.getLado1())+t1.getLado2();
        System.out.println("El perimetro del triangulo es: "+perimetro+"\n");
        return perimetro;
    }
}
