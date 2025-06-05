package Carro;

public class Propietario {
    private String nombre;
    private String cedula;

    public Propietario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return nombre + " (Cédula: " + cedula + ")";
    }
}
