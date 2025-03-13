
import java.util.ArrayList;
import java.util.List;


public class Venta {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.actualizarStock(cantidad)) {
            productos.add(new Producto(producto.getnombre(), producto.getprecio(), cantidad));
        } else {
            System.out.println("No se agrego el producto " + producto.getnombre());
        }
    }

    public double calcularTotal() {
        total = 0.0;
        for (Producto p : productos) {
            total += p.getprecio() * p.getstock();
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Cliente: " + cliente.getnombre());
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getnombre() + ", Cantidad: " + p.getstock());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
