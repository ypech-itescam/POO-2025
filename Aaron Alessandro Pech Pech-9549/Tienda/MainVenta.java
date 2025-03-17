public class MainVenta {
        public static void main(String[] args) {
            Venta v = new Venta();

            v.agregarProducto(new Producto("Leche", 15.50, 2));
            v.agregarProducto(new Producto("Galletas", 18.00, 1));
            v.agregarProducto(new Producto("Arroz", 15.50, 1));
            v.agregarProducto(new Producto("Harina", 12.75, 1));
            v.agregarProducto(new Producto("Huevos", 4.25, 12));
            v.agregarProducto(new Producto("Pastel", 225.00, 1));
    
            System.out.println("El total de la venta es: $" + v.calcularTotal());
        }
    }
    