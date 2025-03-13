public class Circulo extends FiguraGeometrica {

    private double radio;

    // Constructor que incluye nombre y color, además del radio
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);  // Llamamos al constructor de la clase base FiguraGeometrica
        setRadio(radio); 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Sobreescribir el método toString para incluir los atributos de la clase base
    public String toString() {
        return "Círculo: \r\n" +
               "  Nombre = " + getNombre() + "\n" +  
               "  Color = " + getColor() + "\n" +     
               "  Radio = " + radio + "\n" +
               "  Área = " + calcularArea() + "\n" +
               "  Perímetro = " + calcularPerimetro() + "\r\n" ;
    }
}
