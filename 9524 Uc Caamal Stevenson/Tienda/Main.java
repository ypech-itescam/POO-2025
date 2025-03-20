public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tech Store");

        Cliente cliente1 = new Cliente("JUanito", "123-456-7890");
        Cliente cliente2 = new Cliente("Ana López", "098-765-4321");

        tienda.registrarCliente(cliente1);
        tienda.registrarCliente(cliente2);

        Producto laptop = new Producto("Laptop Dell", 10, 800);
        Producto mouse = new Producto("Mouse Logitech", 10, 50);

        Venta venta1 = new Venta(cliente1);
        venta1.agregarProducto(laptop, 1);
        venta1.agregarProducto(mouse, 2);
        tienda.registrarVenta(venta1);

        Venta venta2 = new Venta(cliente2);
        venta2.agregarProducto(new Producto("Teclado mecánico", 1, 120), 1);
        venta2.agregarProducto(mouse, 1);
        tienda.registrarVenta(venta2);

       
        tienda.mostrarHistorialVentas();
    }
}