package Universidad;

public class Estudiante {
    private String nombre;
    private int matricula;

    public Estudiante(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nombre + " (Matrícula: " + matricula + ")";
    }
}

