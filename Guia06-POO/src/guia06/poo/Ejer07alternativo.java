/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia06.poo;
import Entidad.Persona2;
import Servicio.ServicioPersona2;

/**
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
public class Ejer07alternativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona2 sp = new ServicioPersona2 ();
        //Persona p0 = new Persona ();
        double IMC; int contadorBajo=0, contadorMedio=0, contadorAlto=0, contadorMenor=0, contadorMayor=0;
        
        Persona2 vector [] = new Persona2 [4];
       
        Persona2 p1 = sp.CrearPersona2();
        Persona2 p2 = sp.CrearPersona2();
        Persona2 p3 = sp.CrearPersona2();
        Persona2 p4 = sp.CrearPersona2();
        
        vector [0] = p1;
        vector [1] = p2;
        vector [2] = p3;
        vector [3] = p4;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Comienza el calculo de IMC de la persona llamada "+vector[i].getNombre());
           // sp.calcularIMC(vector[i]);
            
            switch (sp.calcularIMC(vector[i])) {
                case -1:
                    contadorBajo = contadorBajo + 1;
                    break;
                case 0:
                    contadorMedio = contadorMedio + 1;
                    break;
                case 1:
                    contadorAlto = contadorAlto + 1;
                    break;
            }
            
            /*if (sp.calcularIMC(vector[i])==-1) {
                contadorBajo = contadorBajo + 1;
            }else if (sp.calcularIMC(vector[i])==1) {
                contadorMedio = contadorMedio + 1;
                
            }else{
                contadorAlto = contadorAlto + 1;
            }*/
            
            if (sp.mayorEdad(vector[i])==false) {
                contadorMenor = contadorMenor + 1;
                
            }else{
                contadorMayor = contadorMayor + 1;
            }
            System.out.println("");
            System.out.println("");
        }
        
        System.out.println("El porcentaje de personas con bajo peso es de "+(contadorBajo*100)/4+" %");
        System.out.println("El porcentaje de personas con peso ideal es de "+ (contadorMedio*100)/4+" %");
        System.out.println("El porcentaje de personas con sobre peso es de "+ (contadorAlto*100)/4+" %");
        System.out.println("");
        System.out.println("El porcentaje de personas menor de edad es de "+(contadorMenor*100)/4+" %");
        System.out.println("El porcentaje de personas mayor de edad es de "+ (contadorMayor*100)/4+" %");
        
    }
    
}
