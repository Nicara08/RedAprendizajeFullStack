/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia06.poo;

import Entidad.Fecha;
import Servicio.ServicioFecha;

/**
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
• Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
• Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
• Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de cada
mes)
Profe. Adri Bestilleiro
• Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
• Crear un método para verificar si el año ingresado es bisiesto
 */
public class EjerExtraExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f1 = new Fecha ();
        ServicioFecha sf = new ServicioFecha ();
        
        sf.ingresoFecha(f1);
        sf.anioBisiesto(f1);
        sf.fechaAnterior(f1);
        sf.fechaPosterior(f1);
    }
    
}

