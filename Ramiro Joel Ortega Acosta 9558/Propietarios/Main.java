public class Main {
    public static void main(String[] args) {
        // Crear instancias de los propietarios con sus vehículos
        Propietario1 propietario1 = new Propietario1();
        Propietario2 propietario2 = new Propietario2();
        Propietario3 propietario3 = new Propietario3();

        // Mostrar información de cada propietario y su vehículo
        mostrarInformacion(propietario1);
        System.out.println();
        mostrarInformacion(propietario2);
        System.out.println();
        mostrarInformacion(propietario3);
    }

    public static void mostrarInformacion(Propietario propietario) {
        System.out.println("DATOS DEL PROPIETARIO");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println();
        System.out.println("DATOS DEL VEHÍCULO");
        System.out.println("Modelo: " + propietario.getVehiculo().getModelo());
        System.out.println("Color: " + propietario.getVehiculo().getColor());
        System.out.println();
        System.out.println("DATOS DEL MOTOR");
        System.out.println("Marca: " + propietario.getVehiculo().getMotor().getMarca());
        System.out.println("Tipo: " + propietario.getVehiculo().getMotor().getTipo());
        System.out.println("HP: " + propietario.getVehiculo().getMotor().getHp());
        System.out.println("-----------------------------");
    }
}