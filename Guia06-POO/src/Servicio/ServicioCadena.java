/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Cadena;
import java.util.Scanner;

/**
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class ServicioCadena {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Cadena CrearCadena (){
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.next();
        int longitud = frase.length();
        return new Cadena (frase, longitud);
    }
    
    public void mostrarVocales(Cadena c1){
        String letra;
        int contadorVocal=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = c1.getFrase().substring(i, i+1);
            letra = letra.toLowerCase();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                contadorVocal = contadorVocal + 1;
            }
        }
        System.out.println("La cantidad de vocales que tiene la frase ingresada es de "+contadorVocal);
        System.out.println("");
    }
    
    public void invertirFrase(Cadena c1){
        String letra;
        System.out.print("La frase escrita al reves es ");
        for (int i = (c1.getLongitud()); i > 0; i--) {
            letra = c1.getFrase().substring(i-1, i);
            System.out.print(letra);
            
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena c1){
        int contador=0;
        String caracter;
        System.out.println("");
        System.out.println("Ingrese un caracter para corroborar cuantas veces se repite en la frase");
        String letra = leer.next();
        letra = letra.toLowerCase();
        for (int i = 0; i < c1.longitud; i++) {
            caracter = c1.getFrase().substring(i, i+1);
            if (caracter.equals(letra)) {
                contador = contador + 1;
            }
        }
        System.out.println("en la frase ingresada "+c1.frase+" el caracter "+letra+" se repite "+contador+" veces");
        System.out.println("");
    }
    
     public void compararLongitud (Cadena c1){
        int longitud2;
        System.out.println("");
        System.out.println("Ingrese una nueva frase o palabra");
        String frase2 = leer.next();
        longitud2 = frase2.length();
        if (c1.getLongitud() < longitud2) {
            System.out.println("La longitud de la primera frase es de "+c1.getLongitud()+" siendo menor a la longitud "+longitud2+" de la segunda frase");
        } else if (longitud2 < c1.getLongitud()) {
            System.out.println("La longitud de la primera frase es de "+c1.getLongitud()+" siendo mayor a la longitud "+longitud2+" de la segunda frase");
        } else {
            System.out.println("Las longitudes de las dos frases son iguales siendo "+c1.getLongitud()+" de largo");
        }
        
    }
     
     public void unirFrases (Cadena c1){
         System.out.println("");
        System.out.println("Ingrese una nueva frase o palabra");
        String frase2 = leer.next();
        System.out.println("");
        System.out.println("Las dos frases ingresadas unidas resultaria de la siguiente manera");
        System.out.println(c1.getFrase()+" "+frase2);
    }
     
     public void reemplazar (Cadena c1){
        String letra;
        System.out.println("");
        System.out.println("Ingrese un caracter que quiera reemplazar en todas las letras A de la frase ingresada");
        String letra2 = leer.next();
        letra2 = letra2.toLowerCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = c1.getFrase().substring(i, i+1);
            if (letra.equals("a")) {
                System.out.print(letra2);
                
            }else {
                System.out.print(letra);
            }
        }
        System.out.println("");
    }
     
     public void contiene (Cadena c1){
        boolean resp;
        String letra;
        System.out.println("");
        System.out.println("Ingrese una letra para corroborar si se encuentra dentro de la frase ingresada");
        String letra2 = leer.next();
        int contador=0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = c1.getFrase().substring(i, i+1);
            if (letra.equals(letra2)) {
                contador = contador + 1;  
            }
        }
        if (contador > 0) {
            resp=true;
            System.out.println("La letra "+letra2+" se encuentra dentro de la frase? "+resp);
        }else{
            resp=false;
            System.out.println("La letra "+letra2+" se encuentra dentro de la frase? "+resp);
        }
         System.out.println("");
    }
}
