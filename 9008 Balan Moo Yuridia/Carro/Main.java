package Carro;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 1600);
        Propietario propietario = new Propietario("Carlos Gómez", "987654321");

        Carro carro = new Carro("Toyota", "Corolla", 2020, "ABC-123", motor, propietario);

        System.out.println(carro);
    }
}
