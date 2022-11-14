/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.

• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidad.Persona3;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioPersona3 {
    Scanner leer = new Scanner (System.in);
    
    public Persona3 crearPersona (){
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date (anio, mes-1, dia);
        return new Persona3 (nombre, fechaNacimiento);
    }
    
    public void calcularEdad (Persona3 p1){
        int edad;
        Date fechaActual = new Date ();
        p1.setEdad(fechaActual.getYear() - p1.getFechaNacimiento().getYear());
        System.out.println("La edad de "+p1.getNombre()+" es de "+p1.getEdad()+" años");
        System.out.println("");
    }
    
    public void menorQue (int edad, Persona3 p1){
        boolean menor = false;
        
        if (p1.getEdad() < edad) {
            menor = true;
            //System.out.println(menor);
        }
        
        System.out.println(menor);
        System.out.println("");
    }
    
    public void mostrarPersona (Persona3 p1){
        System.out.println("El nombre de la persona es "+p1.getNombre()+" y la fecha de nacimiento es "+p1.getFechaNacimiento());
    }
}
