public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String nombre, String color, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre, color);
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Método para calcular el área (fórmula base * altura / 2)
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro (suma de los tres lados)
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triángulo:\r\n" +
               "  Base = " + base + "\n" +
               "  Altura = " + altura + "\n" +
               "  Lados = " + lado1 + ", " + lado2 + ", " + lado3 + "\n" +
               "  Área = " + calcularArea() + "\n" +
               "  Perímetro = " + calcularPerimetro() + "\n";
    }
}
