public class Tenis {
    private String color;
    private String marca;
    private int estado; // 0 = limpio, 1 = sucios

    // Constructor 1 (original)
    public Tenis(String color, String marca, int estado) {
        setColor(color);
        setMarca(marca);
        setEstado(1);
    }

    // Constructor 2 (nuevo)
    public Tenis() {
        setColor("Negro");
        setMarca("Puma");
        setEstado (0); // Limpios por defecto
    }

    // Métodos getter y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}

