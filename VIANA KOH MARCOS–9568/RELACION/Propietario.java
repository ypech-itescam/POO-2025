public class Propietario {

    private String nombre;
    private Vehiculo carro;


    public Propietario() {
        setNombre("Chapulin");
        setCarro(new Vehiculo("FERRARI", "Rojo"));
    }

  
    public String getNombre() {
        return nombre;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setNombre(String nombre) {
        this.nombre =( nombre.equals(""))? "Bryan" :nombre;
    }
    
    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public String toString() {
        return ("Datos del Propietario" + "\n" + "Nombre: " + getNombre() + "\n" + getCarro());

    
    }

}