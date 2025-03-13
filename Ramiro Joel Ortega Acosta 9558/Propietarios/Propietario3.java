public class Propietario3 {     
    private String nombre;     
    private Vehiculo vehiculo;  

    // Constructor usando setters
    public Propietario3(String nombre, Vehiculo vehiculo) {     
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
        System.out.println("-------------------------");
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Vehículo de Ramiro Ortega
        Motor motorGasolina = new Motor("Toyota", Motor.TIPO_GASOLINA, 150);
        Vehiculo vehiculoRamiro = new Vehiculo("Corolla", "Rojo", motorGasolina);
        Propietario1 propietario1 = new Propietario1("Ramiro Ortega", vehiculoRamiro);

        // Vehículo de Juan Pérez
        Motor motorHibrido = new Motor("Honda", Motor.TIPO_HIBRIDO, 120);
        Vehiculo vehiculoJuan = new Vehiculo("Civic", "Azul", motorHibrido);
        Propietario2 propietario2 = new Propietario2("Juan Pérez", vehiculoJuan);

        // Vehículo de Propietario3 (María González)
        Motor motorDiesel = new Motor("Ford", Motor.TIPO_DIESEL, 180);
        Vehiculo vehiculoMaria = new Vehiculo("Ranger", "Negro", motorDiesel);
        Propietario3 propietario3 = new Propietario3("María González", vehiculoMaria);

        // Mostrar información de los tres propietarios y sus vehículos
        propietario1.mostrarInfo();
        propietario2.mostrarInfo();
        propietario3.mostrarInfo();
    }
}
