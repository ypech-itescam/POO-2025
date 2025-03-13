import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Propietario(){
        setNombre("");
        this.vehiculos = new ArrayList<>();
    }

    //constructor con nombre
    public Propietario(String nombre) {
        setNombre(nombre);
        this.vehiculos = new ArrayList<>();

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public String toString() {
        StringBuilder detalles = new StringBuilder("-Datos del propietario \n - Nombre: " + getNombre() + "\nVehículos:\n");
        for (Vehiculo vehiculo : vehiculos) {
            detalles.append(vehiculo.toString()).append("\n");
        }
        return detalles.toString();
    }
}

