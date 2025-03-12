import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner nentrada = new Scanner(System.in);
        int num;
        int i=0;
        int suma=0;

        System.out.println("¿Cuántos números deseas ingresar? ");
        num=nentrada.nextInt();
        while (num > 10 || num <= 0) { 
            System.out.println("Máximo 10 números. Ingresa de nuevo: ");
            num = nentrada.nextInt();
        }

        int[] x = new int[num];

        while (i < num) { 
            System.out.print("Ingresa el número "+(i+1) +": ");
            x[i] = nentrada.nextInt();
            i++;
        }

        i=0;
        while (i<num) { 
            suma +=x[i];
            i++;

        }
        System.out.println("La suma de los números ingresados es: "+suma);




    } 
}

