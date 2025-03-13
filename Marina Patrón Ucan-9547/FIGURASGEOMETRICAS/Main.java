 public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Rojo", 10, 5, 7, 8, 9);
        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println();

        Rectangulo rectangulo = new Rectangulo("Azul", 10, 5);
        System.out.println(rectangulo);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println();

        Circulo circulo = new Circulo("Verde", 7);
        System.out.println(circulo);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println();

        Trapecio trapecio = new Trapecio("Amarillo", 5, 10, 4, 6, 7);
        System.out.println(trapecio);
        System.out.println("Área: " + trapecio.calcularArea());
        System.out.println("Perímetro: " + trapecio.calcularPerimetro());
    }
}
  
    

