import java.util.Vector;

public class Venta {
    private double total;
    private Vector<Producto> productos;  

    public Venta() {    
        productos = new Vector<>();
        total = 0.0; 
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = (total <= 0) ? 0.00 : total;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }
}