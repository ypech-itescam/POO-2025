public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        setNombre(nombre);       
        setTelefono(telefono);   
    }

    public Cliente(String nombre) {
        this(nombre, "000-000-0000");  
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " | Teléfono: " + telefono);
    }

    public void actualizarTelefono(String nuevoTelefono) {
        setTelefono(nuevoTelefono); 
    }

    public void actualizarTelefono(String nuevoNombre, String nuevoTelefono) {
        setNombre(nuevoNombre);       
        setTelefono(nuevoTelefono); 
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.equals("") ? "000-000-0000" : telefono;
    }
}