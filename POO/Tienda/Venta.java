package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Producto> lista_producto;//Creamos una lista para los productos
    private List<Integer> lista_cantidad;
    private double total;//Total para validar la comora

    //Constructor
    public Venta(Producto producto, int cantidad){
        lista_producto = new ArrayList<>();
        lista_cantidad = new ArrayList<>();
        total = 0.0;
        agregarProducto(producto, cantidad);
    }
    //Metodo set y get del total
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = (total <= 0)?100:total;
    }
    //Creamos el metodo para agregar productos
    public void agregarProducto(Producto producto, int cantidad){
        lista_producto.add(producto);
        lista_cantidad.add(cantidad);
    }
    //Creamos el metodo para calcular el total
    public void calcularTotal(){
        total = 0.0;
        for (int i = 0; i < lista_producto.size(); i++) {
            Producto p = lista_producto.get(i);
            int cantidad = lista_cantidad.get(i);
            total += p.getPrecio() * cantidad;
        }
    }
    //Creamos el metodo para mostrar los detalles de la venta
    public void mostrarDetalles(){
        System.out.println("---Detalles---");
        for(Producto detalle : lista_producto){
            System.out.println("Producto: "+detalle.getNombre()+ "Cantidad: "+detalle.getCantidad()+"Precio: "+detalle.getPrecio());
        }
        System.out.println(total);
    }
    public String toString() {
        StringBuilder resultado = new StringBuilder("Venta:\n");
        for (int i = 0; i < lista_producto.size(); i++) {
            Producto detalle = lista_producto.get(i);
            int cantidad = lista_cantidad.get(i);
            resultado.append(detalle.toString()).append(" - Cantidad: ").append(cantidad).append("\n");
        }
        resultado.append("Total: ").append(total);
        return resultado.toString();
    }


}
