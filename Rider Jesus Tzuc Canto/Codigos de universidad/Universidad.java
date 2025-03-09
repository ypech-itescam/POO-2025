import java.util.Vector;

public class Universidad {
    private String nombre;
    private Vector <Profesor> profesors;

    public Universidad(String nombre){
        setnombre(nombre);
        profesors=new Vector<>();
    }
    public void setnombre(String nombre){
        this.nombre=(nombre.equals(""))?"no definido":nombre;
    }
    public void agregarProfesor(Profesor profesors){
        this.profesors.add(profesors);
    }
    public Vector getProfesor(){
        return profesors;
    }
    public String getnombre(){
        return nombre;
    }
    public String toString(){
        return "\n\r-----Informacion de la universidad-----"+"\n\r Nombre de la universidad : "+getnombre()+"\n\r"+getProfesor();
    }
    
    
}
