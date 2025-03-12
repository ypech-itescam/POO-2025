import java.util.ArrayList;
import java.util.List;


class Profesor {
    private String nombre;
    private Universidad universidad;
    private List<Materia> materias;

    public Profesor(String nombre) {
        setNombre(nombre);
        this.materias = new ArrayList<>();
    }

    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Profesor" : nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor:\n Nombre: " + getNombre() + "\n Universidad: " + (universidad != null ? universidad.getNombre() : "Sin Universidad") + "\n Materias: " + materias;
    }
}