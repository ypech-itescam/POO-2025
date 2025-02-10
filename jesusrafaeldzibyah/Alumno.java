public class Alumno{
    private String matricula;
    private String nombre;
    private Proyecto proyecto;
    
    public Alumno(String mat, String nom){
        setMatricula(mat);
        setNombre(nom);
        this.proyecto=new Proyecto("", "", 0);
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula.equals("")?"xxxx":matricula;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"Sin nombre":nombre;
    }
    public void setProyecto(Proyecto p){
        proyecto=p;
    }
    public Proyecto getProyecto(){
        return proyecto;
    }

    public String toString(){
        return "ALUMNO\nnombre del alumno: "+ getNombre()+"\nMatricula: "+getMatricula()
        +"\n\nPROYECTO DEL ALUMNO\n"+proyecto;



    }

}
