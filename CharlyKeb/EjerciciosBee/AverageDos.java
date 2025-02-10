import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AverageDos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A, B, C, MEDIA;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        A = A * 2;
        B = B * 3;
        C = C * 5;

        MEDIA = (A + B + C) / 10;

        System.out.println(String.format("MEDIA = %.1f", MEDIA));

    }

}