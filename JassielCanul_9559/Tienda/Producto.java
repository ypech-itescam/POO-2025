package Tienda;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public Producto(){
        setNombre("Sabrita");
        setPrecio(20);
        setCantidad(32);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio > 0.00 ? precio : 19.99;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 1;
    }

    // Métodos para modificar la cantidad
    public void aumentarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void reducirCantidad(int cantidad) {
        if (cantidad > 0 && this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    // Método para actualizar el stock
    public void actualizarStock(int cantidad, boolean esVenta) {
        if (esVenta) {
            reducirCantidad(cantidad);
        } else {
            aumentarCantidad(cantidad);
        }
    }
}
