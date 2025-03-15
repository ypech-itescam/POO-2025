package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        
        Producto p1 = new Producto("impresora", 4500.0, 6);
        Producto p2 = new Producto("Bosina", 250.0, 5);
        
        Cliente cliente = new Cliente("Mayra");

        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);

        List<Integer> cantidades = new ArrayList<>();
        cantidades.add(2);  
        cantidades.add(3); 

        cliente.compra(productos, cantidades);

        cliente.mostrarListaDeVentas();
        
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidadCompra = cantidades.get(i);
    
            System.out.println(producto.toString(cantidadCompra));
        }
    }
}
