public class Main {
    
   public static void main(String []args){

    Producto galleta = new Producto("Globitos", 100, 18);
    Producto yogurt = new Producto("Danone", 100, 24);
    Producto papel = new Producto("Kleerex", 100, 10);
    Producto cereal = new Producto("Corn flakes", 100, 55);
    Producto pan = new Producto("Bimbo", 100, 50);

   //Cliente 
    Cliente cliente1 = new Cliente("Manuel Alessandro", "9971394344");
         System.out.println(cliente1.toString());


   //Tienda

    Tienda NombreTienda = new Tienda("Casa leon","Centro");
         System.out.println(NombreTienda.toString());


   //Vendedor 

    Vendedor vendedor = new Vendedor("Marcos", "Bimbo");
         System.out.println(vendedor.toString()); 


   NotaDeVenta nota = new NotaDeVenta("001", null, 5, cliente1, vendedor, NombreTienda);

   nota.agregarProducto(galleta, 2);
   nota.agregarProducto(yogurt, 5);
   nota.agregarProducto(papel, 4);
   nota.agregarProducto(cereal, 1);
   nota.agregarProducto(pan, 1);

   nota.imprimirNota();

   nota.calcularTotal();

   }
   
}
