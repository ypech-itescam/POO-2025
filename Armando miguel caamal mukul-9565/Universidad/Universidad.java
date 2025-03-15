package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    
    
    public Universidad(String nombre) {
        this.nombre = nombre;
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
        this.nombre = nombre;
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
    
    public String toString() {
        StringBuilder sc = new StringBuilder();
        sc.append("Universidad: ").append(nombre).append("\n");
        sc.append("Profesores: ").append(profesores.size()).append("\n");
        for (Profesor profesor : profesores) {
            sc.append("- ").append(profesor.getNombre()).append("\n");
        }
        return sc.toString();
    }
}
    

