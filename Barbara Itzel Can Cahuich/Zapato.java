public class Zapato {

    private String marca;
    private String color;
    private int talla;
    private double precio;

    public Zapato(String marca, String color, int talla, double precio) {
        this.marca = marca;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: $" + precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {

        Zapato zapato1 = new Zapato("Nike", "Negro", 42, 89.99);

        System.out.println("Detalles del Zapato:");
        zapato1.mostrarDetalles();

        zapato1.setPrecio(99.99);

        System.out.println("\nDetalles del Zapato Actualizados:");
        zapato1.mostrarDetalles();
    }
}    