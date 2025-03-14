package HERENCIA;

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
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.equals("")) {
            this.nombre = nombre;
        }
    }

    public Profesor getProfesor(int pos) {
        return profesores.get(pos);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }


    public String toString() {
        return "Universidad: " + nombre + ", Profesores: " + profesores;
    }
}

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

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.equals("")) {
            this.nombre = nombre;
        }
    }

    public List<Materia> getMaterias() {
        return materias;
    }


    public String toString() {
        return "Profesor: " + nombre + ", Universidad: " + (universidad != null ? universidad.getNombre() : "Sin Universidad") + ", Materias: " + materias;
    }
}

class Materia {
    private String nombre;
    private int creditos;

    public Materia(String nombre, int creditos) {
        setNombre(nombre);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.equals("")) {
            this.nombre = nombre;
        }
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        if (creditos > 0) {
            this.creditos = creditos;
        }
    }

    
    public String toString() {
        return "Materia: " + nombre + " (" + creditos + " créditos)";
    }
}





