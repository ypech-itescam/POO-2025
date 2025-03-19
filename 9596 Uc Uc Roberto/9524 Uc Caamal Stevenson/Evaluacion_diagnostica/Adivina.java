import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] palabras = new String[5];
        
        System.out.println("Ingresa 5 palabras:");
        palabras[0] = scanner.nextLine();
        palabras[1] = scanner.nextLine();
        palabras[2] = scanner.nextLine();
        palabras[3] = scanner.nextLine();
        palabras[4] = scanner.nextLine();
        
        int intentos = 3;
        boolean ganador = false;
        
        do {
            System.out.print("Adivina una palabra de la lista: ");
            String intento = scanner.nextLine();
            
            if(intento.equals(palabras[0]) || 
               intento.equals(palabras[1]) || 
               intento.equals(palabras[2]) || 
               intento.equals(palabras[3]) || 
               intento.equals(palabras[4])) {
                System.out.println("Correcto. ¡Bien hecho!");
                ganador = true;
            } else {
                intentos = intentos - 1;
                if(intentos > 0) {
                  System.out.println("Incorrecto. Intenta de nuevo.");
                } else {
                    System.out.println("Incorrecto. Te quedaste sin intentos.");
                }
            }
        } while(!ganador && intentos > 0);
        
        scanner.close();
    }
}