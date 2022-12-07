
package Entidad;

/**
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de
 */
public final class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        
    }
    
    

    public Lavadora(int carga, float precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    @Override
    public String toString() {
        return "Electrodomestico{"+"Lavadora{"  + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", "+ "carga=" + carga + '}';
    }

    
   
    
    
}
