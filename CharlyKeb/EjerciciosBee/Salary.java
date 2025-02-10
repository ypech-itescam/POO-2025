import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Salary {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int NUMBER, HOURSBYMONTH;
        double SALARY;
        NUMBER = sc.nextInt();
        HOURSBYMONTH = sc.nextInt();
        SALARY = sc.nextDouble();

        SALARY = HOURSBYMONTH * SALARY;

        System.out.println("NUMBER = " + NUMBER);
        System.out.println(String.format("SALARY = U$ %.2f", SALARY));
    }

}
