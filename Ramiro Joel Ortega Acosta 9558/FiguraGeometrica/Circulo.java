public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super("Círculo", color); // Llamada al constructor de la superclase
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Getter y setter para el radio
    public double getRadio() {
        return radio;
    }   

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
