
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class ServicioAlumno {
    Scanner leer = new Scanner (System.in);
    
    //una lista de tipo de la clase alumno
    public void serviAlumno (){
        ArrayList <Alumno> curso = new ArrayList ();
        this.llenarCurso(curso);
       //dos maneras de mostrar los alumnos
        for (Alumno aux : curso) {
            System.out.println(aux.toString());
  //        this.mostrarAlumno(aux);
        }
        this.notaFinal(curso);
        
        
    }
            
    public Alumno crearAlumno (){
        ArrayList <Integer> notas = new ArrayList ();
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota numero "+(i+1)+": ");
            notas.add(leer.nextInt());
        }
        
        return new Alumno (nombre, notas);
    }
    
    public ArrayList <Alumno> llenarCurso (ArrayList l1){
        System.out.print("Desea ingresar un nuevo alumno S o N: ");
        String opc = leer.next();
        while (opc.equalsIgnoreCase("s")) {
            l1.add(this.crearAlumno());
            System.out.print("Desea ingresar otro alumno? S o N: ");
            opc = leer.next();
        }
        return l1;
    }
    
    public void notaFinal (ArrayList <Alumno> curso){
        System.out.println("Ingrese el nombre del alumno que desee conocer la nota final");
        String nombre = leer.next();
        for (Alumno aux : curso) {
            if (nombre.equalsIgnoreCase(aux.getNombre())) {
                ArrayList <Integer> not = new ArrayList (aux.getNotas());
                double promedio=0;
                for (Integer aux1 : not) {
                    promedio += aux1;
                }
                System.out.println("la nota final es igual a "+(promedio/3));
            }
        }
    }
    
    public void mostrarAlumno (Alumno a1){
        System.out.println("Alumno: "+a1.getNombre());
        for (int i = 0; i < a1.getNotas().size(); i++) {
            System.out.println("La nota numero "+(i+1)+" es: "+a1.getNotas().get(i));
        }
    }
}
