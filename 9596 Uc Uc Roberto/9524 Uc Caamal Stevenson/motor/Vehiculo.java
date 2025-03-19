public class Vehiculo {
    
    private String modelo;
    private String color;
    private Motor motor;
    
    public Vehiculo(String modelo, String color) {
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("CT4 2025", "Gasolina", 800));
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.equals("")? "Escalade": modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.equals("")? "Negro" : color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString(){
        return "Datos del Vehículo\n - Modelo: " + getModelo() +  "\n - Color: " + getColor();  
    }

}
