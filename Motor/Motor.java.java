class Motor {
    private String modelo;
    private String marca;
    private int hp;

    public Motor(String modelo, String marca, int hp) {
        this.modelo = modelo;
        this.marca = marca;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Motor { modelo=" + modelo + ", marca=" + marca + ", hp=" + hp + " }";
    }
}

class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo, String color, Motor motor) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo { modelo=" + modelo + ", color=" + color + ", motor=" + motor + " }";
    }
}

class Propietario {
    private String nombre;
    private Vehiculo vehiculo;

    public Propietario(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Propietario { nombre=" + nombre + ", vehiculo=" + vehiculo + " }";
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nissan GTR", "Nissan", 250);
        Vehiculo vehiculo = new Vehiculo("Nissan", "Rojo", motor);
        Propietario propietario = new Propietario("Juan Cortéz", vehiculo);
        
        System.out.println(propietario);
    }
}