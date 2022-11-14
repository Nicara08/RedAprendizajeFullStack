package guia07.colecciones;

import Servicio.ServicioAlumno;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        sa.serviAlumno();
        
    }
}