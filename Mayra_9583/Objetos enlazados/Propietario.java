public class Propietario {
    private String nombre;
    private Mochila mochila; 

    public Propietario() {
        setNombre("Propietario general");
        setMochila(new Mochila("Negro", "Nike", true, 1)); 
    }

    public String getNombre() {
        return nombre;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre.equals("")) ? "Propietario general" : nombre;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public String toString() {
        return "\n----------------------\n" +
        "Datos del Propietario\n" +
           "Nombre: " + nombre + "\n\n" +
           "Datos de la Mochila \n" + 
           mochila.toString();  
               
    }
}