// Clase Cuadrado hereda de FiguraGeometrica
public class Cuadrado extends FiguraGeometrica {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Getter y setter para el lado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
