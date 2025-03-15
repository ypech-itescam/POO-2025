package ClasesPersonales;
public class EstuchedeLapicez {

    private String material;
    private String color;
    private String tamaño;
    private String forma;
    private boolean estado;
    private int capacidad;

    public EstuchedeLapicez(String material, String color, String tamaño, String forma, boolean estado, int capacidad) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
        this.forma = forma;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getForma() {
        return forma;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    
    @Override
    public String toString() {
        return "Estuche " +"Material: " + material +", Color: " + color +", Tamaño: " + tamaño +", Forma: " + forma +
                ", Estado: " + (estado ? "Abierto" : "Cerrado") +
                ", Capacidad: " + capacidad + " objetos";
    }

}