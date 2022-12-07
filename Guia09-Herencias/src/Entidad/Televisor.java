/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hans chang 201708
 */
public final class Televisor extends Electrodomestico{
    private float pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(float pulgadas, boolean tdt, float precio, String color, char consumo, float peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
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
        return  "Electrodomestico{"+"Televisor{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "pulgadas=" + pulgadas + ", tdt=" + tdt + '}';
    }
    
   
    
}
