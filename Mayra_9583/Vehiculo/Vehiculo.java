public class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo, String color) {
        setModelo(modelo);
        setColor(color);
        this.motor = new Motor("Nissan", "Hibrido", 250);
    }  
    public Vehiculo(String modelo) {
        setModelo(modelo);
        setColor("No asignado");
        this.motor = new Motor("Nissan", "Hibrido");
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
    
    public void setModelo(String modelo){
        this.modelo=(modelo.equals("")) ?"algo vacio":modelo;

    }
    
    public void setColor(String color){
        this.color = color.equals("") ? "Blanco" : color;
    }
    
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    
    public String toString(){
        return "Datos del vehiculo \r\n - Modelo:" + getModelo() + "\n\r -color:" + getColor() + "\n\r" + getMotor();
    }

}





