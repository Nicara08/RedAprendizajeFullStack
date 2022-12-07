
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author hans chang 201708
 */
public class Voto {
  private Alumno a1;
  private ArrayList <Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno a1, ArrayList<Alumno> alumnosVotados) {
        this.a1 = a1;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getA1() {
        return a1;
    }

    public void setA1(Alumno a1) {
        this.a1 = a1;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "a1=" + a1 + ", alumnosVotados=" + alumnosVotados + '}'+"\n";
    }
  
  
}
