package Sumadora;

public class Main {
    public static void main(String[] args) {
        Sumadora suma = new Sumadora();

        System.out.println(suma.suma(1, 2));
        System.out.println(suma.suma('a', 'b'));
        System.out.println(suma.suma(4.9, 5.1));
        System.out.println(suma.suma(8.2, 4));
    }
    
}
