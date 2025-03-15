package Automoviles;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private List<Vehiculo> vehiculos;
    
    public Propietario() {
        setNombre("");
        this.vehiculos = new ArrayList<>();
    }
    
    public Propietario(String nombre) {
        setNombre(nombre);
        this.vehiculos = new ArrayList<>();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCarro(Vehiculo carro) {
        this.vehiculos.clear();
        if (carro != null) {
            this.vehiculos.add(carro);
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Vehiculo getCarro() {
        return vehiculos.isEmpty() ? null : vehiculos.get(0);
    }
    
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculos.add(vehiculo);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sc = new StringBuilder();
        sc.append("Propietario: ").append(nombre).append("\n");
        
        if (vehiculos.isEmpty()) {
            sc.append("No tiene vehículos asignados");
        } else {
            sc.append("Vehículos:\n");
            for (int i = 0; i < vehiculos.size(); i++) {
                sc.append("  ").append(i + 1).append(". ").append(vehiculos.get(i)).append("\n");
            }
        }
        
        return sc.toString();
    }
}