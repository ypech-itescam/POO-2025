public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        FiguraGeometrica cuadrado = new Cuadrado(5);
        FiguraGeometrica triangulo = new Triangulo(6, 4, 5, 5, 6);
        FiguraGeometrica rectangulo = new Rectangulo(10, 5);
        FiguraGeometrica circulo = new Circulo(7);

        // Mostrar áreas y perímetros
        System.out.println("Cuadrado: Área = " + cuadrado.calcularArea() + ", Perímetro = " + cuadrado.calcularPerimetro());
        System.out.println("Triángulo: Área = " + triangulo.calcularArea() + ", Perímetro = " + triangulo.calcularPerimetro());
        System.out.println("Rectángulo: Área = " + rectangulo.calcularArea() + ", Perímetro = " + rectangulo.calcularPerimetro());
        System.out.println("Círculo: Área = " + circulo.calcularArea() + ", Perímetro = " + circulo.calcularPerimetro());
    }
}
