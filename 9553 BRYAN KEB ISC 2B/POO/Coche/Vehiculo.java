package POO.Coche;

public class Vehiculo {
    //Atributos
    private String modelo;
    private String color;
    private Motor motor;

    //Metodo Constructor
    public Vehiculo( String modelo, String color){
        setModelo(modelo);
        setColor(color);
        setMotor(new Motor("Hibrido", "Dodge", 450));
    }

    //Get

    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public Motor getMotor(){
        return motor;
    }

    //Set

    public void setModelo(String modelo){
        this.modelo=(modelo.equals(""))?"NISSAN GTR": modelo; 
    }
    public void setColor(String color){
        this.color=(color.equals(""))?"BLANCO": color; 
    }
    public void setMotor(Motor motor){
        this.motor=motor;
    }
      //toString

      public String toString(){
        return("DATOS DEL VEHÍCULO :" + "\n" + "MODELO :" + getModelo() + "\n" + "COLOR :" + getColor() + "\n" + motor.toString());
    }


}

