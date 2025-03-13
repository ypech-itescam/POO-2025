

public class Materia {

    //ATRIBUTOS
    private String nombre;  
    private int creditos;


    //CONSTRUCTOR
    public Materia(String nomnbre, int creditos){

        setNombre(nombre);
        setCreditos(creditos);
    }

//APARTADO "GET"

    public String getNombre(){
        return nombre;
    }

    public int getCreditos(){
        return creditos;
    }
    


//APARTADO DE "SET"

    public void setNombre(String nombre){
        this.nombre = (nombre.equals("") ? "No asignado" : nombre);
    }


    public void setCreditos(int creditos){
        this.creditos = (creditos >= 0 && creditos <= 100) ? creditos : 0;
    }



    public String toString(){
        return ("Nombre de la materia : " + nombre + "\n" + "Total de creditos acumulados : " + creditos + "\n");
    }


    



}
