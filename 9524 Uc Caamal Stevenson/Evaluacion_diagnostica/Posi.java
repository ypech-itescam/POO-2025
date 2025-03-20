
import java.util.Scanner;

public class Posi{

    
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int contNega = 0;
            int contPosi = 0;
            System.out.println("Ingrese 5 numeros");

            for(int i = 1; i <=5; i++){
                System.out.println("Número " + i + ": ");
                int nume =  sc.nextInt();

            
            
            
    if(nume > 0){
        System.out.println("es positivo");
        contPosi++;
    } else {
        if(nume < 0){
            System.out.println("es negativo");
            contNega++;

        }else{
            System.out.println("es cero");
        }
    }
    System.out.println("la cantidad de numeros negativos es:" + contNega);
    System.out.println("La cantidad de numeros positivos es:" + contPosi);
        }


    }
}