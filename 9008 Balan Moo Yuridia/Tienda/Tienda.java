package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Venta> ventas;

    public Tienda(String nombre) {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
    }

    public void mostrarVentas() {
        System.out.println("Ventas realizadas:");
        for (Venta v : ventas) {
            System.out.println("- " + v);
        }
    }
}
