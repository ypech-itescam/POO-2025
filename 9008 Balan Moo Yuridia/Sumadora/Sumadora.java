package Sumadora;

public class Sumadora {

    public String sumar(int a, int b) {
        int resultado = a + b;
        return "Suma de int: " + resultado;
    }

    public String sumar(double a, double b) {
        double resultado = a + b;
        return "Suma de double: " + resultado;
    }

    public String sumar(char a, char b) {
        int resultado = a + b; // suma de valores ASCII
        return "Suma de char (ASCII): " + resultado + " ('" + a + "' + '" + b + "')";
    }

    public String sumar(String a, String b) {
        String resultado = a + b;
        return "Concatenación de String: " + resultado;
    }

    // Combinaciones adicionales
    public String sumar(int a, double b) {
        double resultado = a + b;
        return "Suma de int + double: " + resultado;
    }

    public String sumar(int a, char b) {
        int resultado = a + b;
        return "Suma de int + char (ASCII): " + resultado;
    }

    public String sumar(String a, int b) {
        return "String + int: " + a + b;
    }

    public String sumar(String a, char b) {
        return "String + char: " + a + b;
    }
}
