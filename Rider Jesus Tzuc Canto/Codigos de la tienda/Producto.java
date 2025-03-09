public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
 
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    

    public void setNombre(String nombre) {
        this.nombre= (nombre.equals("")) ? "No producto" : nombre;
    }
    public void setPrecio(double precio) {
        this.precio= (precio<= 0 )? 0.00 : precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad= (cantidad<=0)? 0 : cantidad;
    }
    public String toString(){
        return "\n\rdatos de producto\n\r"+"nombre :"+getNombre()+"\n\rprecio :"+getPrecio()+"\n\rcantidad :"+getCantidad();
    }
}