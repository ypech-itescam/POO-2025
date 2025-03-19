import java.util.Scanner;

public class ClasNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];     
        int[] pares = new int[10];       
        int[] impares = new int[10];     
        int cuantosPares = 0;
        int cuantosImpares = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            if(numeros[i] % 2 == 0) {
                pares[cuantosPares] = numeros[i];
                cuantosPares = cuantosPares + 1;
            } else {
                impares[cuantosImpares] = numeros[i];
                cuantosImpares = cuantosImpares + 1;
            }
        }
        
        System.out.print("Pares: ");
        for(int i = 0; i < cuantosPares; i++) {
            if(i == cuantosPares - 1) {
                System.out.print(pares[i]);
            } else {
                System.out.print(pares[i] + ", ");
            }
        }
        
        System.out.print("\nImpares: ");
        for(int i = 0; i < cuantosImpares; i++) {
            if(i == cuantosImpares - 1) {
                System.out.print(impares[i]);
            } else {
                System.out.print(impares[i] + ", ");
            }
        }
        
        scanner.close();
    }
}