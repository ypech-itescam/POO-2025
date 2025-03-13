package Universidad;
import java.util.Vector;

public class Profesor {

    private String nombre;
    private Universidad universidad;
    private Vector<Materia> materias;

    public Profesor(String nombre) {
        setNombre(nombre);
        this.materias = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Vector<Materia> getMaterias() {
        return materias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Profesor X" : nombre;
    }

    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public String toString() {
        String resultado = "Profesor: " + nombre + "\n - De la Universidad: " 
                           + (universidad != null ? universidad.getNombre() : "Sin asignar") 
                           + "\n - Materias Impartidas:\n";
    
        for (int i = 0; i < materias.size(); i++) {
            resultado += "   " + (i + 1) + ". " + materias.get(i) + "\n";
        }
    
        return resultado;
    }
    
}
