
package Tienda.Persistence;

import Tienda.Entities.Producto;
import java.util.ArrayList;

public class ProductoDao extends DAO_Tienda{
    /**
     * Buscar lista de productos,retorna todos los objetos de tabla
     *
     * @return
     * @throws java.lang.Exception
     */
    public ArrayList<Producto> listarProductos() throws Exception {
        ArrayList<Producto> prodList = new ArrayList();
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));

                prodList.add(prod);
            }
            desconectarBase();
            return prodList;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void cargarProducto (Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception ("Ingrese un producto");
            }
            
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante) VALUES '"+
                    producto.getCodigo()+"','"+
                    producto.getNombre()+"','"+
                    producto.getPrecio()+"','"+
                    producto.getCodigo_fabricante()+"');";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProductoPorCodigo (Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception ("Debe ingresar un producto");                
            }
            
            String sql = "UPDATE producto SET nombre = '"
                    +producto.getNombre()
                    +"', precio ='"
                    +producto.getPrecio()
                    +"', codigo_fabricante = '"
                    +producto.getCodigo_fabricante()
                    +"WHERE codigo = '"
                    +producto.getCodigo()
                    +"';";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProductoPorNombre (Producto producto) throws Exception{
        try {
            if (producto == null) {
                throw new Exception ("Debe ingresar un producto");
            }
            
            String sql = "DELETE FROM producto WHERE nombre = '"
                    +producto.getNombre()
                    +"';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProducto (String sql) throws Exception{
        Producto prod = null;
        try {
            consultarBase(sql);
            while (resultado.next()) {
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4)); 
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
     public ArrayList<Producto> listarProductosCondicion(String sql) throws Exception {
        ArrayList<Producto> prodList = new ArrayList();
        try {
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));

                prodList.add(prod);

            }
            desconectarBase();
            return prodList;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
}
