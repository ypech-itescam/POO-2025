package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        //Creamos un producto
        Producto p = new Producto("Laptop", 1000, 15);
        Producto p1 = new Producto("Celular", 800,15);
        
        //Creamos un cliente
        Cliente c = new Cliente("Cristhian");
       
        //Añadimos los productos a una nueva lista
        List<Producto> lista_producto = new ArrayList<>();
        lista_producto.add(p);
        lista_producto.add(p1);
        
        //El clliente realiza la compra
        List<Integer> lista_cantidad = new ArrayList<>();
        lista_cantidad.add(2);
        lista_cantidad.add(3);

        //El cliente realiza la compra
        c.comprar(lista_producto, lista_cantidad);
        //Mostramos los detalles de la compra
        c.mostrarLista();
        
        for (int i = 0; i < lista_producto.size(); i++) {
            Producto producto = lista_producto.get(i);
            int cantidadCompra = lista_cantidad.get(i);
            // Aquí se imprime la cantidad disponible y la cantidad a comprar
            System.out.println(producto.toString(cantidadCompra));
        }
    }
    
}
