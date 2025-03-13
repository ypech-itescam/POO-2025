public class Trapecio extends FiguraGeometrica{

    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(String nombre, String color, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        super(nombre, color);
        setBaseMayor(baseMayor);
        setBaseMenor(baseMenor);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
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

    // Método para calcular el área (fórmula (base mayor + base menor) * altura / 2)
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // Método para calcular el perímetro (suma de las bases y los lados)
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

    public String toString() {
        return "Trapecio:\r\n" +
               "  Base Mayor = " + baseMayor + "\n" +
               "  Base Menor = " + baseMenor + "\n" +
               "  Altura = " + altura + "\n" +
               "  Lados = " + lado1 + ", " + lado2 + "\n" +
               "  Área = " + calcularArea() + "\n" +
               "  Perímetro = " + calcularPerimetro() + "\n";
    }
}
