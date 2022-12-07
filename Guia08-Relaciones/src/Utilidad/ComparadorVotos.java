/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidad;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author hans chang 201708
 */
public class ComparadorVotos {
    
    public static Comparator <Alumno> ordenarVotos = new Comparator <Alumno> (){
        
        public int compare(Alumno t, Alumno t1) {
            return t1.getVotos().compareTo(t.getVotos());
        }
        
    };
    
    
}
