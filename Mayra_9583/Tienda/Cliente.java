import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private ArrayList<Venta> listaDeVentas;

    public Cliente(String nombre) {
        setNombre (nombre);
        this.listaDeVentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Cliente general" : nombre;
    }

    public void compra(List<Producto> productos, List<Integer> cantidades) {
        if (productos.size() == cantidades.size()) {
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                int cantidadSolicitada = cantidades.get(i);
    
                // Verificar si hay suficiente stock
                if (cantidadSolicitada > producto.getCantidad()) {
                    System.out.println("No se puede vender " + cantidadSolicitada + " unidades de " + producto.getNombre() +
                                       " porque solo hay " + producto.getCantidad() + " disponibles.");
                } else {
                    // Restar del stock y registrar la venta
                    producto.setCantidad(producto.getCantidad() - cantidadSolicitada);
                    Venta venta = new Venta(producto, cantidadSolicitada);
                    venta.calcularTotal();
                    listaDeVentas.add(venta);
                }
            }
        } else {
            System.out.println("Error: La cantidad de productos y cantidades no coincide.");
        }
    }
    

public void mostrarListaDeVentas() {
  
    System.out.println("LISTA DE VENTA");
    System.out.println("---------------------------------");
    
    for (Venta venta : listaDeVentas) {
     
        System.out.println(venta.toString());
        System.out.println("---------------------------------");
    }  
}

public List<Venta> getListaDeVentas() {
    return listaDeVentas;
}


public String toString() {
    String resultado = "Cliente: " + nombre + "\nVentas:\n";
    for (Venta venta : listaDeVentas) {
        resultado += venta.toString() + "\n";
    }
    return resultado;
    
}

}
