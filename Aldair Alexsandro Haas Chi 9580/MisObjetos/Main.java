public class Main {
    public static void main(String[] args) {
        Mochila miMochila = new Mochila("Adidas", 800);
        Laptop laptop1 = new Laptop("Dell", "XPS 13");
        Laptop laptop2 = new Laptop("Asus", "Vivobook");
        Mouse mouse1 = new Mouse("Logitech", "G502");
        Mouse mouse2 = new Mouse("Razer", "DeathAdder");

        miMochila.agregarLaptop(laptop1);
        miMochila.agregarLaptop(laptop2);
        miMochila.agregarMouse(mouse1);
        miMochila.agregarMouse(mouse2);
        miMochila.mostrarContenido();

        laptop1.encender();
        laptop1.asignarMouse(mouse1);
        laptop1.usarMouse();
    }
}
