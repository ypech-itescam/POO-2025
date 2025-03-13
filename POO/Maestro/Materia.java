public class Materia {
    private String nombre1;
    private int credito;

    //Creacion de los metodos
    public Materia(String nombre1, int credito){
        setNombre1(nombre1);
        setCredito(credito);
    }
    //Creacion del metodo get y set del nombre
    public String getNombre1(){
        return nombre1;
    }
    public void setNombre1(String nombre1){
        this.nombre1=nombre1.equals("")?"Se produjo un error":nombre1;
    }
    //Creacion del metodo get y set de los creditos
    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito= (credito <= 0)?5:credito;
    }
    //Creacion del metodo toString
    @Override
    public String toString(){
        return "\n\r-------Datos de la materia-------"+"\n\rMateria: "+getNombre1()+"\n\rCreditos: "+getCredito();
    }
}
