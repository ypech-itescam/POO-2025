import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Zapatos", 1500.0, 2);
        Producto p2 = new Producto("Ropa", 500.0, 5);

        // Crear cliente
        Cliente cliente = new Cliente("Josh");

        // Agregar productos y cantidades a la venta
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);

        List<Integer> cantidades = new ArrayList<>();
        cantidades.add(2);  
        cantidades.add(3);  

        // El cliente realiza la compra
        cliente.compra(productos, cantidades);

        // Mostrar lista de ventas del cliente
        cliente.mostrarListaDeVentas();
        
        // Imprimir los detalles de la compra
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidadCompra = cantidades.get(i);
            // Aquí se imprime la cantidad disponible y la cantidad a comprar
            System.out.println(producto.toString(cantidadCompra));
        }
    }
}

