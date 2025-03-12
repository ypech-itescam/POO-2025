public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
        this.cantidad = cantidad > 0 ? cantidad : 1;
        this.precio = precio > 0 ? precio : 1.0;
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
        this.cantidad = 1;
        this.precio = precio > 0 ? precio : 1.0;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularTotal() {
        return cantidad * precio;
    }

    public void aumentarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void disminuirCantidad(int cantidad) {
        if (cantidad > 0 && this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad + " - Precio: $" + precio;
    }
}
