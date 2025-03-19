import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Cuantos numeros deseas ingresar: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un numero valido.");
                scanner.next();
            }
            n = scanner.nextInt();
            
            if (n <= 0 || n > 10) {
                System.out.println("Ingresa un numero entre 1 y 10.");
            }
        } while (n <= 0 || n > 10);
        
        int[] numeros = new int[n];
        
        int i = 0;
        while (i < n) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            
            if (scanner.hasNextInt()) {
                numeros[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Ingresa un numero valido.");
                scanner.next();
            }
        }
        
        int suma = 0;
        i = 0;
        while (i < n) {
            suma += numeros[i];
            i++;
        }
        
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}