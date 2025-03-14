public class Triangulo extends FiguraGeometrica {
    private double base, altura, lado1, lado2, lado3;

    public Triangulo(String nombre, String color, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}