
package Tienda.Services;

import Tienda.Entities.Producto;
import Tienda.Persistence.ProductoDao;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {
    private ProductoDao proDAO = new ProductoDao ();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    protected Producto crearProducto () throws Exception{
        Producto produ = new Producto();
        System.out.println("Ingrese el codigo del producto");
        int codigo = leer.nextInt();
        produ.setCodigo(codigo);
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        produ.setNombre(nombre);
        
        System.out.println("Ingrese el precio del producto");
        double precio = leer.nextDouble();
        produ.setPrecio(precio);
        
        System.out.println("Ingrese el codigo del fabricante");
        int codFab = leer.nextInt();
        produ.setCodigo_fabricante(codFab);
        
        proDAO.cargarProducto(produ);
        return produ;
    }
    
    protected void modificarProducto (Producto producto) throws Exception{
        try {
            System.out.println("Se modificara el producto nombre "+producto.getNombre());
            System.out.println("Ingrese el nuevo nombre del producto");
            String nombre = leer.next();
            producto.setNombre(nombre);
            
            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            producto.setPrecio(precio);
            
            System.out.println("Ingrese el codigo del fabricante");
            producto.setCodigo_fabricante(leer.nextInt());
            proDAO.modificarProductoPorCodigo(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void listarTodosLosProductosNombre () throws Exception{
        ArrayList<Producto> listaProdu = new ArrayList ();
        listaProdu = proDAO.listarProductos();
        System.out.println("Los productos encontrados fueron");
        
        for (Producto producto : listaProdu) {
            System.out.println(producto.getNombre());
        }
        System.out.println("");
    }
    
    protected void listarTodosLosProductosNombrePrecio () throws Exception{
        ArrayList<Producto> listaProdu = new ArrayList ();
        listaProdu = proDAO.listarProductos();
        
        for (Producto producto : listaProdu) {
            System.out.println(producto);
        }
        System.out.println("");
    }
    
    protected ArrayList<Producto> productosCondicion (String sql) throws Exception{
        ArrayList<Producto> listaProdu = proDAO.listarProductosCondicion(sql);
        
        for (Producto producto : listaProdu) {
            System.out.println(producto);
        }
        System.out.println("");
        return listaProdu;
    }
}
