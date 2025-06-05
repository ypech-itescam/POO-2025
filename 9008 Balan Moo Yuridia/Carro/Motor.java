package Carro;

public class Motor {
    private String tipo;
    private int cilindrada; // en cc (centímetros cúbicos)

    public Motor(String tipo, int cilindrada) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return tipo + " " + cilindrada + "cc";
    }
}
