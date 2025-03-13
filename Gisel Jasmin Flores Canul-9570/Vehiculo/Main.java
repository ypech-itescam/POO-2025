public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Ford", "Hibrido", 450);
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Negro", motor1);
        
        Motor motor2 = new Motor("Chevrolet", "Hibrido", 350);
        Vehiculo vehiculo2 = new Vehiculo("Chevrolet", "Azul", motor2);
        
        Motor motor3 = new Motor("Toyota", "Diesel", 200);
        Vehiculo vehiculo3 = new Vehiculo("Toyota", "Rojo", motor3);
        
        Propietario propietario1 = new Propietario("Ramiro", vehiculo1);
        Propietario propietario2 = new Propietario("Yaxima", vehiculo2);
        Propietario propietario3 = new Propietario("Gisel", vehiculo3);
        
        System.out.println(propietario1);
        System.out.println();
        System.out.println(propietario2);
        System.out.println();
        System.out.println(propietario3);
    }
}

