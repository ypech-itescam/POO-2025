public class Propietario {
    private String nombre;
    private Vehiculo carro;

    public Propietario(){
        setNombre(nombre = "Juan");
        setCarro(new Vehiculo("ferrari", "blanco", null));
    }
    public void setNombre(String nombre){
        this.nombre = (nombre.equals(""))? "Juan" : nombre;
    }

    public void setCarro(Vehiculo carro){
        this.carro = carro;
    }

    //Getter

    public String getNombre(){
        return nombre;
    }

    public Vehiculo getCarro(){
        return carro;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\n\r" + getCarro();
    }
}
