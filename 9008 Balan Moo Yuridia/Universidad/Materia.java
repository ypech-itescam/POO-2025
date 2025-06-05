package Universidad;

public class Materia {
    private String nombre;
    private Profesor profesor;

    public Materia(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return nombre + " - Profesor: " + profesor.getNombre();
    }
}
