/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia06.poo;

import Entidad.Puntos;
import Servicio.ServicioPuntos;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
public class EjerExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPuntos sp = new ServicioPuntos ();
        Puntos p1 = sp.crearPuntos();
        
        sp.calcular(p1);
        
        
    }
    
}
