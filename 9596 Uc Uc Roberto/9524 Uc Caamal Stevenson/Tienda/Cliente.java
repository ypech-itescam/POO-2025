public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre.equals("") ? "Desconocido" : nombre;
        this.telefono = telefono.equals("") ? "000-000-0000" : telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " | Teléfono: " + telefono);
    }

    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono.equals("") ? this.telefono : nuevoTelefono;
    }

    public String getNombre() {
        return nombre;
    }
}