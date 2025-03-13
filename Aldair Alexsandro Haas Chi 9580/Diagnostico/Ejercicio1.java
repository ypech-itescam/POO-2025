
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[5];

        int contPos = 0, contNeg = 0, contCeros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            num[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5 ; i++) {
            if (num[i]>0) {
            contPos++;
            }
        else if(num[i]<0) {
            contNeg++;
        }
        else{
            contCeros++;
        }
 
        }
        System.out.println("Positivos:"+contPos);
        System.out.println("Negativos:"+contNeg);
        System.out.println("Ceros:"+contCeros);
    }

}