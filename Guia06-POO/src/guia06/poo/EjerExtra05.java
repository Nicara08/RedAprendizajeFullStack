/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia06.poo;

import Entidad.Array;
import Servicio.ServicioArray;

/**
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class EjerExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioArray sa = new ServicioArray ();
        Array a1 = new Array(); 
        sa.adivinaMes(a1);
       // Array a1 = new Array ("enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre");
    }
    
}
