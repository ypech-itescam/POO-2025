import java.util.Vector;

public class Profesor {
    private String nombre;
    private Universidad universidad;
    private Vector<Materia> materia = new Vector<>();

    //Creacion de los metodos
    //Creamos el metodo para asignarles la universidad a los maestros
    public void asignarUniversidad(Universidad universidad){
        setAsignarUniversidad(universidad);
    }
    public void setAsignarUniversidad(Universidad u){
        universidad=(u);
    }
    //Creacion del metodo para agregar las materias
    public void agregarMaterias(Materia m){
        materia.add(m);
    }
    //Creacion del metodo get y set del nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"Se produjo un error":nombre;
    }
    //Creacion del metodo get del vector de las materias
    public Vector getMaterias(){
        return materia;
    }
    @Override
    public String toString() {
        return "\n\r-------Profesor-------\n\rNombre:" + getNombre() + "\n\r" + getMaterias();
    }

}
