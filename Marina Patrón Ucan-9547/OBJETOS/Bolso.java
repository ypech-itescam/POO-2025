public class Bolso {
    private String color;
    private String marca;

    // Constructor 1 (original)
    public Bolso(String color, String marca) {
        setColor(color);
        setMarca(marca);
    }

    // Constructor 2 (nuevo)
    public Bolso() {
        setColor("Azul");
        setMarca ("Dior");
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
}