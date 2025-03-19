public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    //meter tipo de triangulo

    public Triangulo(String nombre, double base, double altura, double lado1, double lado2) {
        super(nombre);
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public double getlado1() {
        return lado1;
    }
    public double getlado2() {
        return lado2;
    }

    public void setAltura(double altura) {
        this.altura= (altura<=0) ? 0 : altura;
    }
    public void setBase(double base) {
        this.base= (base<=0) ? 0 : base;
    }
    public void setLado1(double lado1) {
        this.lado1=(lado1<=0) ? 0 : lado1;
    }
    public void setLado2(double lado2) {
        this.lado2=(lado2<=0) ? 0 : lado2;
    }

    public double calcularArea() {
        return (base*altura)/2;
    }
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    public String toString() {
        return  "Nombre: " + super.getNombre() + "\n\r Area: " + calcularArea() + "\n\r Perimetro: " + calcularPerimetro();
    }

}