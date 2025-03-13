package Pruebas;
import java.util.Vector;

public class listaProductos {

    //ATRIBUTOS DE LA CLASE
    private Vector <Producto> productos;                        //Declarar el Vector
    private int pos;

    //CONSTRUCTOR
    public listaProductos(){
        productos = new Vector <Producto> ();                   //Inicializar la Clase Vector
        setPos(pos);
    }



    //METODOS GET


    public int getPos(){
        return pos;
    }



    public void setPos(int pos){
        this.pos = (pos >= 0 && pos < 15) ? 0 : pos;
    }


    //      AGREGAR PRODUCTO

    public void addProducto (Producto p){
        productos.add(p);
    }


    public Producto getProductoPos(int posicion) {
        if (posicion >= 0 && posicion < productos.size()) {
            return productos.get(posicion); 
        }
        return null;  
    }

   
    public Producto getProducto(Producto p) {
        if (productos.contains(p)) {
            return p; 
        }
        return null;  
    }

    
    public boolean eliminarProducto(Producto p) {
        return productos.remove(p); 
    }

  
    public Producto eliminarProductoPorIndice(int index) {
        if (index >= 0 && index < productos.size()) {
            return productos.remove(index); 
        }
        return null; 
    }

    
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (Producto p : productos) {
                System.out.println(p.getNombre() + " - " + p.getPrecio());
            }
        }
    }




}
