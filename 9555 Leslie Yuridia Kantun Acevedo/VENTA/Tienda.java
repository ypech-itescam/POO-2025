import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Venta> ventas;
    private List<Cliente> clientes;
    

    public Tienda(String nombre) {
        setNombre(nombre);  
        this.ventas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public Tienda() {
        setNombre("Tienda Genérica");  
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Tienda Genérica" : nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado: " + cliente.getNombre());
        } else {
            System.out.println("No se puede registrar un cliente nulo.");
        }
    }

    public void registrarCliente(String nombre, String telefono) {
        Cliente cliente = new Cliente(nombre, telefono);
        registrarCliente(cliente);  
    }

    public void registrarVenta(Venta venta) {
        if (venta != null) {
            ventas.add(venta);
            System.out.println("Venta registrada en " + nombre);
        } else {
            System.out.println("No se puede registrar una venta nula.");
        }
    }

    public void registrarVenta(Cliente cliente, List<Producto> productos) {
        if (cliente != null && productos != null && !productos.isEmpty()) {
            Venta venta = new Venta(cliente, productos);
            registrarVenta(venta);  
        } else {
            System.out.println("No se puede registrar una venta con datos inválidos.");
        }
    }

    public void mostrarHistorialVentas() {
        System.out.println("\nHistorial de Ventas en " + nombre + ":");
        for (Venta venta : ventas) {
            venta.mostrarDetalle();
        }
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;  
    }

    public void mostrarClientes() {
        System.out.println("\nClientes registrados en " + nombre + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre() + " - Teléfono: " + cliente.getTelefono());
        }
    }
}