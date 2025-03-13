import java.util.List;
import java.util.ArrayList;

public class Profesor {
    
    //ATRIBUTOS
    private String nombre;
    private Universidad universidad;
    private List <Materia> materias;

    //CONSTRUCTOR

    public Profesor(String nombre){
        setNombre(nombre);
        materias = new ArrayList <Materia> (); 
        
    }



//APARTADO DE GET

    public String getNombre(){
        return nombre;
    }

//APARTADO DE "SET"
    public void setNombre(String nombre){
        this.nombre = (nombre.equals("") ? "No asignado" : nombre);
    }



    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }



//METODOS DE LA CLASE PROFESOR

    public void asignadoUniversidad(Universidad universidad){
        this.universidad = universidad;
    }



    public void agregarMateria(Materia materia){
        materias.add(materia);
    }



    public String toString(){
        return ("Nombre del profesor : " + nombre + "\n" + "Universidad : " + universidad.getNombre() + "\n" + "Materias : " + materias.toString() + "\n");
    }


}