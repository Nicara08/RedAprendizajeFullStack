
package Entidad;

import java.util.ArrayList;

/**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Razas {
    public ArrayList <String> perro;
    private ArrayList <String> perro2;
    
    public Razas() {
    }

    public Razas(ArrayList<String> perro) {
        this.perro = perro;
    }

    public ArrayList<String> getPerro2() {
        return perro2;
    }

    public void setPerro2(ArrayList<String> perro2) {
        this.perro2 = perro2;
    }

    public ArrayList<String> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<String> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Razas{" + "perro=" + perro + '}';
    }

    
}
