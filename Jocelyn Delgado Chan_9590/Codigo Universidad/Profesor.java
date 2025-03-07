import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private Universidad universidad;
    private List<Materia> materias;

    // Constructor
    public Profesor(String nombre) {
        setNombre(nombre);
        materias = new ArrayList<>();
    }

    // Asignar una universidad al profesor
    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    // Agregar una materia a la lista del profesor
    public void agregarMateria(Materia materia) {
        if (materia != null) {
            materias.add(materia);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return new ArrayList<>(materias); // Retorna una copia de la lista
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + ", Universidad: " + (universidad != null ? universidad.getNombre() : "Sin Universidad") + ", Materias: " + materias;
    }
}
