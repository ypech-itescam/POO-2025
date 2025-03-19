import java.util.Vector;

public class Venta {
    private Vector<Producto> productos;
    private Vector<Integer> cantidades;  // Lista para almacenar las cantidades de cada producto
    private double total;

    // Constructor vacío (ya existente)
    public Venta() {
        productos = new Vector<>();
        cantidades = new Vector<>();
        total = 0.0;
    }

    // Constructor que acepta un producto y su cantidad
    public Venta(Producto p, int cantidad) {
        productos = new Vector<>();
        cantidades = new Vector<>();
        total = 0.0;
        agregarProducto(p, cantidad); // Agrega el producto y su cantidad al crear la venta
    }

    // Métodos get y set
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método agregarProducto (agrega un producto junto con su cantidad)
    public void agregarProducto(Producto p, int cantidad) {
        productos.add(p);
        cantidades.add(cantidad);
    }

    // Método calcularTotal (calcula el total sumando el precio * cantidad de cada producto)
    public void calcularTotal() {
        total = 0.0;
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            total += p.getPrecio() * cantidad;
        }
    }

    // Método mostrarDetalles (muestra los productos y sus cantidades en la venta)
    public void mostrarDetalles() {
        System.out.println("DETALLES DE VENTA");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println(p.toString() + " - Cantidad: " + cantidad); // Muestra cada producto con su cantidad
        }
        System.out.println("Total: " + total);
    }

    // Método toString
    public String toString() {
        StringBuilder resultado = new StringBuilder("Venta:\n");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            resultado.append(p.toString()).append(" - Cantidad: ").append(cantidad).append("\n");
        }
        resultado.append("Total: ").append(total);
        return resultado.toString();
    }
}
