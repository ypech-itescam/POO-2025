public class Main {
    public static void main(String[] args) {
        Propietario juanito = new Propietario();
        juanito.setNombre("Juanito");
        Motor m = new Motor("Nissan", "Diesel", 300);
        juanito.getCarro().setMotor(m);
        System.out.println(juanito); 
        System.out.println("---------------------------------"); 
   
        Motor motor1 = new Motor("Toyota", "Gasolina", 300);
        Motor motor2 = new Motor("Nissan", "Hibrido", 250);
        Motor motor3 = new Motor("Ford", "Electrico", 400);
        Motor motor4 = new Motor("Mercedes","Gasolina");
        Motor motor5 = new Motor("Audi", "Hibrido");
       
        Vehiculo vehiculo1 = new Vehiculo("Toyota Supra", "Negro");
        vehiculo1.setMotor(motor1); 
        Propietario propietario1 = new Propietario();
        propietario1.setNombre("Juan Perez");
        propietario1.setCarro(vehiculo1);
        System.out.println(propietario1);
        System.out.println("---------------------------------");

        Vehiculo vehiculo2 = new Vehiculo("Nissan GTR", "Rojo");
        vehiculo2.setMotor(motor2);
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Maria Lopez");
        propietario2.setCarro(vehiculo2);
        System.out.println(propietario2);
        System.out.println("---------------------------------");

        Vehiculo vehiculo3 = new Vehiculo("Ford Mustang", "Azul");
        vehiculo3.setMotor(motor3);
        Propietario propietario3 = new Propietario();
        propietario3.setNombre("Carlos Gomez");
        propietario3.setCarro(vehiculo3);
        System.out.println(propietario3);
        System.out.println("---------------------------------");

        Vehiculo vehiculo4 = new Vehiculo("Mercedes AMG"); 
        vehiculo4.setMotor(motor4);
        Propietario propietario4 = new Propietario();
        propietario4.setNombre("Carlos Perez");
        propietario4.setCarro(vehiculo4);
        System.out.println(propietario4);
        System.out.println("---------------------------------");

        Vehiculo vehiculo5 = new Vehiculo("Audi Sportback"); 
        vehiculo5.setMotor(motor5);
        Propietario propietario5 = new Propietario();
        propietario5.setNombre("Carlos Perez");
        propietario5.setCarro(vehiculo5);
        System.out.println(propietario5);
        System.out.println("---------------------------------");

    }
}
    