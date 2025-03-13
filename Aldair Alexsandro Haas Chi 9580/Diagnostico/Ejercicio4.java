import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[5];
        int intentos = 3;
        boolean acertado = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa una palabra " + (i + 1) + ": ");
            palabras[i] = scanner.next();
        }

        do {
            System.out.print("Adivina una palabra de la lista: ");
            String intento = scanner.next();
            
            for (String palabra : palabras) {
                if (intento.equals(palabra)) {
                    acertado = true;
                    break;
                }
            }

            if (!acertado) {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Incorrecto. Intenta de nuevo.");
                } else {
                    System.out.println("Lo siento, te quedaste sin intentos.");
                }
            }
        } while (!acertado && intentos > 0);
        
        if (acertado) {
            System.out.println("Correcto. ¡Bien hecho!");
        }
    }
}
