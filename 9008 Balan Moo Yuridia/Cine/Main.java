package Cine;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine("Cinemex");

        Sala sala1 = new Sala("Sala 1", 5, 5);
        cine.agregarSala(sala1);
        Asiento asiento1 = sala1.getAsiento(3, 4);
        Asiento asiento2 = sala1.getAsiento(2, 2);
        Asiento asiento3 = sala1.getAsiento(5, 5);
        Boleto boleto1 = new Boleto("Lilo & Stich", sala1, asiento1, 120.0);
        Boleto boleto2 = new Boleto("Lilo & Stich", sala1, asiento2, 120.0);
        Boleto boleto3 = new Boleto("Lilo & Stitch", sala1, asiento3, 120.0);
        asiento1.ocupar(); // Marca el asiento como ocupado al emitir el boleto
        asiento2.ocupar();
        asiento3.ocupar();
        System.out.println(boleto1);
        System.out.println(boleto2);
        System.out.println(boleto3);
        sala1.mostrarAsientos();
    }
}

