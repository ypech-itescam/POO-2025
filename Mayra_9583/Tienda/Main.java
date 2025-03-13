import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     
        Producto p1 = new Producto("Cafe", 40.0, 12);
        Producto p2 = new Producto("Leche", 32.0, 6);
        Producto p3 = new Producto("Galleta",24,7);
        Producto p4 = new Producto("Azucar",20);
        Producto p5 = new Producto("sal",14);
        Producto p6 = new Producto("Pan",6);

    
        Cliente cliente = new Cliente("Elizabeth");

        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);

        List<Integer> cantidades = new ArrayList<>();
        cantidades.add(4);  
        cantidades.add(7); 
        cantidades.add(3);
        cantidades.add(5); 
        cantidades.add(3); 
        cantidades.add(7); 

        cliente.compra(productos, cantidades);

        cliente.mostrarListaDeVentas();
        
        System.out.println("Historial de compras:");
        System.out.println("---------------------------------");

       for (Venta venta : cliente.getListaDeVentas()) { 
       System.out.println(venta.toString());
       System.out.println("---------------------------------");
    }

        
   }

}
