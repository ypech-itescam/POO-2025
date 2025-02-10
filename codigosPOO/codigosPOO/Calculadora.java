

public class Calculadora {
    private boolean estado;
    private String marca;

    public Calculadora(boolean estado, String marca){
        this.estado = estado;
        this.marca = marca;
    }

    public void Estado(){
        if (estado) {
            System.out.println("ON");
        }
        else{
            System.out.println("OFF");
        }
    }
    public String getMarca(){
        return marca;
    }

    public int suma(int v1, int v2){
        return v1 + v2;
    }
    public double suma(double v1, double v2){
        return v1 + v2;
    }
    public int suma(int v1, int v2, int v3){
        return v1 + v2 + v3;
    }
    public double resta(double v1, double v2){
        return v1 - v2;
    }
    public int resta(int v1, int v2){
        return v1 - v2;
    }
    public int multiplicar(int v1, int v2){
        return v1 * v2;
    }
    public int divide(int v1, int v2){
        return v1/v2;
    }

    public static void main(String[] args){
        Calculadora cal = new Calculadora(true,"Casio");
        System.out.println("Bienvenido a la calculadora "+cal.getMarca());
        System.out.println(cal.suma(2, 1));
        System.out.println(cal.resta(3, 2));
        System.out.println(cal.divide(2, 2));
        System.out.println(cal.multiplicar(2, 2));
        System.out.println(cal.resta(2.0, 1.0));
        System.out.println(cal.suma(1.0, 1.0));
        System.out.println(cal.suma(2, 3, 4));
    }
}
