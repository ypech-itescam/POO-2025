package POO.Coche;
public class Propietario {

    //Atributos
    private String nombre;
    private Vehiculo carro;

    //Metodo Constructor

    public Propietario(){
        setNombre("JUANITO");
        setCarro(new Vehiculo("NISSAN GTR", "BLANCO"));

    }

    //Get

    public String getNombre(){
        return nombre;
    }
    public Vehiculo getCarro(){
        return carro;
    }

    //Set

    public void setNombre(String nombre){
        this.nombre=(nombre.equals(""))? "Hyra" : nombre; 
    }
    public void setCarro(Vehiculo carro){
        this.carro=carro;
    }
    public String toString(){
        return("Datos del propietario"+ "\n"+ "Nombre: " + getNombre() + "\n"+ getCarro());
    }
}
