public class Main {
    
   public static void main(String []args){

    Producto leche = new Producto("leche", 100, 25);
    Producto yogurt = new Producto("yogurt", 100, 15);
    Producto pasta = new  Producto("Pasta", 100, 20);
    Producto papel = new Producto("Papel", 100, 35);
    Producto cereal = new Producto("cereal", 100, 30);
    Producto shetos = new Producto("shetos", 100, 21);
    Producto magnum = new Producto("Magnum", 100, 40);

    Cliente cliente1 = new Cliente("Jared", "996");
    Cliente cliente2 = new Cliente("Daehyung","999");

    Tienda tienda1 = new Tienda("ABARROTES KIN", "CALLE 5 VILLA LUCRECIA");

    Proveedor provedor1 = new Proveedor("Nivea", "Mexico", "881");

    Vendedor vendedor1 = new Vendedor("Paek-Seon", "001", "981");


   NotaDeVenta nota = new NotaDeVenta("001", null, 5, cliente1, vendedor1, tienda1);

   nota.agregarProducto(leche, 15);
   nota.agregarProducto(papel, 3);
   nota.agregarProducto(yogurt, 5);
   nota.agregarProducto(shetos, 2);
   nota.agregarProducto(pasta, 6);
   nota.agregarProducto(magnum, 8);

   nota.imprimirNota();

   nota.calcularTotal();

   }
   
}
