public class Main {
    
    public static void main(String[] args) {
        
        Mesa Madera = new Mesa("Cafe", "Madera", "Redonda", "Fina");
        System.out.println("Objeto 1");
        System.out.println(Madera.getColor());
        System.out.println(Madera.getMaterial());
        System.out.println(Madera.getforma());
        System.out.println(Madera.getTextura());

        Mesa Plastico = new Mesa("Blanco", "Plastico", "Rectangular", "Dura");
        System.out.println("Objeto 2");
        System.out.println(Plastico.getMaterial());
        System.out.println(Plastico.getColor());
        System.out.println(Plastico.getMaterial());
        System.out.println(Plastico.getforma());
        System.out.println(Plastico.getforma());

        Mochila Mochila1 = new Mochila(10, "azul", "Escolar", "Algodon", "Libros, Lapiceros");
        System.out.println("Objeto 3");
        System.out.println(Mochila1.getPeso());
        System.out.println(Mochila1.getColor());
        System.out.println(Mochila1.getUtilidad());
        System.out.println(Mochila1.getMaterial());
        System.out.println(Mochila1.getContenido());

        Mochila Mochila2 = new Mochila(20, "Negro", "Trabajo", "Piel", "Carpetas");
        System.out.println("Objeto 4");
        System.out.println(Mochila2.getPeso());
        System.out.println(Mochila2.getColor());
        System.out.println(Mochila2.getUtilidad());
        System.out.println(Mochila2.getMaterial());
        System.out.println(Mochila2.getContenido());

        Telefono Telefono1 = new Telefono("Motorola", "Motorola e7plus", "Azul", 0);
        System.out.println("Objeto 5");
        System.out.println(Telefono1.getMarca());
        System.out.println(Telefono1.getModelo());
        System.out.println(Telefono1.getColor());
        System.out.println(Telefono1.getEstado());

        Telefono Telefono2 = new Telefono("Realme", "Realme 12", "Rojo", 1);
        System.out.println("Objeto 6");
        System.out.println(Telefono2.getMarca());
        System.out.println(Telefono2.getModelo());
        System.out.println(Telefono2.getColor());
        System.out.println(Telefono2.getEstado());
    }
}
