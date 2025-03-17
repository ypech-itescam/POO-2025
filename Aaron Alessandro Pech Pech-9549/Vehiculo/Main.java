import java.net.CacheRequest;

public class Main {
    public static void main(String[] args) {
        Propietario Aaron = new Propietario();
        Aaron.getCarro().getColor();
        Aaron.getCarro().getMotor().getTipo();
        System.out.println(Aaron);

        System.out.println("\n\r");

        Motor m = new Motor("Mustang", "Gasolina", 289);
        Aaron.getCarro().setMotor(m);
        Aaron.getCarro().setModelo("Shelby GT350");
        Aaron.setNombre("Aaron");
        System.out.println(Aaron);

        System.out.println("\n\r");

        Propietario Pepito = new Propietario();
        Motor t = new Motor("Ford", "Hibrido", 180);
        Pepito.getCarro().setMotor(t);
        Pepito.getCarro().setModelo("f-150");;
        Pepito.setNombre("Pepito");
        System.out.println(Pepito);

        System.out.println("\n\r");

        Propietario Alexis = new Propietario();
        Motor v = new Motor("Chevrolet", "Disel", 250);
        Alexis.getCarro().setMotor(v);
        Alexis.getCarro().setModelo("Tahoe");
        Alexis.setNombre("Alexis");
        System.out.println(Alexis);

        

        
    }
}
