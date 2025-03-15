package ClasesPersonales;
public class Mesa {

    private String material;
    private String color;
    private String tamaño;
    private String forma;
    private boolean estado;


    public Mesa(String material, String color, String tamaño, String forma) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
        this.forma = forma;
        this.estado = false; 
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


    @Override
    public String toString() {
        return "Mesa = " +"Material: " + material + ", Color: " + color + ", Tamaño: " + tamaño +", Forma: " + forma +
        ", Estado: " + (estado ? "ocupado" : "Disponible");
    }
}