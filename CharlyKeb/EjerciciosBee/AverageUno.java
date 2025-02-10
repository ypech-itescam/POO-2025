import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecuta
 */
public class AverageUno {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();
        A = A * 3.5;
        B = B * 7.5;
        Double media = (A + B) / 11;

        System.out.println(String.format("MEDIA = %.5f", media));

    }

}