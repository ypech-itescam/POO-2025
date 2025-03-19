public class Main {
    public static void main(String[] args) {

        Vehiculo miCarro = new Vehiculo("Foerd Mustang", "Negro");

        Propietario p1 = new Propietario();
        p1.setNombre("Abner");
        p1.setVehiculo(miCarro);
        System.out.println("Datos del Propietario");
        System.out.println(" - Nombre: " + p1.getNombre());

        Motor nuevoMotor1 = new Motor("V8", "Gasolina", 500);
        p1.getVehiculo().setMotor(nuevoMotor1);

        System.out.println("\n" + p1.getVehiculo());
        System.out.println(nuevoMotor1);

        
        Vehiculo micarro2 = new Vehiculo("Camaro", "rojo");

        Propietario p2 = new Propietario();
        p2.setNombre("Aldair");
        p2.setVehiculo(micarro2);
        System.out.println("Datos del Propietario");
        System.out.println(" - Nombre: " + p2.getNombre());

        Motor nuevoMotor2 = new Motor("V8", "Gasolina", 650);
        p1.getVehiculo().setMotor(nuevoMotor2);

        System.out.println("\n" + p2.getVehiculo());
        System.out.println(nuevoMotor2);


        //3
        // Vehiculo micarro3 = new Vehiculo("Tahoe", "verde");

        // Propietario pabloHc3 = new Propietario("Robe", micarro3);
        // System.out.println("Datos del Propietario");
        // System.out.println(" - Nombre: " + pabloHc.getNombre());

        // Motor nuevoMotor3 = new Motor("v8", "Gasolina", 600);
        // pabloHc.getVehiculo().setMotor(nuevoMotor);

        // System.out.println("\n" + pabloHc3.getVehiculo());
        // System.out.println(nuevoMotor);

           /*  System.out.println("carro 2");
            System.out.println(micarro2);*/
    }




}
