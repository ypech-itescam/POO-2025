public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Doña Juana Abarrotes");

        Cliente cliente1 = new Cliente("Bellakath", "836-8463-9746");
        Cliente cliente2 = new Cliente("Lupe de Bronco", "976-656-2344");

        tienda.registrarCliente(cliente1);
        tienda.registrarCliente(cliente2);

        Producto sabrita = new Producto("Sabrita", 1, 16);
        Producto coca = new Producto("Coca Cola", 2, 88);

        Venta venta1 = new Venta(cliente1);
        venta1.agregarProducto(sabrita, 1);
        venta1.agregarProducto(coca, 2);
        tienda.registrarVenta(venta1);

        Venta venta2 = new Venta(cliente2);
        venta2.agregarProducto(new Producto("Harina", 1, 30), 1);
        tienda.registrarVenta(venta2);

        tienda.mostrarHistorialVentas();
    }
}
