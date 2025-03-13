package Tienda;


public class Main {
    public static void main(String[] args) {
       /* // Crear algunos productos
        Producto producto1 = new Producto("Laptop", 899.99, 10);
        Producto producto2 = new Producto("Smartphone", 499.99, 5);

        // Crear una venta
        Venta venta1 = new Venta();
        venta1.agregarProducto(producto1, 2);
        venta1.agregarProducto(producto2, 1);

        // Crear otra venta
        Venta venta2 = new Venta();
        venta2.agregarProducto(producto1, 1);
        venta2.agregarProducto(producto2, 2);

        // Crear un cliente y agregarle las ventas
        Cliente cliente = new Cliente("Joel");
        cliente.agregarVenta(venta1);
        cliente.agregarVenta(venta2);

        // Mostrar las ventas del cliente
        cliente.mostrarVentas();

        //Implementacion de los nuevos constructores
        Producto producto3 = new Producto();
        Vector<Producto> productos = new Vector<>();
        productos.add(producto1);
        productos.add(producto3);
        Vector<Integer> cantidades = new Vector<>();
        cantidades.add(1);
        cantidades.add(2);
        Venta venta3 = new Venta(productos, cantidades);
        Cliente cliente2 = new Cliente();
        cliente2.agregarVenta(venta3);
        cliente2.mostrarVentas();*/


        Producto producto1 = new Producto("Laptop", 800.0, 8);
        Cliente cliente = new Cliente("Juan Perez");

        // Primera venta
        Venta venta1 = new Venta();
        venta1.agregarProducto(producto1, 8); // No hay suficiente stock
        cliente.agregarVenta(venta1); // Se guarda una copia de la venta
        cliente.mostrarVentas();

        // Aumentar stock
        producto1.actualizarStock(3, true);

        // Segunda venta con nueva instancia
        Venta venta2 = new Venta();
        venta2.agregarProducto(producto1, 8);
        cliente.agregarVenta(venta2); // Se guarda una copia de la venta
        cliente.mostrarVentas();

    }
}
