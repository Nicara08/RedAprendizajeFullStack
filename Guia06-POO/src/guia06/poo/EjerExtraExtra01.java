/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia06.poo;

import Entidad.Fraccion;
import Servicio.ServicioFraccion;

/**
 Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
public class EjerExtraExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFraccion sf = new ServicioFraccion ();
        Fraccion f1 = sf.completarAtributos();
        sf.operacion(f1);
    }
    
}
