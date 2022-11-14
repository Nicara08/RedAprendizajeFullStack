
package Entidad;

/**
 *
 * @author -hans chang 201708
 */
public class Asientos {
    private int posicion;
    private String letra;
    private String ocupado;
    
    public Asientos() {
    }

    
    public Asientos(int posicion, String letra, String ocupado) {
        this.posicion = posicion;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asientos{" + "posicion=" + posicion + ", letra=" + letra + ", ocupado=" + ocupado + '}';
    }
    
    
}
    
    

