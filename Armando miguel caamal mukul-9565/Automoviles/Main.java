package Automoviles;

public class Main {
    public static void main(String[] args) {
        
        Motor motor = new Motor("Nissan", "Hibrido", 250);
        
        Vehiculo vehiculo = new Vehiculo("Nissan GTR", "rojo");
        vehiculo.setMotor(motor);
        
        Propietario propietario = new Propietario("susana");
        propietario.setCarro(vehiculo);
    
        System.out.println(propietario);
        
        
        Motor motor1 = new Motor("Audi", "Gasolina", 300);
        Motor motor2 = new Motor("Suzuki", "Diasel", 200);
        Motor motor3 = new Motor("BMW", "Hibrido", 400);
        
        
        Vehiculo vehiculo1 = new Vehiculo("Audi MG", "Rojo");
        vehiculo1.setMotor(motor1);
        Vehiculo vehiculo2 = new Vehiculo("Suzuki MN", "Amarillo");
        vehiculo2.setMotor(motor2);
        Vehiculo vehiculo3 = new Vehiculo("BMW XV", "Blanco");
        vehiculo3.setMotor(motor3);
        
        
        Propietario propietario1 = new Propietario("sara");
        propietario1.agregarVehiculo(vehiculo1); 
        propietario1.agregarVehiculo(vehiculo2); 
        propietario1.agregarVehiculo(vehiculo3); 
        
        Propietario propietario2 = new Propietario("juanito");
        propietario2.agregarVehiculo(vehiculo2);
        propietario2.agregarVehiculo(vehiculo1);
        propietario2.agregarVehiculo(vehiculo3);
    
        System.out.println(propietario1);
        
        System.out.println(propietario2);
        
    }
}

