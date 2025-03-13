import java.util.Vector;
public class Profesor {
    //atributos
    private String nombre;
    private Universidad universidad;
    private Vector <Materias> materia=new Vector<>();

    //metodos
    public void asignarUniversidad(Universidad universidad){
        setuniversidad(universidad);
    }
    public void setuniversidad(Universidad u){
        universidad=(u);
    }
    public void agregarMateria(Materias m){
        materia.add(m);
    }
    public Vector getmateria(){
        return materia;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=(nombre.equals(""))?"no definido":nombre;
    }
    public String toString(){
        return "\n\r-----Informacion del porfesor-----"+"\n\rnombre :"+getnombre()+"\n\r"+getmateria()+"\n\r";
    }



    
}
