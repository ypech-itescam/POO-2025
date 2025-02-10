import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AreaOfACircle {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A, R;
        double n = 3.14159;

        R = sc.nextDouble();

        A = n * (R * R);

        System.out.println(String.format("A=%.4f", A));

    }

}