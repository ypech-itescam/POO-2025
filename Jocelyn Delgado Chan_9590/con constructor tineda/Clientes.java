public class Clientes {
    private String nombre, telefono;

    // Constructor con parámetros (ya existente)
    public Clientes(String nombre, String telefono) {
        setNombre(nombre);
        setTelefono(telefono);
    }

    // Constructor sin parámetros (nuevo)
    public Clientes() {
        // Asignar valores por defecto
        setNombre("CLIENTE -");
        setTelefono("TEL-");
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    // Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "CLIENTE -";
        } else {
            this.nombre = nombre;
        }
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            this.telefono = "TEL-";
        } else {
            this.telefono = telefono;
        }
    }
}
