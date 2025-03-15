package ClasesPersonales;

public class Main {
    public static void main(String[] args) {
        //clase Camionetas
        Camionetas camioneta1 = new Camionetas("Toyota", "BMW", "Negro", 2015, 25000, 4, true);
        Camionetas camioneta2 = new Camionetas("Nissan", "Hilux", "Blanca", 2020, 50000, 4, false);
        //clase Mesa
        Mesa mesa1 = new Mesa("Madera", "Marrón", "chico", "Rectangulo");
        Mesa mesa2 = new Mesa("Plastico", "blanco", "mediano", "Triangulo");
        Mesa mesa3 = new Mesa("Metal", "Negro", "Grande", "Cuadrado");
        //Clase Estuche
        EstuchedeLapicez estuche1 = new EstuchedeLapicez("Cuero", "Negro", "Mediano", "Rectangular", false, 20);
        EstuchedeLapicez estuche2 = new EstuchedeLapicez("Tela", "azul", "chico", "Rectangular", true, 10);
      
    
        System.out.println("Camionetas:\n" + camioneta1 + "\n" + camioneta2);
        System.out.println("\nEstuches:\n" + estuche1 + "\n" + estuche2);
        System.out.println("\nMesas:\n" + mesa1 + "\n" + mesa2 + "\n" + mesa3);
    }
}
