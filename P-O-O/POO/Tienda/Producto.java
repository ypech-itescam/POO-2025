public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString sin parámetros (por defecto)
    @Override
    public String toString() {
        return "Producto: " + nombre + "\r\n" +
               "Precio: " + precio + ", Cantidad disponible: " + cantidad;
    }

    // Método toString con cantidad de compra
    public String toString(int cantidadCompra) {
        return "Producto: " + nombre + "\r\n" +
               "Precio: " + precio + ", Cantidad disponible: " + cantidad + 
               ", Cantidad a comprar: " + cantidadCompra;
    }
}
