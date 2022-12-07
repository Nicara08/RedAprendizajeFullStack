/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Utilidad;

import Entidad.Alquiler;
import Entidad.Barco;

/**
 *
 * @author hans chang 201708
 */
public interface CalculoBarcos {
    public Alquiler generarAlquiler ();
    public Barco crearBarco ();
    public int calculoAlquiler (Alquiler costoAmarre);
    
    
}
