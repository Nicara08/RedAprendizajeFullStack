
package Entidad;

import java.util.HashSet;

/**
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 */
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private Integer votos=0;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", votos=" + votos + '}';
    }
    
    
}
