public class Tiket{
        public static void main(String[] args) {
            Venta Tiket = new Venta();

            Tiket.agregarProducto(new Producto("cacaola de 2 litros", 35.50, 2));
            Tiket.agregarProducto(new Producto("Sopas instantaneas", 18.00, 9));
    
            Tiket.calcularTotal();
            System.out.print(Tiket);

            
        
        }
    }
    