import java.util.Vector;

public class ListProductos {
    private Vector<Producto> producto;
    private int pos = 0;

    //Metodo constructor para declarar una nueva lista
    public ListProductos(){
        producto = new Vector<Producto>();
    }
    //Creamos un metodo para añadidr un producto a la lista
    public void añadirProducto(Producto producto, int cantidad){
        producto.add(producto, cantidad);
    }

    //Creamos un metodo para devolver el valor especificado de un producto en particular
    public Producto getIndiceProducto(int pos){
        if(pos >= 0 && pos < producto.size()){
            return producto.get(pos);  
        }else{
            return null;
        }
    }
    //Creamos un metodo para eliminar un producto en una lista especificada
    public Producto getElimarProducto(int pos){
        if( pos >= 0 && pos < producto.size()){
            return producto.remove(pos);
        }else{
            return null;
        }
    }
    
}
