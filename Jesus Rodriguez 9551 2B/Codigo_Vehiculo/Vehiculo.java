public class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo, String color, Motor motor){
        setModelo(modelo);
        setColor(color);
        setMotor( new  Motor ("Nissan", "Hibrido", 200));
    }

    //Setter

    public void setModelo(String modelo){
        this.modelo = (modelo.equals(""))? "Corolla" : modelo;
    }

    public void setColor(String color){
        this.color = (color.equals(""))? "Blanco" : color;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }


    //Getter

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public Motor getMotor(){
        return motor;

    }

    public String toString(){
        return "Modelo: " + getModelo() + "\n\r Color: " + getColor() + "\n\r" + getMotor();
    }
    
    
}
