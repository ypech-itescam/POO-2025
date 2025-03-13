import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }
    public Venta(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos != null ? productos : new ArrayList<>();
        this.total = 0;
        for (Producto p : this.productos) {
            total += p.calcularTotal();
        }
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto != null && cantidad > 0) {
            Producto nuevoProducto = new Producto(producto.getNombre(), cantidad, producto.getPrecio());
            productos.add(nuevoProducto);
            total += nuevoProducto.calcularTotal();
        }
    }

    public void calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
    }

    public void mostrarDetalle() {
        System.out.println("\nCompra realizada por: " + cliente.getNombre());
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("Total a pagar: $" + total);
    }
}

