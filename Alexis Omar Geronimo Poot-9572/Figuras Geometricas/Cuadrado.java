public class Cuadrado extends FiguraGeometrica {
    private double lado;
    //this= para esta clase
    // super= para la clase base 

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        setLado(lado);
    }
    public Cuadrado() {
        super("Figura Geometrica desde Cuadrado");
        setLado(2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado= (lado<=0.00) ? 0.00 : lado;
    }

    public double calcularArea() {
        return lado*lado;
    }
    public double calcularPerimetro() {
        return lado*4;
    }

    public String toString() {
        return  "Nombre: " + super.getNombre() + "\n\r Area: " + calcularArea() + "\n\r Perimetro: " + calcularPerimetro();
    }
}