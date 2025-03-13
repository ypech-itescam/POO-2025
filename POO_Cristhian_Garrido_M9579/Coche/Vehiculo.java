import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
     private String modelo;//Atributos
    private String color;
    private Motor motor;
    private List<Propietario> propietarios = new ArrayList<>();//Lista de los propietarios que tiene un vehiculo

    //Metodo constructor del Vehiculo
    public Vehiculo(String modelo, String color){
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("Ford","Hibrido",27));
    }
    //Metodo para añadir un propietario
    public void agregarPropietario(Propietario propietario){
        propietarios.add(propietario);
    }
    //Metodo para mostrar la lista de propietarios
    public void mostrarPropietarios(){
        System.out.println("=======================================");
        System.out.println("  Propietarios que tiene el vehiculo   ");
        System.out.println("=======================================");
        for(Propietario p : propietarios){
            System.out.println("Propietarios: "+p.getNombre());
        }
    }
    //Metodo getters 
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public Motor getMotor(){
        return motor;
    }
    //Metodo setter 
    public void setModelo(String modelo){
        this.modelo = modelo.equals("")?"Modelo no especificado":modelo;
    }
    public void setColor(String color){
        this.color = color.equals("")?"Color no definido":color;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "\n\r---Detalles del vehiculo---\n\rModelo: "+modelo+"\n\rColor: "+color+ "\n\r"+motor;
    }
}
