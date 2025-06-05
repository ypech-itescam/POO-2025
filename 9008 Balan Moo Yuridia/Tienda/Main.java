package Tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda MiNegocio");

        Producto prod1 = new Producto("Camiseta", 15.0, 10);
        Producto prod2 = new Producto("Pantalón", 30.0, 5);
        tienda.agregarProducto(prod1);
        tienda.agregarProducto(prod2);

        Cliente cliente1 = new Cliente("Laura Pérez", "123456789");
        tienda.agregarCliente(cliente1);

        tienda.mostrarProductos();

        Venta venta1 = new Venta(cliente1, prod1, 2);
        tienda.registrarVenta(venta1);

        tienda.mostrarVentas();
        tienda.mostrarProductos(); // Ver stock actualizado
    }
}
