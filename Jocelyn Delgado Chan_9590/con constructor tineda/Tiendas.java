public class Tiendas {
    
    private String nombre;
    private String direccion;

    // Constructor con parámetros
    public Tiendas(String nombre, String direccion) {
        setNombre(nombre);
        setDireccion(direccion);
    }

    // Constructor sin parámetros (nuevo)
    public Tiendas() {
        // Asignar valores por defecto
        setNombre("TIENDA");
        setDireccion("S-D");
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            this.direccion = "S-D";
        } else {
            this.direccion = direccion;
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "TIENDA";
        } else {
            this.nombre = nombre;
        }
    }

    public String toString() {
        return "Nombre: " + getNombre() + " Direccion: " + getDireccion();
    }
}
