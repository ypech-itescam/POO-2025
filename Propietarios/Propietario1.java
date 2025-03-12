public class Propietario1 {     
    private String nombre;     
    private Vehiculo vehiculo;  

    // Constructor usando setters
    public Propietario1(String nombre, Vehiculo vehiculo) {     
        setNombre(nombre);     
        setVehiculo(vehiculo);     
    }  

    // Getter y Setter de nombre
    public String getNombre() {        
        return nombre;     
    }      

    public void setNombre(String nombre) {     
        this.nombre = nombre;     
    }      

    // Getter y Setter de vehiculo
    public Vehiculo getVehiculo() {         
        return vehiculo;     
    }     

    public void setVehiculo(Vehiculo vehiculo) {         
        this.vehiculo = vehiculo;     
    } 

    // Método para mostrar la información del propietario y su vehículo
    public void mostrarInfo() {
        System.out.println("Propietario: " + nombre);
        System.out.println("Información del Vehículo:");
        vehiculo.mostrarInfo();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Motor motorGasolina = new Motor("Toyota", Motor.TIPO_GASOLINA, 150);
        Vehiculo vehiculoRamiro = new Vehiculo("Corolla", "Rojo", motorGasolina);
        Propietario1 ramiro = new Propietario1("Ramiro Ortega", vehiculoRamiro);

        ramiro.mostrarInfo();
    }
}