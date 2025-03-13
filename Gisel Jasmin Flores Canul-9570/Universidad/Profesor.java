
import java.util.ArrayList;
import java.util.List;

public class Profesor{
    private String nombre;
    private Universidad universidad;
    private List<Materia> materias;

    public Profesor(String nombre, Universidad universidad){
        this.nombre = nombre;
        this.universidad = universidad;
        this.materias = new ArrayList<>();
    }

    public void asignarUniversidad(Universidad universidad){
        this.universidad = universidad;
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public List<Materia> getmateria(){
        return materias;
    }

    public String toString(){
        return "Profesor: \n\r -Nombre: " + getnombre() + "\n\r-Materia: " + getmateria();
    }


}