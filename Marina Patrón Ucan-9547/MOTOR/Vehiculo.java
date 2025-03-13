public class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo, String color){
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("Nissan", "Hibrido", 250)); 

    }
    public Vehiculo(String modelo, String color, Motor motor) {
        setModelo(modelo);
        setColor(color);
        setMotor(motor);
    }


    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = (modelo.equals("")) ? "Nissan GTR" : modelo;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = (color.equals("")) ? "rojo" : color;
    }
    
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public String toString(){
        return "Datos del vehiculo \n \r - Modelo:" + getModelo() + "\n\r - Color:" + getColor() + "\n \r"+ getMotor();
    } 

}
