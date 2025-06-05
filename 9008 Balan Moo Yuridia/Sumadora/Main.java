package Sumadora;

public class Main {
    public static void main(String[] args) {
        Sumadora s = new Sumadora();

        System.out.println(s.sumar(10, 20));
        System.out.println(s.sumar(5.5, 2.3));
        System.out.println(s.sumar('A', 'B')); // 'A' = 65, 'B' = 66
        System.out.println(s.sumar("Hola", " Mundo"));
        System.out.println(s.sumar(5, 3.14));
        System.out.println(s.sumar(100, 'C'));
        System.out.println(s.sumar("Resultado: ", 42));
        System.out.println(s.sumar("Letra: ", 'Z'));
    }
}

