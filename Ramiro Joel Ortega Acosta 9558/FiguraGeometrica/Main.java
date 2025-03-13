import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura que desea crear:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Triángulo");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el color de la figura: ");
        String color = scanner.nextLine();

        FiguraGeometrica figura = null;

        switch (opcion) {
            case 1: // Círculo
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(color, radio);
                break;

            case 2: // Cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                figura = new Cuadrado(color, lado);
                break;

            case 3: // Rectángulo
                System.out.print("Ingrese el largo del rectángulo: ");
                double largo = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                figura = new Rectangulo(color, largo, ancho);
                break;

            case 4: // Triángulo
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                System.out.print("Ingrese el primer lado del triángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo lado del triángulo: ");
                double lado2 = scanner.nextDouble();
                System.out.print("Ingrese el tercer lado del triángulo: ");
                double lado3 = scanner.nextDouble();
                figura = new Triangulo(color, base, altura, lado1, lado2, lado3);
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }

        // Mostrar resultados
        System.out.println("\nFigura creada: " + figura.getNombre());
        System.out.println("Color: " + figura.getColor());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());

        scanner.close();
    }
}
