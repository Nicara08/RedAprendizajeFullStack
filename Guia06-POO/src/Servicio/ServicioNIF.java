/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:

 */
public class ServicioNIF {
    //verificar el resto 78 / 17 = 4,5882.... agarramos el entero 4*17=68 luego 78-68 = 10 (resto)
Scanner leer = new Scanner (System.in);


    public NIF crearNif (){
        System.out.println("Ingrese su DNI");
        long DNI = leer.nextLong();
        String letra = compararLetra (DNI);
        return new NIF (DNI, letra);
    }
    
    public String compararLetra (long DNI){
        String [] v = new String [23];
        
        v[0]="T"; v[1]="R"; v[2]="W"; v[3]="A"; v[4]="G"; v[5]="M"; v[6]="Y"; v[7]="F"; v[8]="P";
        v[9]="D"; v[10]="X"; v[11]="B"; v[12]="N"; v[13]="J"; v[14]="Z"; v[15]="S"; v[16]="Q";
        v[17]="V"; v[18]="H"; v[19]="L"; v[20]="C"; v[21]="K"; v[22]="E";
        
        double resultado = DNI % 23;
        int res = (int) resultado;
        String letra="";
      
        for (int i = 0; i < 23; i++) {
            
            if (res == i) {
                letra = v[i];
            }
               
        }
        //calculo del resto de la division del dni / 23
        return letra;
    }
    
    public void mostrar (long DNI, String letra){
    int longitud=0, resultado, dni;
    dni = (int) DNI;
        do {
            resultado = dni / 10;
            dni=resultado;
            longitud+=1;
        } while (dni != 0);
        
        if (longitud==6) {
            System.out.println("00"+DNI+"-"+letra);
        }else if (longitud==7) {
            System.out.println("0"+DNI+"-"+letra);
        }else{
            System.out.println(DNI+"-"+letra);
        }
    
            
}
    
    
}
