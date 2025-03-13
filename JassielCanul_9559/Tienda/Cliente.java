package Tienda;
import java.util.Vector;

public class Cliente {

    private String nombre;
    private Vector<Venta> listaVentas;

    // Constructor
    public Cliente(String nombre) {
        setNombre(nombre);
        listaVentas = new Vector<>();
    }

    public Cliente(){
        setNombre("Cliente General");
        listaVentas = new Vector<>();
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = (nombre.equals("")) ? "Cliente general" : nombre;
    }

    // Getter para listaVentas
    public Vector<Venta> getListaVentas() {
        return listaVentas;
    }

    // Agregar una venta a la lista
    public void agregarVenta(Venta venta) {
        listaVentas.add(venta);
    }

    // Mostrar las ventas del cliente
    public void mostrarVentas() {
        System.out.println("\n  Ventas de " + getNombre() + ":");
        for (int i = 0; i < listaVentas.size(); i++) {
            System.out.println("\nVenta " + (i + 1) + ":");
            listaVentas.get(i).mostrarDetalle();
        }
    }
}