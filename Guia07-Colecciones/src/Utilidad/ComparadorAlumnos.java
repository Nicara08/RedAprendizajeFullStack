/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Entidad.Alumnos;
import java.util.Comparator;

/**
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
apellido de forma ascendente.
• Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
nombre de forma descendente.
 */
public class ComparadorAlumnos {
    public static Comparator <Alumnos> appellidoAscendente = new Comparator <Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }
        
    };
    
    public static Comparator <Alumnos> nombreDescendente = new Comparator <Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
        
    };
    
}
