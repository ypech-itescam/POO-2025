package Universidad;

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

    public int getCreditos() {
        return creditos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"Materia genera":nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos>0?creditos:1;
    }

    public String toString(){
        return "Materia: " + getNombre() + "\n\r     -Créditos por la materia: " + getCreditos();
    }
    
}
