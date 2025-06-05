package Figgeom;
public class Operacion {
    public static double suma(double x, double y){
        return x + y;
    }

    public static boolean esPar(double num){
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean esNegativo(double num){
        if (num < 0)
            return true;
        else
            return false;
    }

    public static double dividir(double x, double y){
        return x/y;
    }

    public static double potencia(double num, int p){
        return Math.pow(num, p);
    }

    public static double restar(double x, double y){
        return x - y;
    }

    public static double multiplicar(double x, double y){
        return x*y;
    }
}
