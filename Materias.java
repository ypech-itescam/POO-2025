public class Materias {
    private String nombre;
    private int creditos;

    public Materias(String nombre,int creditos){
        setnombre(nombre);
        setcreditos(creditos);

    }
    public Materias(int creditos){
        setcreditos(creditos);
        setnombre("no definido");
    }
    public void setnombre(String nombre){
        this.nombre=(nombre.equals(""))?"no definifo":nombre;        
    }
    public void setcreditos(int creditos){
        this.creditos=(creditos<0)?0:creditos;
    }
    public String getnombre(){
        return nombre;
    }
    public int getcreditos(){
        return creditos;
    }
    public String toString(){
        return "\n\r-----Informacion de la materia-----"+"\n\rNombre de la materia : "+getnombre()+"\n\r Cretidos : "+getcreditos()+"\n\r";        
    }
    
}
