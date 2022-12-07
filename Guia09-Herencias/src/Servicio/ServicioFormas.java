
package Servicio;

import Entidad.Circulo;
import Entidad.Rectangulo;
import Utilidad.CalculosFormas;
import java.util.Scanner;

/**
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class ServicioFormas implements CalculosFormas {
    Scanner leer = new Scanner (System.in);
    
    public void crearFormas (){
        calculoCirculo();
        calculoRectangulo();
    }
    
    
    @Override
    public void calculoCirculo() {
        System.out.println("");
        System.out.println("Creando circulo");
        System.out.println("Ingrese el radio del circulo");
        double radio = leer.nextDouble();
        double area = (double) (Math.PI * Math.pow(radio, 2));
        double perimetro = (double) (Math.PI*(radio*2));
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("");
        Circulo c1 = new Circulo (radio);
    }

    @Override
    public void calculoRectangulo() {
        System.out.println("");
        System.out.println("Creando rectangulo");
        System.out.println("Ingrese la base del rectangulo");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = leer.nextDouble();
        double area = base * altura;
        double perimetro = (base + altura) * 2;
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("");
        Rectangulo r1 = new Rectangulo (base, altura);
    }
    
}
