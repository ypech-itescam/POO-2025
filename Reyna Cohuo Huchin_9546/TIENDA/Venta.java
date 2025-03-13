import java.util.Vector;

public class Venta {
    private Vector<Producto> productos;
    private Vector<Integer> cantidades;  // Lista para almacenar las cantidades de cada producto
    private double total;

    public Venta() {
        productos = new Vector<>();
        cantidades = new Vector<>();
        total = 0.0;
    }

    public Venta(Producto p, int cantidad) {
        productos = new Vector<>();
        cantidades = new Vector<>();
        total = 0.0;
        agregarProducto(p, cantidad);
    }

    // Métodos get y set
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método agregarProducto 
    public void agregarProducto(Producto p, int cantidad) {
        productos.add(p);
        cantidades.add(cantidad);
    }

    // Método calcularTotal 
    public void calcularTotal() {
        total = 0.0;
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            total += p.getPrecio() * cantidad;
        }
    }

    // Método mostrarDetalles 
    public void mostrarDetalles() {
        System.out.println("DETALLES DE VENTA");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println(p.toString() + " - Cantidad: " + cantidad); 
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
