public class Trapecio extends FiguraGeometrica {
    private double baseMayor, baseMenor, altura, lado1, lado2;

    public Trapecio(String nombre, String color, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        super(nombre, color);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
