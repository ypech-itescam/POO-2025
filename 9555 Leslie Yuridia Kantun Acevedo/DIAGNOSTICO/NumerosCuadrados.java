public class NumerosCuadrados{
    public static void main(String[]args){
        int [] numeros = new int [10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;

        }

        for(int numero : numeros){
            int cuadrado = numero * numero;
            System.out.println("Numero: "+numero+",Cuadrado: "+cuadrado);
        }
    }
}