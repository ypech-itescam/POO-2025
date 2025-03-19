import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente) {
        setCliente(cliente); 
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    public Venta(Cliente cliente, List<Producto> productos) {
        this(cliente);  
        setProductos(productos);  
        calcularTotal();  
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
    }

    public void setProductos(List<Producto> productos) {
        if (productos != null && !productos.isEmpty()) {
            this.productos = new ArrayList<>(productos);  
        } else {
            throw new IllegalArgumentException("La lista de productos no puede ser nula o vacía.");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos); 
    } 

    public double getTotal() {
        return total;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto != null && cantidad > 0) {
            Producto nuevoProducto = new Producto(producto.getNombre(), cantidad, producto.getPrecio());
            productos.add(nuevoProducto);
            total += nuevoProducto.calcularTotal();
        } else {
            throw new IllegalArgumentException("El producto no puede ser nulo y la cantidad debe ser mayor que 0.");
        }
    }

    public void agregarProducto(Producto producto) {
        agregarProducto(producto, 1);  
    }

    public void calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
    }

    public void mostrarDetalle() {
        System.out.println("\nVenta realizada por: " + cliente.getNombre());
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("Total a pagar: $" + total);
    }
}