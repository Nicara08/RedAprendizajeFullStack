
package guia07.colecciones;

import Entidad.Alumnos;
import Servicio.ServicioAlumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
Necesidades:
• Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
objetos de este tipo.
• Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
para no hacer carga manual de los datos)
• Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
apellido de forma ascendente.
• Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
nombre de forma descendente.
• Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
utilizando el atributo fecha de nacimiento.
• Crear listas paralelas de Alumnos, según la nacionalidad.
• Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA.
 */
public class EjerExtraExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ServicioAlumnos sa = new ServicioAlumnos ();
        ArrayList <Alumnos> lista = new ArrayList ();
        Alumnos a1 = sa.altaAlumno();
        lista.add(a1);
        
        sa.crearLista(lista);
        System.out.println("");
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("Desea dar de alta a un alumno? s o n");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("s")) {
            lista.add(sa.altaAlumno());
        }
        System.out.println("");
        System.out.println("Desea dar de baja a un alumno? s o n");
        opc = leer.next();
        if (opc.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre y el apellido");
            String nombre = leer.next();
            String apellido = leer.next();
            lista = sa.bajaAlumno(nombre, apellido, lista);
            
        }
        
        System.out.println("");
        System.out.println(lista);
        System.out.println("");
        
        lista = sa.modificarAlumno(lista);
        
        System.out.println("");
        System.out.println(lista);
        System.out.println("");
        
        sa.ordenApellido(lista);
        System.out.println("");
        sa.ordenNombre(lista);
        System.out.println("");
        sa.edadAlumno(lista);
        System.out.println("");
        sa.reporte(lista);
    }
    
}
