public class Materia {
    private String nombre;
    private int creditos;

   
    public Materia(String nombre, int creditos) {
        setNombre(nombre);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "No asiganado" : nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = (creditos <= 0) ? 1 : creditos;
    }

   
    public String toString() {
        return nombre + " (" + creditos + " créditos)";
    }
}
