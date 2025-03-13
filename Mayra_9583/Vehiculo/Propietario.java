public class Propietario{
    private String nombre;
    private Vehiculo carro;

    public Propietario(){
        setNombre("Propietario general");
        setCarro(new Vehiculo("Nissan GTR", "Rojo"));
    }
    public Propietario(String nombre, Vehiculo carro) {
        setNombre(nombre); 
        setCarro(carro);
    }
    public String getNombre(){
        return nombre;
    }

    public Vehiculo getCarro(){
        return carro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Propietario general" : nombre;    
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public String toString() {
        return "Datos del propietario\n" +
           " - Nombre: " + nombre + "\n\n" + 
           "Datos del vehículo\n" +
           " - Modelo: " + carro.getModelo() + "\n" +
           " - Color: " + carro.getColor() + "\n\n" + 
           " - Marca: " + carro.getMotor().getMarca() + "\n" +
           " - Tipo: " + carro.getMotor().getTipo() + "\n" +
           " - HP: " + carro.getMotor().getHp() + "\n";
    }
}
