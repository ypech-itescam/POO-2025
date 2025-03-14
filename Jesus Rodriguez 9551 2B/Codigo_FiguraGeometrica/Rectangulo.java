public class Rectangulo extends FiguraGeometrica {
    private double largo, ancho;

    public Rectangulo(String nombre, String color, double largo, double ancho) {
        super(nombre, color);
        this.largo = largo;
        this.ancho = ancho;
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
