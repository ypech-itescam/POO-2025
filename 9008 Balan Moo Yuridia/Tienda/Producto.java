package Tienda;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " - Stock: " + stock;
    }
}
