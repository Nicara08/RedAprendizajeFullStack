
package Entidad;


public class Ficha {
    public int num1;
    public String doble=":";
    public int num2;
    public String barra="|";

    public Ficha() {
    }

    public Ficha(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getDoble() {
        return doble;
    }

    public void setDoble(String doble) {
        this.doble = doble;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    @Override
    public String toString() {
        return "Ficha{" + "num1=" + num1 + ", doble=" + doble + ", num2=" + num2 + ", barra=" + barra + '}';
    }
    
    
}
