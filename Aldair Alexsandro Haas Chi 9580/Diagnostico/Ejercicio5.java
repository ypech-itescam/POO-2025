
import java.util.Scanner;

public class Ejercicio5 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero "+(i+1)+":");
            num[i] = scanner.nextInt();
        }

        int contpar=0, continpar=0;


        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                contpar++;
            }
            else{
                continpar++;
            }
        }
        int [] par = new int[contpar];
        int [] inpar = new int[continpar];

        int contp = 0, conti=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par[contp++]=num[i];
            }
            else{
                inpar[conti++]=num[i];
        }
    }

    System.out.println("Pares");
    for (int i = 0; i < par.length; i++) {
        System.out.println(par[i]);
        
    }
    System.out.println("Inpares");
    for (int i = 0; i < inpar.length; i++) {
        System.out.println(inpar[i]);
        
    }
    
}
}