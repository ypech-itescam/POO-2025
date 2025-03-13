import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        
    // MIS PRODUCTOS
        Producto p1 = new Producto("Camiseta", 25.50, 10);
        Producto p2 = new Producto("Pantalón", 35.00, 15);
        Producto p3 = new Producto("Zapatos", 50.00, 5);
        
    //LISTA DE PRODUCTOS
        listaProductos tienda = new listaProductos();
        
    //AGREGAR LOS PRODUCTOS
        tienda.addProducto(p1);
        tienda.addProducto(p2);
        tienda.addProducto(p3);
        
    //CLIENTE
        Cliente cliente = new Cliente("Carlos Pérez");
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a la tienda, " + cliente.getNombre() + "!");
        
    //MOSTRAR PRODUCTOS
        System.out.println("\nProductos disponibles:");
        tienda.mostrarProductos();
        
    //COMPRAR
        while (true) {
            System.out.println("\n¿Qué producto desea comprar? (Ingrese el nombre o 'salir' para terminar): ");
            String nombreProducto = sc.nextLine();
            
            if (nombreProducto.equalsIgnoreCase("salir")) {
                System.out.println("Gracias por visitar la tienda!");
                break; // Salir del bucle
            }
            
    //BUSCAR PRODUCTO
            Producto productoSeleccionado = null;
            for (Producto p : tienda.productos) {
                if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                    productoSeleccionado = p;
                    break;
                }
            }
            
            if (productoSeleccionado != null) {
                
                System.out.println("Producto seleccionado: " + productoSeleccionado.getNombre());
                System.out.println("Precio: " + productoSeleccionado.getPrecio() + "$");
                System.out.println("Cantidad disponible: " + productoSeleccionado.getCantidad());
                
            
                System.out.println("¿Cuántos agregar al carrito?");
                int cantidadComprar = sc.nextInt();
                sc.nextLine(); 
                
                if (cantidadComprar <= productoSeleccionado.getCantidad()) {
                
                //ACTUALIZAR CANTIDAD
                    productoSeleccionado.actualizarCantidad(cantidadComprar);
                    System.out.println("Compra exitosa. Has comprado " + cantidadComprar + " " + productoSeleccionado.getNombre());
                } else {
                    System.out.println("No hay suficiente stock para esa cantidad.");
                }
            } else {
                System.out.println("Producto no encontrado.");
            }
            
            //PRODUCTOS ACTUALIZADOS
            System.out.println("\nInventario actualizado:");
            tienda.mostrarProductos();
        }

        
        sc.close();
    }
}
