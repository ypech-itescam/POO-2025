public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario();

        propietario.setNombre("Pedro");
        propietario.getCarro().setColor("negro");

        Motor nuevoMotor = new Motor("dicel","Honda",400);
        propietario.getCarro().setMotor(nuevoMotor);

        System.out.println("datos luego de cambiar:");
        System.out.println(propietario);
    }
}