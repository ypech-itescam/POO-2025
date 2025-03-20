public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Audifonos audifonos1 = new Audifonos("Apple", "Blanco", true);
        Laptop laptop1 = new Laptop("Asus", "TUF a15");

        // Conectar audífonos a la laptop
        laptop1.encender();
        laptop1.conectarAudifonos(audifonos1);

        // Crear una mochila que contenga la laptop y los audífonos
        Mochila mochila1 = new Mochila("Negra", laptop1, audifonos1);

        // Mostrar el contenido de la mochila
        mochila1.mostrarContenido();
    }
    
}
