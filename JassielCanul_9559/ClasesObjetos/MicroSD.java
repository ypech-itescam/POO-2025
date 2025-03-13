package ClasesObjetos;

public class MicroSD {

    private String marca;
    private int capacidad; // Capacidad en GB

    public MicroSD(String marca, int capacidad) {
        setMarca(marca);
        setCapacidad(capacidad);
    }

    public MicroSD(){
        setMarca("Adatta");
        setCapacidad(64);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca.equals("") ? "Genérica" : marca;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad > 0 ? capacidad : 16; // Valor por defecto 16GB
    }

    public String toString() {
        return "MicroSD: " + marca + "\n\r      - Capacidad: " + capacidad + "GB";
    }
}
