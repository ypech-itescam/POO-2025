public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        setNombre(nombre);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public Producto(String nombre, double precio) {
        this(nombre, 1, precio);  
    }

    public Producto(String nombre, int cantidad) {
        this(nombre, cantidad, 1.0);  
    }

    public Producto(String nombre) {
        this(nombre, 1, 1.0); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 1;  
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio > 0 ? precio : 1.0; 
    }

    public double calcularTotal() {
        return cantidad * precio;
    }

    public void aumentarCantidad(int cantidad) {
        if (cantidad > 0) {
            setCantidad(this.cantidad + cantidad);  
        }
    }

    public void aumentarCantidad() {
        aumentarCantidad(1);  
    }

    public void disminuirCantidad(int cantidad) {
        if (cantidad > 0 && this.cantidad >= cantidad) {
            setCantidad(this.cantidad - cantidad); 
        }
    }

    @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad + " - Precio: $" + precio;
    }
}