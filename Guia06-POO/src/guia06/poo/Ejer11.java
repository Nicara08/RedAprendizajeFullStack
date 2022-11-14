/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia06.poo;

import java.util.Date;
import java.util.Scanner;

/**
  Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el año en el que ingreso");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes que ingreso");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia en el que ingreso");
        int dia = leer.nextInt();
        
        Date fecha = new Date (anio, mes-1, dia);
        Date fechaActual = new Date ();
        
        int dif = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia de años es de "+ dif);
        System.out.println(fecha);
        
        
    }
    
}
