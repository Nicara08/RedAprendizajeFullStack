/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);
    int base, altura;

    public Rectangulo CrearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    public void Superficie(Rectangulo r1) {
        int superficie;
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectangulo es " + superficie);
    }
    
    public void Perimetro(Rectangulo r1) {
        int perimetro;
        perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es "+perimetro);
        
    }
    
     public void Dibujo(Rectangulo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || i == r1.getAltura() - 1 || j < 1 || j == r1.getBase()-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }
    }
}

    
