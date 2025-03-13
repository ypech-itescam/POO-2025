public class Trapecio extends FiguraGeometrica {
    private double baseMenor, baseMayor, altura, lado1, lado2;

    public Trapecio(String color, double baseMenor, double baseMayor, double altura, double lado1, double lado2) {
        super("Trapecio", color);
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return ((baseMenor + baseMayor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMenor + baseMayor + lado1 + lado2;
    }
}
