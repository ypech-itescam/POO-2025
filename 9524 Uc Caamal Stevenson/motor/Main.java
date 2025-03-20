public class Main {
    public static void main(String[] args) {

        Vehiculo miCarro = new Vehiculo("Cadillac", "Negro");

        Propietario pabloHc = new Propietario();
        pabloHc.setNombre("Juan");
        pabloHc.setVehiculo(miCarro);
        System.out.println("Datos del Propietario");
        System.out.println(" - Nombre: " + pabloHc.getNombre());

        Motor nuevoMotor1 = new Motor("Hennessey", "Gasolina", 600);
        pabloHc.getVehiculo().setMotor(nuevoMotor1);

        System.out.println("\n" + pabloHc.getVehiculo());
        System.out.println(nuevoMotor1);

        //p2
        Vehiculo micarro2 = new Vehiculo("Mazda", "rojo");

        Propietario pabloHc2 = new Propietario();
        pabloHc2.setNombre("Robe");
        pabloHc2.setVehiculo(micarro2);
        System.out.println("Datos del Propietario");
        System.out.println(" - Nombre: " + pabloHc2.getNombre());

        Motor nuevoMotor2 = new Motor("v6", "Gasolina", 600);
        pabloHc.getVehiculo().setMotor(nuevoMotor2);

        System.out.println("\n" + pabloHc2.getVehiculo());
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
