import java.util.List;
import java.util.ArrayList;

public class Universidad {

    // ATRIBUTOS
    private String nombre;
    private List<Profesor> profesores;
    private int posicion;


    // CONSTRUCTOR
    public Universidad(String nombre){
        setNombre(nombre);
        setPosicion(posicion);
        profesores = new ArrayList <Profesor> ();
    }


//APARTADO DE GET

    public String getNombre(){
        return nombre;
    }

    public int getPosicion(){
        return posicion;
    }

//APARTADO DE SET

    public void setNombre(String nombre){
        this.nombre = (nombre.equals("")? "No asignado" : nombre);
    }

    public void setPosicion(int posicion){
        if (posicion >= 0){
            this.posicion = posicion;
        } else {
            System.out.println("La posición debe ser un número entero positivo.");
        }
       
    }




//METODOS DE LA CLASE UNIVERSIDAD

    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }



    public Profesor getProfesor(int posicion){

        if(posicion >= 0 && posicion < profesores.size()){
            return profesores.get(posicion);
        }
        else{
            return null;
        }

    }


    public List<Profesor> getProfesores(){
        return profesores;
    
    }

}
