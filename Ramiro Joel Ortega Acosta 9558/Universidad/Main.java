import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de materias
        List<Materia> materias1 = List.of(new Materia("Matemáticas"), new Materia("Matemáticas III"));
        List<Materia> materias2 = List.of(new Materia("Química"), new Materia("Química III"));
        List<Materia> materias3 = List.of(new Materia("Geografía"), new Materia("Geografía III"));
        List<Materia> materias4 = List.of(new Materia("Artes"), new Materia("Artes III"));
        List<Materia> materias5 = List.of(new Materia("Literatura"), new Materia("Literatura III"));

        // Creación de profesores
        Profesor profesor1 = new Profesor("Juan Carlos", materias1, true);
        Profesor profesor2 = new Profesor("María Chávez", materias2, false);
        Profesor profesor3 = new Profesor("Carlos Martínez", materias3, true);
        Profesor profesor4 = new Profesor("Ana Contreras", materias4, false);
        Profesor profesor5 = new Profesor("Ramón Contreras", materias5, true);

        // Creación de lista de profesores
        List<Profesor> profesores = List.of(profesor1, profesor2, profesor3, profesor4, profesor5);

        // Creación de universidad
        Universidad universidad = new Universidad("Universidad Nacional", profesores);

        // Mostrar profesores con sus detalles
        System.out.println("Lista de Profesores en " + universidad.getNombre() + ":\n");
        for (Profesor profesor : universidad.getProfesores()) {
            System.out.println(profesor);
            System.out.println("----------------------");
        }
    }
}