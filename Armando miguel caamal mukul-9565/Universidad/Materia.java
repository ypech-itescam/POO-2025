package Universidad;

public class Materia {
    private String nombre;
    private int creditos;
    
   
    public Materia(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String toString() {
        return "Materia: " + nombre + " (" + creditos + " créditos)";
    }
}
    

