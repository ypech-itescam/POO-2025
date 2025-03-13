package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cliente;//Declarar nombre al cliente
    private List<Venta> lista_compras;//Lista de compras que hara el cliente

    //Metodo constructor
    public Cliente(String cliente){
        setCliente(cliente);
        this.lista_compras = new ArrayList<>();
    }
    //Metodo set y get del cliente y de la lista de compras
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente.equals("")?"Usuario desconocido":cliente;
    }
   
    //Metodo para comprar
    public void comprar(List<Producto> lista_producto, List<Integer> lista_cantidad){
        if(lista_producto.size() == lista_cantidad.size()){
            for(int i = 0; i < lista_producto.size();i++){
                Venta v = new Venta(lista_producto.get(i), lista_cantidad.get(i));
                v.calcularTotal();
                lista_compras.add(v);
            }
        }
    }
    //Metodo para mostrar los detalles de la compra
    public void mostrarLista(){
        System.out.println("---Lista del cliente---");
        System.out.println("Nombre del cliente: "+cliente);
        for(Venta v :lista_compras){
            System.out.println(v.toString());
        }
    }
    //Metodo to string
    public String toString() {
        StringBuilder resultado = new StringBuilder("Cliente: " + cliente+ "\n" + "Ventas:\n");
        for (Venta v : lista_compras) {
            resultado.append(v.toString()).append("\n");
        }
        return resultado.toString();
    }
    }

