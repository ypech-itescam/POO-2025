public class Main {
    public static void main(String[] args) {
        
        Audifono audifonoSony = new Audifono("Sony", "WH-1000XM4", "Bluetooth", 80, null);
        Audifono audifonoBose = new Audifono("Bose", "QuietComfort 35", "Bluetooth", 60, null);
        
        
        Cargador cargadorAnker = new Cargador("Anker", "USB-C", 30, null);
        Cargador cargadorSamsung = new Cargador("Samsung", "Micro-USB", 15, null);
        
       
        Telefono telefonoApple = new Telefono("Apple", "iPhone 12", 2815, audifonoSony, cargadorAnker);
        Telefono telefonoSamsung = new Telefono("Samsung", "Galaxy S20", 4000, audifonoBose, cargadorSamsung);

        
        System.out.println("Detalles del Telefono Apple:");
        telefonoApple.mostrarDetalles();
        System.out.println("Detalles del Telefono Samsung:");
        telefonoSamsung.mostrarDetalles();
        
        
        telefonoApple.conectarAudifono(audifonoSony);
        telefonoSamsung.conectarAudifono(audifonoBose);
        
        
        System.out.println("\nTelefono Apple: " + telefonoApple);
        System.out.println("Telefono Samsung: " + telefonoSamsung);
        
       
        audifonoSony.mostrarNivelBateria();
        audifonoBose.mostrarNivelBateria();
        
        
        System.out.println("\nCargador Anker: " + cargadorAnker);
        System.out.println("Cargador Samsung: " + cargadorSamsung);
    }
}
