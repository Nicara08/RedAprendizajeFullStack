
package Tienda.Services;

import Tienda.Entities.Producto;
import java.util.ArrayList;
import java.util.Scanner;


public class TiendaService {
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private FabricanteService fabServ = new FabricanteService ();
    private ProductoService prodServ = new ProductoService ();
    
    
    public void menu (){
        int opc=0;
        
        do {
            System.out.println("Seleccione la operacion deseada");
            System.out.println("1 - Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2 - Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3 - Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4 - Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5 - Listar el nombre y el precio del producto más barato.");
            System.out.println("6 - Ingresar un producto a la base de datos.");
            System.out.println("7 - Ingresar un fabricante a la base de datos.");
            System.out.println("8 - Editar un producto con datos a elección (no podra cambiar el codigo de producto).");
            System.out.println("9 - Salir");
            
            try {
                opc = leer.nextInt();
                String sql;
                switch (opc) {
                    case 1: prodServ.listarTodosLosProductosNombre();
                        break;
                    case 2: prodServ.listarTodosLosProductosNombrePrecio();
                        break;
                    case 3: 
                        sql = "select * from producto where precio between 120 and 202;";
                        prodServ.productosCondicion(sql);
                        break;
                    case 4: 
                        sql = "select * from producto where nombre like 'porta%\';";
                        prodServ.productosCondicion(sql);
                        break;
                    case 5: 
                        sql = "select * from producto order by precio limit 1;";
                        prodServ.productosCondicion(sql);
                        break;
                    case 6: 
                        sql = "select * from producto;";
                        System.out.println("Los productos actuales son");
                        prodServ.productosCondicion(sql);
                        prodServ.crearProducto();
                        break;
                    case 7: 
                        System.out.println("Los fabricantes son: ");
                        fabServ.listaFabricantes();
                        fabServ.ingresarFabricanteEnBD();
                        fabServ.listaFabricantes();
                        break;
                    case 8: 
                        editarProducto();
                        break;
                }
            } catch (Exception e) {
            }
        } while (opc != 9);
    }
    
    public void editarProducto() throws Exception{
        String sql = "select * from producto;";
        ArrayList<Producto> listaProductos = prodServ.productosCondicion(sql);
        System.out.println("Seleccione el codigo de producto a modificar");
        Producto modProducto = listaProductos.get(leer.nextInt());
        prodServ.modificarProducto(modProducto);
        prodServ.productosCondicion(sql);
    }
}
