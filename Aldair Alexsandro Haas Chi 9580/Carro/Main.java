public class Main {
    public static void main(String[] args) {

        Propietario Juanito = new Propietario(); 
        Juanito.setNombre("Juanito");
        Juanito.getCarro().setModelo("Ferrari");
        Juanito.getCarro().setColor("Rojo");

        Motor m = new Motor("Ford", "Diesel", 222);
        Juanito.getCarro().setMotor(m);
        System.out.println(Juanito);

        System.out.println("\n");


        Propietario Maria = new Propietario();
        Maria.setNombre("Maria");
        Maria.getCarro().setModelo("Toyota");
        Maria.getCarro().setColor("Azul");

        Motor motorMaria = new Motor("Honda", "Hibrido", 150);
        Maria.getCarro().setMotor(motorMaria);
        System.out.println(Maria);

        System.out.println("\n");


        Propietario Carlos = new Propietario();
        Carlos.setNombre("Carlos");
        Carlos.getCarro().setModelo("Nissan");
        Carlos.getCarro().setColor("Verde");

        Motor motorCarlos = new Motor("Chevrolet", "Gasolina", 300);
        Carlos.getCarro().setMotor(motorCarlos);
        System.out.println(Carlos);
    }
}


    
