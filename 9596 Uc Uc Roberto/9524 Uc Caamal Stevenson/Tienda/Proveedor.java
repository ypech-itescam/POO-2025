import java.util.ArrayList;

public class Proveedor {
    private String nombre;
    private String contacto;
    private ArrayList<Producto> productosSuministrados;

    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.productosSuministrados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    public void agregarProducto(Producto producto) {
        productosSuministrados.add(producto);
    }

    public ArrayList<Producto> getProductosSuministrados() {
        return productosSuministrados;
    }
}