
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantos numeros desea ingresar?");
        int cantidad = sc. nextInt();

        int suma=0;
        int contador=1;

        while ( contador <= cantidad){
            System.out.println("ingrese el numero" + contador + ":");
            int nume =  sc.nextInt();
            suma+=nume;
            contador++;
        }

        System.out.println("La suma total es:" + suma);

        

    
    }
    
}
