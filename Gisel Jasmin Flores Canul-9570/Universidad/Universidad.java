import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List <Profesor> profesores;

    public Universidad(String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesores(Profesor profesor){
        profesores.add(profesor);
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public List<Profesor> getprofesores(){
        return profesores;
    }

    public String toString(){
        return "Universidad \n\r-Nombre: " + getnombre() + "\n\r-Profesores: " + getprofesores();
    }


    
}
