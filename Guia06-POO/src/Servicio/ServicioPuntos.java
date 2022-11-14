/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
public class ServicioPuntos {
    
    public Puntos crearPuntos (){
        Scanner leer = new Scanner (System.in);
        int x1, x2, y1, y2;
        
        System.out.println("Ingrese la ubicacion de x1");
        x1 = leer.nextInt();
        System.out.println("Ingrese la ubicacion de y1");
        y1 = leer.nextInt();
        System.out.println("Ingrese la ubicacion de x2");
        x2 = leer.nextInt();
        System.out.println("Ingrese la ubicacion de y2");
        y2 = leer.nextInt();
        
        return new Puntos (x1, y1, x2, y2);
        }   
    
    public void calcular (Puntos p1){
       double resultado;
       resultado = Math.sqrt(Math.pow((p1.getX2()-p1.getX1()), 2)+Math.pow((p1.getY2()-p1.getY1()), 2));
        System.out.println("La distancia entre puntos es de "+resultado);
    }
}
