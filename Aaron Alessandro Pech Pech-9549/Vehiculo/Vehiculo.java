public class Vehiculo {
    private String modelo;
    private String color;
    private Motor motor;

    //Metedo constructor
    public Vehiculo(String modelo, String color){
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("Ford", "Deseel", 217));
    }
    //Creacion del metodo getModelo
    public String getModelo(){
        return modelo;
    }
    //Creacion del metodo getColor
    public String getColor(){
        return color;
    }
    //Creacion del metodo getMotor
    public Motor getMotor(){
        return motor;
    }
    //Creacion del metodo setModelo
    public void setModelo(String modelo){
        this.modelo = modelo.equals("")?"4 x 4": modelo;
    }
    //Creacion del metodo setColor
    public void setColor(String color){
        this.color = color.equals("")?"Blanco":color;
    }
    //Creacion del metodo setMotor
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    //Creacon del meodo toString
    public String toString(){
        return "Datos del vehiculo \n\rModelo: "+getModelo()+"\n\rColor: "+getColor()+"\n\r"+getMotor();
    }
}
