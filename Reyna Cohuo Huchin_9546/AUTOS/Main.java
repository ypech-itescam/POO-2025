public class Main {
    public static void main(String[] args) {
        // Crear un motor
        Motor motor = new Motor("Nissan", "Hibrido", 250);

        // Crear un vehículo con el motor
        Vehiculo vehiculo = new Vehiculo("Nissan GTR", "rojo");
        vehiculo.setMotor(motor);

        // Crear un propietario con el vehículo
        Propietario propietario = new Propietario("Propietario general");

        // Mostrar los datos del propietario y su vehículo
        System.out.println(propietario);


        //crear motores
        Motor motor1 = new Motor("toyota","Gasolina",300);
        Motor motor2 = new Motor("Ford","Diasel",200);
        Motor motor3 = new Motor("Honda","Hibrido",400);


        // Crear Vehiculos
        Vehiculo vehiculo1 = new Vehiculo("Toyota supra","Azul");
        vehiculo1.setMotor(motor1);
        Vehiculo vehiculo2 = new Vehiculo("Ford Mustrang", "Negro");
        vehiculo2.setMotor(motor2);
        Vehiculo vehiculo3 = new Vehiculo("Honda Accord","Blanco");
        vehiculo3.setMotor(motor3);

        // Crear propietarios
        Propietario propietario1 = new Propietario("Juantito");
        propietario1.agregarVehiculo(vehiculo1); // Agregar vehículo a propietario
        propietario1.agregarVehiculo(vehiculo2); // Agregar otro vehículo
        propietario1.agregarVehiculo(vehiculo3); // Agregar otro vehiculo 

        
        Propietario propietario2 = new Propietario("Cristina");
        propietario2.agregarVehiculo(vehiculo2);
        propietario2.agregarVehiculo(vehiculo1);
        propietario2.agregarVehiculo(vehiculo3);
        
        Propietario propietario3 = new Propietario("Paola");
        propietario3.agregarVehiculo(vehiculo3);
        propietario3.agregarVehiculo(vehiculo1);

        //mostrar propietario
        System.out.println(propietario1);
        
        System.out.println(propietario2);
        
        System.out.println(propietario3);
    }

    }