package POO.Coche;
public class Main{
    
    public static void main(String[] args) {

        Propietario propietario = new Propietario();
        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();
        Propietario propietario3 = new Propietario();

        propietario.setNombre("Hyra");
        propietario1.setNombre("Pedro");
        propietario2.setNombre("Pica");
        propietario3.setNombre("Piedra");

        propietario.getCarro().setColor("BLANCO");
        propietario1.getCarro().setColor("AZUL");
        propietario2.getCarro().setColor("ROJO CARMESÍ");
        propietario3.getCarro().setColor("NEGRO");

        Motor nuevoMotor = new Motor("Diesel", "Dodge", 350);
        propietario.getCarro().setMotor(nuevoMotor);

        Motor nuevoMotor1 = new Motor("Hibrido", "Nissan", 400);
        propietario.getCarro().setMotor(nuevoMotor1);

        Motor nuevoMotor2= new Motor("Eléctrico", "Honda", 450);
        propietario.getCarro().setMotor(nuevoMotor2);

        Motor nuevoMotor3 = new Motor("Gasolina", "Chevrolet", 500);
        propietario.getCarro().setMotor(nuevoMotor3);

        System.out.println("\nDatos Actualizados");

        System.out.println(propietario);
        System.out.println(propietario1);
        System.out.println(propietario2);
        System.out.println(propietario3);
        
    }
}
