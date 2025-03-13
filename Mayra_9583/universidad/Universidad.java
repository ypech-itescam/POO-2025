import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;

  
    public Universidad(String nombre) {
        setNombre(nombre);
        profesores = new ArrayList<>();
    }

   
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null) {
            profesores.add(profesor);
            profesor.asignarUniversidad(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "No asiganado" : nombre;
    }

    public Profesor getProfesor() {
        return profesores;
    }

    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores); 
    }

    public String toString() {
        String result = "---------------------------------------------------------\n";
        result +="Universidad: " + nombre + "\n";
        result += "---------------------------------------------------------\n";
        for (Profesor profesor : profesores) {
            result += profesor + "\n";
        }
        return result;
    }
    
}
