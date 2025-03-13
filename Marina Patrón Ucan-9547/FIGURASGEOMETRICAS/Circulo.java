public class Circulo extends FiguraGeometrica {
    private double radio;
    private static final double PI = 3.1416;

    public Circulo(String color, double radio) {
        super("Círculo", color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
