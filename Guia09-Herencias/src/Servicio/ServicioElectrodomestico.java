/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Utilidad.InterfaseElectrodomestico;
import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hans chang 201708
 */
public class ServicioElectrodomestico implements InterfaseElectrodomestico {
    Scanner leer = new Scanner (System.in);
    Lavadora lavadora = new Lavadora ();
    ArrayList <Electrodomestico> listaElectrodomesticos = new ArrayList ();
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
    */
    
    
    
    public Electrodomestico crearElectrodomestico (){
        Electrodomestico e1 = new Electrodomestico ();
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next().toLowerCase();
        e1.setColor(comprobarColor(color)); 
        System.out.println("Indique la eficiencia del electrodomestico");
        char consumo = leer.next().toUpperCase().charAt(0);
        consumo = comprobarConsumoElectrico(consumo);
        e1.setConsumo(consumo);
        System.out.println("Indique el peso del electrodomestico");
        e1.setPeso(leer.nextFloat());
        e1.setPrecio(1000);
        e1.setPrecio(precioFinal(e1.getConsumo(), e1.getPeso()));
        return e1;
    }
    
    //     Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    public String comprobarColor (String color){
        
        
        switch (color) {
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                color = "blanco";
                break;
        }
        return color;
    }
    
    //     Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    
    
    public char comprobarConsumoElectrico (char letra){
        
        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;    
            case 'E':
                break;
            default:
                letra = 'F';
                break;
        }
        return letra;
        
        
    }
    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
    
    public float precioFinal (char letra, float peso){
        float aux =1000;
        
        switch (letra) {
            case 'A':
                aux+=1000;
                break;
            case 'B':
                aux+=800;
                break;
            case 'C':
                aux+=600;
                break;
            case 'D':
                aux+=500;
                break;    
            case 'E':
                aux+=300;
                break;
            default:
                letra = 'F';
                aux+=100;
                break;
        }
        
        if (peso<=19 && peso>=1) {
            aux+=100;
        }else if (peso<=49 && peso>=20) {
            aux+=500;
        }else if (peso<=79 && peso>=50) {
            aux+=800;
        }else{
            aux+=1000;
        }
        return aux;
    }
    
  /*  Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    
    public Lavadora crearLavadora (){
        System.out.println("CREANDO LAVADORA");
        Electrodomestico e1;
        
        //Lavadora lava1 = new Lavadora ();
        
        
        e1 = crearElectrodomestico();
        
        
        //lavadora1 = crearElectrodomestico();
        
//        char eficiencia=lava.getConsumo();
//        String color = lava.getColor();
//        float peso = lava.getPeso();
//        float precio = lava.getPrecio();
        
        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt();
        //lavadora.setCarga(carga);
        
        Lavadora lavadora1 = new Lavadora (carga, e1.getPrecio(), e1.getColor(), e1.getConsumo(), e1.getPeso());
        precioFinalLavadora(lavadora1);
        return lavadora1;   
    }

    
    
    /*public void crearTele() {
        Televisor t1 = new Televisor ();
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        float pulgadas = leer.nextFloat();
        t1.setPulgadas(pulgadas);
        System.out.println("La tele posee TDT? true or false");
        boolean tdt = leer.hasNext();
        t1.setTdt(tdt);
        
    }*/
    @Override
    
    public Televisor crearTele (){
        System.out.println("CREANDO TELEVISOR");
        Electrodomestico e1;
        
        e1 = crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        float pulgadas = leer.nextFloat();
        
        System.out.println("La tele posee TDT? true or false");
        boolean tdt = leer.hasNext();
        
        Televisor t1 = new Televisor (pulgadas, tdt,  e1.getPrecio(), e1.getColor(), e1.getConsumo(), e1.getPeso());
        precioFinalTele(t1);
        return t1;
    }
    
    public void precioFinalLavadora (Lavadora lavadora1){
        System.out.println("Precio inicial lavadora "+lavadora1.getPrecio());
        if (lavadora1.getCarga()>=30) {
            lavadora1.setPrecio(lavadora1.getPrecio()+500);
        }
    }
    
    public void precioFinalTele (Televisor t1){
        System.out.println("Precio inicial tele "+t1.getPrecio());
        if (t1.getPulgadas()>=40) {
            t1.setPrecio(t1.getPrecio()*1.3f);
    }
        if (t1.isTdt()) {
            t1.setPrecio(t1.getPrecio()+500f);
        }
}
    
    public void listasElectro (Televisor t1, Televisor t2, Lavadora l1, Lavadora l2){
        float monto=0;
        System.out.println("");
        listaElectrodomesticos.add(t1);
        listaElectrodomesticos.add(t2);
        listaElectrodomesticos.add(l1);
        listaElectrodomesticos.add(l2);
        
        for (Object aux : listaElectrodomesticos) {
            System.out.println(aux);
        }
        
        System.out.println("");
        System.out.println("PRECIOS DE LOS ELECTRODOMESTICOS");
        
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            monto = listaElectrodomesticos.get(i).getPrecio()+monto;
        }
        System.out.println("El precio total de los electrodomesticos es "+monto);
        
    }
}
