package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private ArrayList<Venta> listaDeVentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.listaDeVentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void compra(List<Producto> productos, List<Integer> cantidades) {
        if (productos.size() == cantidades.size()) {
            for (int i = 0; i < productos.size(); i++) {
                Venta venta = new Venta(productos.get(i), cantidades.get(i)); // Usa el constructor con producto y cantidad
                venta.calcularTotal();  // Asegúrate de calcular el total después de agregar productos
                listaDeVentas.add(venta);
            }
        } else {
            System.out.println("Error: La cantidad de productos y cantidades no coincide.");
        }
    }

public void mostrarListaDeVentas() {
    System.out.println("         DETALLES DE VENTA       ");
  
    
    for (Venta venta : listaDeVentas) {
        System.out.println("---------------------------------");
        System.out.println(venta.toString());
    }

    System.out.println("=================================");
}

    // Método toString
    public String toString() {
        StringBuilder resultado = new StringBuilder("Cliente: " + nombre + "\n" + "Ventas:\n");
        for (Venta venta : listaDeVentas) {
            resultado.append(venta.toString()).append("\n");
        }
        return resultado.toString();
    }
}

