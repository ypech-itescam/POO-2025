import java.util.Scanner;

public class Termometro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit a Celsius");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese la temperatura en Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit");
            } else if (opcion == 2) {
                System.out.println("Ingrese la temperatura en Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " grados Fahrenheit es igual a " + celsius + " grados Celsius");
            } else if (opcion >= 3) {
                System.out.println("Opcion invalida");
                break;
            }
        }
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}