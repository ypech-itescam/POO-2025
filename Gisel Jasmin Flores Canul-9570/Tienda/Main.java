public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Yaxima");
        Cliente cliente2 = new Cliente(); 

        Producto p = new Producto("Marcadores", 70.50, 10);
        Producto m = new Producto("Stickers", 50, 20); 

        Venta venta1 = new Venta(cliente1);
        Venta venta2 = new Venta(cliente2); 

        
        venta1.agregarProducto(p, 2);
        venta1.agregarProducto(m, 5); 

        venta1.mostrarProductos();

        
        m.getstock();
        venta2.agregarProducto(m, 3);
        venta2.mostrarProductos();
    }
}

