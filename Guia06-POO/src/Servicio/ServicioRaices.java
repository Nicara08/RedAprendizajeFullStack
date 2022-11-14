/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
* 
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
* 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
* 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
* 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
* 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
* 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
public class ServicioRaices {
    Scanner leer = new Scanner (System.in);
    
    public Raices crearCoeficientes (){
        System.out.println("Ingrese un valor para el coeficiente A");
        double coea = leer.nextDouble();
        System.out.println("Ingrese un valor para el coeficiente B");
        double coeb = leer.nextDouble();
        System.out.println("Ingrese un valor para el coeficiente C");
        double coec = leer.nextDouble();
        
        return new Raices (coea, coeb, coec);
    }
    
    public double getDiscriminante (Raices r1){
        System.out.println("");
        double resultado;
        resultado = ((Math.pow(r1.getCoeB(),2))-4*r1.getCoeA()*r1.getCoeC());  
        return resultado;
    }
    
//     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices (double discriminante, Raices r1){
        return discriminante >= 0;
//        boolean retorno = false;
//        System.out.println("");
//        if (discriminante >= 0) {
//        retorno = true;
//        return retorno;    
//        }
//        return retorno;
    }
   
//     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    
    public boolean tieneRaiz (double discriminante, Raices r1){
        System.out.println("");
        return discriminante == 0;
//        boolean retorno = false;
//        if (discriminante == 0) {
//            retorno = true;
//            return retorno;
//        }
//        return retorno;
                
    }
    
//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
//soluciones.
    
    public void obtenerRaices (Raices r1){
        
       
            System.out.println("la primer posible solucion es: ");
            //System.out.println((-r1.getCoeB()) + Math.sqrt(Math.pow(r1.getCoeB(), 2) - (4 * r1.getCoeA() * r1.getCoeC())) / (2 * r1.getCoeA()));
            System.out.println((-r1.getCoeB()+Math.sqrt((Math.pow(r1.getCoeB(), 2))-(4*r1.getCoeA()*r1.getCoeC()))/(2*r1.coeA)));
            System.out.println("");
            System.out.println("la segunda posible solucion es: ");
            System.out.println((-r1.getCoeB()-Math.sqrt((Math.pow(r1.getCoeB(), 2))-(4*r1.getCoeA()*r1.getCoeC()))/(2*r1.coeA)));
            System.out.println("");
        
    }
    
//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz (Raices r1){
        
            System.out.println("la unica posible solucion es: "); 
            double resultado = ((-r1.getCoeB()) + Math.sqrt(Math.pow(r1.getCoeB(), 2) - (4 * r1.getCoeA() * r1.getCoeC())) / (2 * r1.getCoeA()));
            System.out.println("((-b) - (4 * a * c)) / (2 * a) = "+resultado);
            System.out.println("");
        
    }
    
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    
    public void calcular (double discriminante, Raices r1){
        if (tieneRaices (discriminante, r1)) {
            System.out.println("");
            obtenerRaices (r1);
        }else if (tieneRaiz (discriminante, r1)) {
            obtenerRaiz (r1);
        }else{
            System.out.println("No tiene solucion");
        }
        
    }
    
}
