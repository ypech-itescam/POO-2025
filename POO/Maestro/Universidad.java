import java.util.Vector;

public class Universidad {
    private String nombre2;
    private Vector<Profesor> profesor;
    
    //Creacion del metodo constructor de Universidad
    public Universidad(String nombre2){
        setNombre(nombre2);
        profesor = new Vector<>();
    }
    //Creacion del metodo agregarMaterias
    public void agregarProfesor(Profesor profesor){
        this.profesor.add(profesor);
    }
    //Creacion del metodo get del vector profesor
    public Vector getProfesor(){
        return profesor;
    }
    //Creacion del metodo get y set de nombre de la universidad
    public String getNombre2(){
        return nombre2;
    }
    public void setNombre(String nombre2){
        this.nombre2=nombre2.equals("")?"Se produjo un error":nombre2;
    }
    //Creacion del metodo toString
    @Override
    public String toString() {
        return "\n\r-------Universidad-------\nNombre de la universidad: " + getNombre2() + "\n\r" + getProfesor();
    }
   
    


}