public class Main {
    public static void main(String[] args) {
    
        Propietario juanito = new Propietario();
        juanito.setNombre("Juanito");
        Laptop l =  new Laptop ("HP", "Victus", false, 8, 512, "Azul");
        juanito.getMochila().setLaptop(l);
        Telefono t = new Telefono ("Motorola","Azul", true, 8, "G22");
        juanito.getMochila().setTelefono(t);
        System.out.println(juanito); 
        System.out.println("---------------------------------"); 
    }

}

        
 