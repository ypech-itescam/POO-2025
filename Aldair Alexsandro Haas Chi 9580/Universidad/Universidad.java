import java.util.ArrayList;
import java.util.List;

class Universidad {
    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        setNombre(nombre);
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
        profesor.asignarUniversidad(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Universidad" : nombre;
    }

    public Profesor getProfesor(int pos) {
        return profesores.get(pos);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Universidad:\n Nombre: " + getNombre() + "\n Profesores: " + profesores;
    }
}