
import java.util.Scanner;

public class Par{

    public static void main(String[] args) {

         Scanner sc =new Scanner(System.in);
          System.out.println("ingresar numeros");
          int[] numeros = new int[10];


          for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros [i] = sc.nextInt();

            System.out.println("\nNúmeros pares:");
            for (int num : numeros) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
    
            System.out.println("\n\nNúmeros impares:");
            for (int num : numeros) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }




        
    }
