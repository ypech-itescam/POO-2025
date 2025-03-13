import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Venta> ventas;
    private List<Cliente> clientes;

    public Tienda(String nombre) {
        this.nombre = nombre.equals("") ? "Tienda" : nombre;
        this.ventas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        }
    }

    public void registrarVenta(Venta venta) {
        if (venta != null) {
            ventas.add(venta);
            System.out.println("Venta registrada en " + nombre);
        } else {
            System.out.println("No se puede registrar una venta nula.");
        }
    }

    public void mostrarHistorialVentas() {
        System.out.println("\nHistorial de Ventas en " + nombre + ":");
        for (Venta venta : ventas) {
            venta.mostrarDetalle();
        }
    }

    public String getNombre() {
        return nombre;
    }
}
