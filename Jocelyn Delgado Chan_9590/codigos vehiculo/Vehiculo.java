public class Vehiculo{
    private String modelo;
    private String color;
    private Motor motor;

    public Vehiculo(String modelo,String color){
        setmodelo(modelo);
        setcolor(color);
        motor = new Motor("kia", "Gasolina", 250);
        setmotor(motor);
    }
    public void setmodelo(String modelo){
        this.modelo=(modelo.equals(""))?"no definido":modelo;
    }
    public void setcolor(String color){
        this.color=(color.equals(""))?"no definido":color;
    }
    public void setmotor(Motor motor){
        this.motor=motor;
    }
    public String getmodelo(){
        return modelo;

    }
    public String getcolor(){
        return color;
    }
    public Motor getmotor(){
        return motor;
    }
    public String toString(){
        return "Datos del Vehiculo\n\r"+"-modelo:"+getmodelo()+"\n\r-color:"+getcolor()+"\n\r"+getmotor();
    } 
}