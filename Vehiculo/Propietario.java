public class Propietario {
    private String nombre;
    private Vehiculo carro;

    //Creacion del metodo constructor
    public Propietario(){
        setNombre("Propietaro General");
        setCarro(new Vehiculo("Ranger","Gris" ));
    }
    //Creacion del metodo setNombre
    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Usuario": nombre;
    }
    //Creacion del metodo getNombre
    public String getNombre(){
        return nombre;
    }
    //Creacion del metodo setCarro
    public void setCarro(Vehiculo carro){
        this.carro = carro;
    }
    //Creacion del metodo getCarro
    public Vehiculo getCarro(){
        return carro;
    }
    //Creacion del metodo toString
    public String toString(){
        return "Datos del propietario \n\rNombre: "+getNombre()+"\n\r"+getCarro();
    }
}
