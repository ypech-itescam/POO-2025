import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void Basico (String[] args) throws IOException {
    
        Scanner scanner = new Scanner(System.in);
         int A = scanner.nextInt();
         int B = scanner.nextInt();
         
         int X = A + B ;
         
         System.out.println("X = " + X);
 
    }
 
}