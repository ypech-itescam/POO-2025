import java.util.List;

public class Profesor {
    private String nombre;
    private List<Materia> materias;
    private boolean enUniversidad;

    public Profesor(String nombre, List<Materia> materias, boolean enUniversidad) {
        setNombre(nombre);
        setMaterias(materias);
        setEnUniversidad(enUniversidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public boolean estaEnUniversidad() {
        return enUniversidad;
    }

    public void setEnUniversidad(boolean enUniversidad) {
        this.enUniversidad = enUniversidad;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + "\nMaterias: " + materias + "\nEn Universidad: " + (enUniversidad ? "Sí" : "No");
    }

    public static void main(String[] args) {
        List<Materia> materias1 = List.of(new Materia("Matemáticas"), new Materia("Matemáticas III"));
        List<Materia> materias2 = List.of(new Materia("Química"), new Materia("Química III"));
        List<Materia> materias3 = List.of(new Materia("Geografía"), new Materia("Geografía III"));
        List<Materia> materias4 = List.of(new Materia("Artes"), new Materia("Artes III"));
        List<Materia> materias5 = List.of(new Materia("Literatura"), new Materia("Literatura III"));
        
        Profesor profesor1 = new Profesor("Juan Carlos", materias1, true);
        Profesor profesor2 = new Profesor("María Chávez", materias2, false);
        Profesor profesor3 = new Profesor("Carlos Martínez", materias3, true);
        Profesor profesor4 = new Profesor("Ana Contreras", materias4, false);
        Profesor profesor5 = new Profesor("Ramón Contreras", materias5, true);
        
        List<Profesor> profesores = List.of(profesor1, profesor2, profesor3, profesor4, profesor5);
        
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
            System.out.println("----------------------");
        }
    }
}