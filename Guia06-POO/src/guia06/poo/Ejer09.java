/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia06.poo;

import Entidad.Matematica2;
import Servicio.ServicioMatematica2;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Ejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMatematica2 sm = new ServicioMatematica2 ();
        Matematica2 m1 = sm.CrearNumeros();
        
        
        sm.devolverMayor(m1);
        sm.calcularPotencia(m1);
        sm.calcularRaiz(m1);
        
        //System.out.println(m1);
    }
    
}
