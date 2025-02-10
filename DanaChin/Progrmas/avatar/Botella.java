package DanaChin.Progrmas.Objeto2;

public class Botella {
    // Atributos
    private String marca;
    private double capacidad;
    private boolean estaLlena;

    // Constructor
    public Botella(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.estaLlena = false; // Por defecto, la botella está vacía al ser creada
    }

    // Getter y Setter para la marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter y Setter para la capacidad
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    // Getter y Setter para el estado de llenado
    public boolean isEstaLlena() {
        return estaLlena;
    }

    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    // Método para llenar la botella
    public void llenarBotella() {
        estaLlena = true;
        System.out.println("La botella de " + marca + " ha sido llenada.");
    }

    // Método para vaciar la botella
    public void vaciarBotella() {
        estaLlena = false;
        System.out.println("La botella de " + marca + " ha sido vaciada.");
    }

    // Método para imprimir información sobre la botella
    public void imprimirInformacion() {
        String estado = estaLlena ? "llena" : "vacía";
        System.out.println("Botella de " + marca + " - Capacidad: " + capacidad + " litros - Estado: " + estado);
    }
}