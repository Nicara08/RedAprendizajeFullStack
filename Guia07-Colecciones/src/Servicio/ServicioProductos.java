package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class ServicioProductos {
    Scanner leer = new Scanner (System.in);
    HashMap <String, Float> hmProduc = new HashMap <>();
    
    public void menuProductos (){
        System.out.println("");
        int opc;
        do {
            System.out.println("");
            System.out.println(" BIENVENIDO AL SISTEMA ");
            System.out.println("-----------------------");
            System.out.println("1. Introducir producto ");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            while (opc < 1 || opc > 5) {
                System.out.println("");
                System.out.println("Opcion incorrecta, vuelva a intentar"+"\n");
                opc = leer.nextInt();
            }
            opciones (opc);
            System.out.println("");
        } while (opc != 5);
        
        System.out.println("");
        System.out.println("Muchas gracias");
    }
    
    public void opciones (int opc){
        switch (opc) {
            case 1:
                introducirProducto();
                break;
            case 2:
                modificarProducto();
                break;
            case 3:
                eliminarProducto();
                break;
            case 4:
                mostrarProducto();
                break;
        }
    }
    
    public void introducirProducto(){
        String producto;
        float precio;
        
        System.out.println("");
        System.out.println("Ingrese el nombre del producto");
        producto = leer.next();
        while (hmProduc.containsKey(producto)) {
            System.out.println("El producto ya existe");
            System.out.println("Ingrese nuevamente un producto");
            producto = leer.next();
        }
        System.out.println("Ingrese el precio del producto");
        precio = leer.nextFloat();
        System.out.println("");
        hmProduc.put(producto, precio);
        
    }
    
    public void modificarProducto(){
        System.out.println("Ingrese el nombre del producto a modificar el precio");
        String nombre = leer.next();
        float precio;
        
        for (Map.Entry<String, Float> aux : hmProduc.entrySet()) {
            if (aux.getKey().equals(nombre)) {
                System.out.println("");
                System.out.println("Ingrese el precio actualizado");
                precio = leer.nextFloat();
                aux.setValue(precio);
                System.out.println("");
            }
            
        }
       // Iterator <String> it = hmProuc.
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = leer.next();
       
        
        for (Map.Entry<String, Float> aux : hmProduc.entrySet()) {
            if (aux.getKey().equals(nombre)) {
                hmProduc.remove(nombre);
                System.out.println("El producto ha sido eliminado");
                System.out.println("");
            }
            
        }
    }
    
    public void mostrarProducto(){
        System.out.println("");
        for (Map.Entry<String, Float> aux : hmProduc.entrySet()) {
            System.out.println("Nombre: "+aux.getKey()+" precio: $"+aux.getValue());
            
        }
    }
    
}
