import java.util.ArrayList;
import java.util.List;

class Universidad {
    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor(int pos) {
        return profesores.get(pos);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"ITESCAM":nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    @Override
    public String toString() {
        return "Universidad: " + nombre + " con " + profesores.size() + " profesores.";
    }
}