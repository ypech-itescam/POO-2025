package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Materia> materias;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void mostrarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre());
        }
    }

    public void mostrarMaterias() {
        System.out.println("Materias en " + nombre + ":");
        for (Materia m : materias) {
            System.out.println("- " + m.getNombre() + " (Profesor: " + m.getProfesor().getNombre() + ")");
        }
    }
}
