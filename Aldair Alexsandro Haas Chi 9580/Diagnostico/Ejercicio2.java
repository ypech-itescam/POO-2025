public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < num.length; i++) {
            int cuadrado = num[i]*num[i];

            System.out.println("Número:"+num[i]+" Cuadrado:"+ cuadrado);
        }
    }
}
