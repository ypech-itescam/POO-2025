import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre, List<Profesor> profesores) {
        setNombre(nombre);
        setProfesores(profesores);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void mostrarProfesores() {
        System.out.println("Profesores de la " + nombre + ":");
        for (Profesor profesor : profesores) {
            System.out.println("- " + profesor.getNombre());
        }
    }

    public static void main(String[] args) {
        List<Materia> materias1 = List.of(new Materia("Matemáticas"), new Materia("Matemáticas II"));
        List<Materia> materias2 = List.of(new Materia("Química"), new Materia("Química II"));
        List<Materia> materias3 = List.of(new Materia("Geografía"), new Materia("Geografía II"));
        List<Materia> materias4 = List.of(new Materia("Artes"), new Materia("Artes II"));
        List<Materia> materias5 = List.of(new Materia("Literatura"), new Materia("Literatura II"));

        Profesor profesor1 = new Profesor("Juan Carlos", materias1, true);
        Profesor profesor2 = new Profesor("María Chávez", materias2, true);
        Profesor profesor3 = new Profesor("Carlos Martínez", materias1, true);
        Profesor profesor4 = new Profesor("Ana Contreras", materias2, true);
        Profesor profesor5 = new Profesor("Ramón Contreras", materias2, true);

        List<Profesor> profesores = List.of(profesor1, profesor2);
        
        Universidad universidad = new Universidad("Universidad Nacional", profesores);
        universidad.mostrarProfesores();
    }
}