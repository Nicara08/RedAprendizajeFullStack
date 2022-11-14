
package Entidad;

import java.util.Date;
import java.util.Objects;

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
public class Alumnos {
    public  String nombre;
    public String apellido;
    public String nacionalidad;
    public Date nacimiento;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.nacionalidad);
        hash = 67 * hash + Objects.hashCode(this.nacimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.nacimiento, other.nacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
}
