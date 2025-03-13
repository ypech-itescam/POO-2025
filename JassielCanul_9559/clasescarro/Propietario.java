package clasescarro;
import java.util.Vector;

public class Propietario {
    private String nombre;
    private Vector<Vehiculo> vehiculos;

    public Propietario() {
        setNombre("Cliente general");
        vehiculos = new Vector<>();
    }
    public Propietario(String nombre, Vector<Vehiculo> vehiculos){
        setNombre(nombre);
        setVehiculos(vehiculos);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre.equals("")) ? "Cliente general" : nombre;
    }

    public Vector<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Vector<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos != null ? vehiculos : new Vector<>();
    }

    public void agregarVehiculo(Vehiculo vehic) {
        vehiculos.add(vehic);
    }

    public void eliminarVehiculo(int pos) {
        vehiculos.remove(pos);
    }

    public String toString() {
        String resultado = "Datos del propietario\n - Nombre: " + getNombre() + "\n - Vehículos:\n";
        
        for (int i = 0; i < vehiculos.size(); i++) {
            resultado += "   " + (i + 1) + ". " + vehiculos.get(i) + "\n";
        }

        return resultado;
    }
}
