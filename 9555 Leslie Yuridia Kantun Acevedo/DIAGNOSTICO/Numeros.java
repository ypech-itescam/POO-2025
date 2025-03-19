import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[5];
        
      
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Ingresa un número: ");
                    numeros[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Por favor, ingresa un número entero válido.");
                    scanner.nextLine(); 
                }
            }
        }
        
        
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
       
        scanner.close();
    }
}