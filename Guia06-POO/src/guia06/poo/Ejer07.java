
package guia06.poo;
import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

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
public class Ejer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorEdad=0, contadorIMCbajo=0, contadorIMCmedio=0;
        Scanner leer = new Scanner (System.in);
        ServicioPersona sp = new ServicioPersona ();
        //Persona p1 = sp.crearPersona();
        //Persona p2 = sp.crearPersona();
        
        Persona p1 = new Persona ("Fede", 35, "H", 91, 1.67);
        Persona p2 = new Persona ("Estefi", 34, "M", 1.65, 60);
        Persona p3 = new Persona ("Brunela", 1, "M", 10, 0.6);
        Persona p4 = new Persona ("Daniel", 65, "H", 1.73, 90);
       
       String vecPersona [] = new String [4];
       
       
        if (sp.calcularIMC(p1) < 0) {
            System.out.println("Usted se encuentra por debajo de su peso ideal"); 
            contadorIMCbajo = contadorIMCbajo + 1;
        }else if (sp.calcularIMC(p1)==0) {
            System.out.println("Usted se encuentra en su pedo ideal");
            contadorIMCmedio = contadorIMCmedio + 1;
        }else{
            System.out.println("Usted se encuentra con sobre peso");
        }
        System.out.println("Es mayor de edad?"+sp.esMayorDeEdad(p1));
        if (sp.esMayorDeEdad(p1)==true) {
            contadorEdad=contadorEdad+1;
        }
        
        if (sp.calcularIMC(p2) < 0) {
            System.out.println("Usted se encuentra por debajo de su peso ideal"); 
            contadorIMCbajo = contadorIMCbajo + 1;
        }else if (sp.calcularIMC(p2)==0) {
            System.out.println("Usted se encuentra en su pedo ideal");
            contadorIMCmedio = contadorIMCmedio + 1;
        }else{
            System.out.println("Usted se encuentra con sobre peso");
        }
        System.out.println("Es mayor de edad?"+sp.esMayorDeEdad(p2));
        if (sp.esMayorDeEdad(p2)==true) {
            contadorEdad=contadorEdad+1;
        }
        
        if (sp.calcularIMC(p3) < 0) {
            System.out.println("Usted se encuentra por debajo de su peso ideal"); 
            contadorIMCbajo = contadorIMCbajo + 1;
        }else if (sp.calcularIMC(p3)==0) {
            System.out.println("Usted se encuentra en su pedo ideal");
            contadorIMCmedio = contadorIMCmedio + 1;
        }else{
            System.out.println("Usted se encuentra con sobre peso");
        }
        System.out.println("Es mayor de edad?"+sp.esMayorDeEdad(p3));
        if (sp.esMayorDeEdad(p3)==true) {
            contadorEdad=contadorEdad+1;
        }
        
        if (sp.calcularIMC(p4) < 0) {
            System.out.println("Usted se encuentra por debajo de su peso ideal"); 
            contadorIMCbajo = contadorIMCbajo + 1;
        }else if (sp.calcularIMC(p4)==0) {
            System.out.println("Usted se encuentra en su pedo ideal");
            contadorIMCmedio = contadorIMCmedio + 1;
        }else{
            System.out.println("Usted se encuentra con sobre peso");
        }
        System.out.println("Es mayor de edad?"+sp.esMayorDeEdad(p4));
        if (sp.esMayorDeEdad(p4)==true) {
            contadorEdad=contadorEdad+1;
        }
        
        System.out.println("");
        System.out.println("El porcentaje que estan por debajo de su peso es de "+(contadorIMCbajo*100/4));
        System.out.println("El porcentaje que estan en su peso optimo es de "+(contadorIMCmedio*100/4));
        System.out.println("El porcentaje que estan con sobre peso es de "+((4-contadorIMCbajo-contadorIMCmedio)*100/4));
        System.out.println("El porcentaje de personas mayores de edad es de "+(contadorEdad*100/4));
        System.out.println("El porcentaje de personas menores de edad es de "+((4-contadorEdad)*100/4));
    }
    
}
