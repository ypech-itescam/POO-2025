package Pruebas;
 
public class Producto {

    //ATRIBUTOS DE LA CLASE
    private String nombre;
    private double precio;
    private int cantidad;
   



    //CONSTRUCTOR
    public Producto(String nombre, double precio, int cantidad){
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }


    public Producto (String nombre, double precio){
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(0);
        
    }

 


    //  -   GET
    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    //  -   SET
    public void setNombre(String nombre){
        this.nombre = (nombre.equals("")) ? "Desconocido" : nombre;
    }

    public void setPrecio(double precio){
        this.precio = (precio >= 0 && precio < 150) ? 0 : precio;
    }

    public void setCantidad(int cantidad){
        this.cantidad = (cantidad < 0 || cantidad > 100) ? 0 : cantidad;
    }
    
    //METODOS DE LA CLASE

    public boolean actualizarCantidad(int cantidad){
        if (cantidad <= cantidad) {
            cantidad -= cantidad;
            return true;
        }else{
            System.out.println("ERROR");
            return false;
        }
        
    }

    //IMPRIMIR DATOS
    public String toString(){
        return ("Nombre : " + getNombre() + getPrecio() + "$" + "Cantidad en Stock" + getCantidad());
    }
}
