import java.util.Scanner;

public class HolaMundoColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el color para 'Hola, mundo' (ROJO, VERDE, AZUL, AMARILLO): ");
        String colorElegido = scanner.nextLine();

        // Cambia el color según la entrada del usuario
        switch (colorElegido.toUpperCase()) {
            case "ROJO":
                cambiarColorTexto(ColorTexto.ROJO);
                break;
            case "VERDE":
                cambiarColorTexto(ColorTexto.VERDE);
                break;
            case "AZUL":
                cambiarColorTexto(ColorTexto.AZUL);
                break;
            case "AMARILLO":
                cambiarColorTexto(ColorTexto.AMARILLO);
                break;
            default:
                System.out.println("Color no válido. Se imprimirá en el color predeterminado.");
        }

        // Imprime "Hola, mundo"
        System.out.println("Hola, mundo");

        // Restaura el color predeterminado
        cambiarColorTexto(ColorTexto.RESET);
    }

    // Enumeración para definir colores de texto ANSI
    private enum ColorTexto {
        RESET("\u001B[0m"),
        ROJO("\u001B[31m"),
        VERDE("\u001B[32m"),
        AZUL("\u001B[34m"),
        AMARILLO("\u001B[33m");

        private final String codigoColor;

        ColorTexto(String codigoColor) {
            this.codigoColor = codigoColor;
        }

        @Override
        public String toString() {
            return codigoColor;
        }
    }

    // Cambia el color del texto en la consola
    private static void cambiarColorTexto(ColorTexto colorTexto) {
        System.out.print(colorTexto);
    }
}