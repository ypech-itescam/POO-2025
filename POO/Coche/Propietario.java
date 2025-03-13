public class Propietario {
    private String nombre;//Creacion de los atributos del propietario
    private Vehiculo vehiculo;

    //Creacion del metodo constructor
    public Propietario(String nombre){
        setNombre(nombre);
        setVehiculo(new Vehiculo("Cb", "Negro"));
    }
    //Creacion getter
    public String getNombre(){
        return nombre;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    //Metodo setter
    public void setNombre(String nombre){
        this.nombre = nombre.equals("")?"Usuario desconocido":nombre;
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    @Override
    public String toString() {
        return "\n\r---Propietario---\n\rNombre: "+nombre+"\n\r"+vehiculo;
    }
}
