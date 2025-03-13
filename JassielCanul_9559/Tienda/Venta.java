package Tienda;
import java.util.Vector;

public class Venta {
    private Vector<Producto> productos;
    private Vector<Integer> cantidades;
    private double total;

    // Constructor por defecto
    public Venta() {
        productos = new Vector<>();
        cantidades = new Vector<>();
        total = 0.0;
    }

    // Segundo constructor con parámetros
    public Venta(Vector<Producto> productos, Vector<Integer> cantidades) {
        this.productos = productos != null ? productos : new Vector<>();
        this.cantidades = cantidades != null ? cantidades : new Vector<>();
        this.total = calcularTotal();
    }

    // Agregar productos a la venta
    public void agregarProducto(Producto p, int cantidad) {
        if (p.getCantidad() >= cantidad) { // Verifica stock disponible
            int index = productos.indexOf(p);
            if (index >= 0) {
                cantidades.set(index, cantidades.get(index) + cantidad);
            } else {
                productos.add(p);
                cantidades.add(cantidad);
            }
            p.reducirCantidad(cantidad); // Reduce el stock del producto
        } else {
            System.out.println("No hay suficiente stock de " + p.getNombre());
        }
    }

    // Eliminar productos de la venta
    public void eliminarProducto(Producto p, int cantidad) {
        int index = productos.indexOf(p);
        if (index >= 0) {
            if (cantidades.get(index) > cantidad) {
                cantidades.set(index, cantidades.get(index) - cantidad);
                p.aumentarCantidad(cantidad); // Aumenta el stock del producto
            } else {
                p.aumentarCantidad(cantidades.get(index)); // Devolver toda la cantidad al stock
                productos.remove(index);
                cantidades.remove(index);
            }
        } else {
            System.out.println("El producto no está en la lista de la venta.");
        }
    }

    // Calcular el total de la venta
    public double calcularTotal() {
        total = 0.0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }

    // Mostrar el detalle de la venta
    public void mostrarDetalle() {
        System.out.println("Detalle de la Venta:");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println(String.format("- %s x%d = $%.2f", p.getNombre(), cantidad, p.getPrecio() * cantidad));
        }
        System.out.println(String.format(" Total a pagar: $%.2f", calcularTotal()));
    }
}
