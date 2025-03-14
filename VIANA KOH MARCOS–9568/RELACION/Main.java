public class Main {
    public static void main(String[] args) {
        
        Propietario propietario = new Propietario();
        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();
        Propietario propietario3= new Propietario();

       
        propietario.setNombre("Juanito");
        propietario1.setNombre("Chuz");
        propietario2.setNombre("Bryan");
        propietario3.setNombre("Manuel");
       
    
        propietario.getCarro().setColor("Azul");
        propietario1.getCarro().setColor("Negro");
        propietario2.getCarro().setColor("Amarillo");
        propietario3.getCarro().setColor("Dorado");
        
        Motor nuevoMotor = new Motor("Disel", "Honda", 400);
        propietario.getCarro().setMotor(nuevoMotor);


        Motor nuevoMotor1 = new Motor("Disel", "X3000", 560);
        propietario1.getCarro().setMotor(nuevoMotor1);


        Motor nuevoMotor2 = new Motor("Gasolina", "B34", 450);
        propietario2.getCarro().setMotor(nuevoMotor2);


        Motor nuevoMotor3 = new Motor("Hibrido", "AS212", 500);
        propietario3.getCarro().setMotor(nuevoMotor3);

        
        System.out.println("\nDatos luego de cambiar:");

        System.out.println(propietario);
        System.out.println(propietario1);
        System.out.println(propietario2);
        System.out.println(propietario3);
        
    }
    }
    
    


