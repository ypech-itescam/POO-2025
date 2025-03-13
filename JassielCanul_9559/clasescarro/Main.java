package clasescarro;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Propietario 1
        Motor m = new Motor("Nissan", "Hibrido", 500);
        Vehiculo v = new Vehiculo("Nissan Tsuru", "Gris");
        Vehiculo carrito = new Vehiculo("Honda Civic", "Negro");
        Vehiculo carro = new Vehiculo("Mustang GTR", "Azul");
        v.setMotor(m);
        carrito.setMotor(m);
        Propietario propietario = new Propietario();
        propietario.agregarVehiculo(v);
        propietario.agregarVehiculo(carrito);
        propietario.agregarVehiculo(carro);
        propietario.setNombre("Azriel");

        // Propietario 2
        Motor mo = new Motor("BMW", "Gasolina", 850);
        Vehiculo ve = new Vehiculo("BMW i8", "Naranja");
        ve.setMotor(mo);
        Propietario propietario2 = new Propietario();
        propietario2.agregarVehiculo(ve);
        propietario2.setNombre("Alejandro");

        // Propietario 3
        Motor mot = new Motor("Bentley", "Disel", 750);
        Vehiculo veh = new Vehiculo("Bentley Continental GT", "Negro");
        veh.setMotor(mot);
        Propietario propietario3 = new Propietario();
        propietario3.agregarVehiculo(veh);
        propietario3.setNombre("Wendoly");


        // Informacion de los propietarios y sus autos
        System.out.println(propietario);
        System.out.println(propietario2);
        System.out.println(propietario3);

        propietario.eliminarVehiculo(1);
        System.out.println(propietario);


        //Aplicando los nuevos constructores

        Motor motorCV = new Motor();
        Vehiculo vehiculoCV = new Vehiculo();
        vehiculoCV.setMotor(motorCV);
        propietario2.agregarVehiculo(vehiculoCV);
        System.out.println(propietario2);

        Vector<Vehiculo> vehiculos = new Vector<>();
        vehiculos.add(vehiculoCV);
        vehiculos.add(veh);

        Propietario propietario4 = new Propietario("Joel", vehiculos);

        System.out.println(propietario4);
    }
}
