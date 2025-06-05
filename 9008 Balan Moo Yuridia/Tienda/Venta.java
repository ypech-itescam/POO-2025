package Tienda;

public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private double total;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;

        if (producto.reducirStock(cantidad)) {
            this.total = producto.getPrecio() * cantidad;
        } else {
            throw new IllegalArgumentException("No hay suficiente stock para la venta.");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta: " + producto.getNombre() + " x" + cantidad + " a " + cliente.getNombre() +
               " - Total: $" + total;
    }
}
