public class Materia{
    private String nombre;
    private int creditos;

    public Materia(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public int getcreditos(){
        return creditos;
    }

    public void setcreditos(int creditos){
        this.creditos = creditos;
    }

    public String toString(){
        return "Materia \n\r-Nombre: " + getnombre() + "\n\r-Creditos: " + getcreditos();
    }
}