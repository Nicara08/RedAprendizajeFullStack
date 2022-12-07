
package Entidad;

/**
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
public class BarcosMotor extends Barco {
    protected int CV;

    public BarcosMotor() {
    }    
    
    public BarcosMotor(int CV) {
        this.CV = CV;
    }

    public BarcosMotor(int CV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "BarcosMotor{" + "CV=" + CV + '}';
    }
    
    
    
    
}
