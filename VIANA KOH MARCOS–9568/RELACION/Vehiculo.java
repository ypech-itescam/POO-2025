public class Vehiculo {

    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo, String color){
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("Hibrido", "VOLVO 34", 250));
        
    }
    public String getModelo(){
        return modelo;

    }
    public String getColor(){
        return color;
    }
    
    public Motor getMotor(){
        return motor;
    }
    
    public void setModelo(String modelo){
        this.modelo =( modelo.equals(""))? "B12" :modelo;
    }

    public void setColor(String color){
        this.color =(color.equals(""))? "Negro" :color;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public  String toString(){
        return ("Datos del Vehiculo" + "\n" + "modelo: " + getModelo() + "\n" + "color: " + getColor() + "\n" + motor.toString());
    }
}   


