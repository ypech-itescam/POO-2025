package Cine;

public class Boleto {
    private String pelicula;
    private Sala sala;
    private Asiento asiento;
    private double precio;

    public Boleto(String pelicula, Sala sala, Asiento asiento, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.asiento = asiento;
        this.precio = precio;
        this.asiento.ocupar(); // Marca el asiento como ocupado al emitir el boleto
    }

    public String getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Boleto: " + pelicula + " - Sala: " + sala.getNombre() +
               " - Asiento: Fila " + asiento.getFila() + ", Columna " + asiento.getColumna() +
               " - Precio: $" + precio;
    }
}
