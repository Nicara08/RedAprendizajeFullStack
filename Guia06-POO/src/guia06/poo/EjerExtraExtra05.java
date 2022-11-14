/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia06.poo;

import Entidad.Triangulo;
import Servicio.ServicioTriangulo;

/**
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
• Calcular área
• Calcular perímetro
• Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
public class EjerExtraExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioTriangulo st = new ServicioTriangulo ();
        Triangulo [] triangulo = new Triangulo [4];
        float area=0, areaMax=0;
        int aux=0;
        
        for (int i = 0; i < triangulo.length; i++) {
            triangulo [i] = st.crearTriangulos();
            System.out.println("INFORMACION DEL TRIANGULO NUMERO "+(i+1));
            st.calcularPerimetro(triangulo[i]);
            area=st.calcularArea(triangulo [i]);
            if (i==0) {
                areaMax = st.calcularArea(triangulo [i]);             
            }
            if (areaMax < area) {
                areaMax = area;
                aux=i;
            }
            //System.out.println(triangulo[i]);
            //System.out.println("");
        }
        
        System.out.println("Los datos del triangulo con mas area numero "+(aux+1)+" "+triangulo[aux]);
        
        
        
        
        
    }
    
}
