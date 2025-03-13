public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        setNombre (nombre);
        setPrecio (precio);
        setCantidad (cantidad);
    }
    public Producto(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre.equals("") ? "No asignado" : nombre;  
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (precio <= 0) ? 0 : precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad <= 0) ? 0 : cantidad;
    }


    public String toString() {
        return "Producto: " + nombre + "\r\n" +
               "Precio: " + precio + ", Cantidad disponible: " + cantidad;
    }

    public String toString(int cantidadCompra) {
        return "Producto: " + nombre + "\r\n" +
               "Precio: " + precio + ", Cantidad disponible: " + cantidad + 
               ", Cantidad a comprar: " + cantidadCompra;
    }
}
