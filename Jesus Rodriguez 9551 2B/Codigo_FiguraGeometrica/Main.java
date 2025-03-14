public class Main {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo("Triángulo", "Rojo", 10, 5, 6, 8, 10);
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo", "Azul", 8, 4);
        FiguraGeometrica circulo = new Circulo("Círculo", "Verde", 5);
        FiguraGeometrica trapecio = new Trapecio("Trapecio", "Amarillo", 10, 6, 4, 5, 7);

        System.out.println("Nombre: " + triangulo.getNombre() + ", Color: " + triangulo.getColor() + ", Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Nombre: " + rectangulo.getNombre() + ", Color: " + rectangulo.getColor() + ", Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Nombre: " + circulo.getNombre() + ", Color: " + circulo.getColor() + ", Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Nombre: " + trapecio.getNombre() + ", Color: " + trapecio.getColor() + ", Área: " + trapecio.calcularArea() + ", Perímetro: " + trapecio.calcularPerimetro());
    }
}