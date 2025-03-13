public class Vehiculo {
    private String marca;
    private String color;
    private Motor motor;

    public Vehiculo(String marca, String color, Motor motor) {
        this.marca = marca;
        this.color =color;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    
    public String toString() {
        return "Vehiculo: \n\r -Color: " + getcolor() + "\n\r -Marca: " + getMarca() + "\n\r" + getMotor();
}
}