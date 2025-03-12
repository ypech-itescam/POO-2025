import java.util.Scanner;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de productos disponibles o en stock
        Producto[] productos = {
            new Producto("Manzana", 5),
            new Producto("Pan", 10),
            new Producto("Leche", 20),
            new Producto("Pechuga de pollo", 35),
            new Producto("Cereal", 30),
            new Producto("Mayonesa", 25),
        };

        System.out.println("Bienvenid@ a abarrotes Ramiro");
        System.out.println("Lista de productos disponibles:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i].nombre + " - $" + productos[i].precio);
        }

        // Seleccionar producto
        System.out.print("Ingrese el número del producto que desea comprar: ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > productos.length) {
            System.out.println("Opción no válida.");
            return;
        }

        Producto productoSeleccionado = productos[opcion - 1];

        // Ingresar cantidad de producto
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        if (cantidad < 1) {
            System.out.println("Cantidad no válida.");
            return;
        }

        // Calcular el total a pagar
        double total = cantidad * productoSeleccionado.precio;
        System.out.println("Ha seleccionado " + cantidad + " " + productoSeleccionado.nombre + "(s). Total a pagar: $" + total);
        
        System.out.println("Gracias por su compra, buen día =)");
        scanner.close();
    }
}