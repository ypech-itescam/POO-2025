public class Carro {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int estado; 

    public Carro(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.estado = 0; 
    }

    public void encender() {
        this.estado = 1; 
        System.out.println("El " + this.marca + " " + this.modelo + " de color " + this.color + " está encendido.");
    }

    public void apagar() {
        this.estado = 0; 
        System.out.println("El " + this.marca + " " + this.modelo + " de color " + this.color + " está apagado.");
    }

    public void mover() {
        if (this.estado == 1) { 
            this.estado = 2; 
            System.out.println("El " + this.marca + " " + this.modelo + " de color " + this.color + " está en movimiento.");
        } else {
            System.out.println("Primero debes encender el carro.");
        }
    }

    public void frenar() {
        if (this.estado == 2) { 
            this.estado = 3; 
            System.out.println("El " + this.marca + " " + this.modelo + " de color " + this.color + " está frenando.");
        } else {
            System.out.println("El carro no está en movimiento.");
        }
    }

    public static void main(String[] args) {
        
        Carro miCarro = new Carro("Toyota", "Corolla", 2020, "Rojo");

        miCarro.encender();

        miCarro.mover();

        miCarro.frenar();

        miCarro.apagar();
    }
}