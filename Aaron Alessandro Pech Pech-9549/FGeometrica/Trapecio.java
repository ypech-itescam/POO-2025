public class Trapecio extends FigGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        super(nombre);
        setBaseMayor(baseMayor);
        setBaseMenor(baseMenor);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getBaseMayor() {
        return baseMayor;
    }
    public double getBaseMenor() {
        return baseMenor;
    }
    public double getAltura() {
        return altura;
    }
    public double getlado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor=(baseMayor<=0) ? 0 : baseMayor;
    }
    public void setBaseMenor(double baseMenor) {
        this.baseMenor=(baseMenor<=0) ? 0 : baseMenor;
    }
    public void setAltura(double altura) {
        this.altura=(altura<=0) ? 0 : altura;
    }
    public void setLado1(double lado1) {
        this.lado1=(lado1<=0) ? 0 : lado1;
    }
    public void setLado2(double lado2) {
        this.lado2=(lado2<=0) ? 0 : lado2;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor)*altura)/2;
    }
    public double calcularPerimetro() {
        return baseMayor + baseMenor +lado1 + lado2;
    }

    public String toString() {
        return  "Nombre: " + super.getNombre() + "\n\r Area: " + calcularArea() + "\n\r Perimetro: " + calcularPerimetro();
    }
}