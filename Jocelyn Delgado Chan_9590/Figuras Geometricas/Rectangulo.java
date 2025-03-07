// Clase Rectangulo hereda de FiguraGeometrica
public class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    // Getters y setters
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
