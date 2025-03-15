package Automoviles;
public class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;
    
    public Vehiculo(String modelo, String color) {
        setModelo(modelo);
        setColor(color);
        setMotor(null);
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getColor() {
        return color;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" +"modelo='" + modelo + '\'' +", color='" + color + '\'' +", motor=" + (motor != null ? motor.toString() : "no asignado") +'}';
    }
}