public class Vehiculo {     
    private String modelo;     
    private String color;     
    private Motor motor;  

    // Constructor
    public Vehiculo(String modelo, String color, Motor motor) {     
        setModelo(modelo);     
        setColor(color);     
        setMotor(motor);   
    }  

    // Getter y Setter de modelo
    public String getModelo() {        
        return modelo;     
    }      

    public void setModelo(String modelo) {     
        this.modelo = modelo;     
    }      

    // Getter y Setter de color
    public String getColor() {         
        return color;     
    }      

    public void setColor(String color) {     
        this.color = color;     
    }     

    // Getter y Setter de motor
    public Motor getMotor() {         
        return motor;     
    }     

    public void setMotor(Motor motor) {         
        this.motor = motor;     
    } 

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Motor: " + motor.getMarca() + " - " + motor.getTipo() + " - " + motor.getHp() + " HP");
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Motor motorGasolina = new Motor("Toyota", Motor.TIPO_GASOLINA, 150);
        Vehiculo vehiculo1 = new Vehiculo("Corolla", "Rojo", motorGasolina);

        Motor motorDiesel = new Motor("Ford", Motor.TIPO_DIESEL, 180);
        Vehiculo vehiculo2 = new Vehiculo("Ranger", "Azul", motorDiesel);

        vehiculo1.mostrarInfo();
        System.out.println();
        vehiculo2.mostrarInfo();
    }
}