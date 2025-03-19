import java.util.ArrayList;

public class NotaDeVenta {
    private int id;
    private Cliente cliente;
    private Tienda tienda;
    private Vendedor vendedor;
    private ArrayList<Producto> productos;
    private static int contador = 1;

    public NotaDeVenta(Cliente cliente, Tienda tienda, Vendedor vendedor) {
        this.id = contador++;
        this.cliente = cliente;
        this.tienda = tienda;
        this.vendedor = vendedor;
        this.productos = new ArrayList<>();
    }

    public int getId() { return id; }

    public Cliente getCliente() { return cliente; }
    public Tienda getTienda() { return tienda; }
    public Vendedor getVendedor() { return vendedor; }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "NotaDeVenta{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", tienda=" + tienda.getNombre() +
                ", vendedor=" + vendedor.getNombre() +
                ", total=" + calcularTotal() +
                '}';
    }
}