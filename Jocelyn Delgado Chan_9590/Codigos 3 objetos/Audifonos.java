public class Audifonos {
    // Atributos de la clase
    private String nombre;
    private String marca;
    private String estado;

    // Constructor de la clase
    public Audifonos(String nombre, String marca, String estado) {
        this.nombre = nombre;
        this.marca = marca;
        this.estado = estado;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para mostrar la información del objeto
    @Override
    public String toString() {
        return "Audífonos: " + nombre + ", Marca: " + marca + ", Estado: " + estado;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Audifonos audifono1 = new Audifonos("Apple",     "apple 5", "encendido");
        System.out.println(audifono1);  // Imprime: Audífonos: Apple, Marca: Apple, Estado: encendido
    }
}
