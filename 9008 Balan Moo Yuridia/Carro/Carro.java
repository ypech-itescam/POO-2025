package Carro;

public class Carro extends Vehiculo {
    private Motor motor;
    private Propietario propietario;
    private String placa;

    public Carro(String marca, String modelo, int año, String placa, Motor motor, Propietario propietario) {
        super(marca, modelo, año);
        this.motor = motor;
        this.propietario = propietario;
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString() +
               " - Placa: " + placa +
               " - Motor: " + motor +
               " - Propietario: " + propietario;
    }
}
