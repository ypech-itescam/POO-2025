public class Circulo extends FiguraGeometrica {
    private double radio;
    private final double pi;

    public Circulo(String nombre, double radio) {
        super(nombre);
        setRadio(radio);
        pi= 3.14159;
    }
    public Circulo() {
        super("Circulo");
        setRadio(0);
        pi= 3.14159;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio=(radio<=0) ? 0 : radio;
    }

    public double calcularArea() {
        return  pi*(radio*radio);
    }

    public double calcularPerimetro() {
        return ((2*pi)*(radio));
    }
    public double calcularDiametro() {
        return 2*radio;
    }

    public String toString() {
        return  "Nombre: " + super.getNombre() + "\n\r Area: " + calcularArea() + "\n\r Perimetro: " + calcularPerimetro();
    }
}