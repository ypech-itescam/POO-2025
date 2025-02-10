public class HelloWorld {
    public static String ROJO = "\u001B[31m";
    public static String VERDE = "\u001B[32m";
    public static String AZUL = "\u001B[34m";

    private String texto;

    public HelloWorld(String texto) {
        this.texto = texto;
    }

    public void imprimirConColor(String color) {
        System.out.println(color + texto);
    }

    public static void main(String[] args) {
        HelloWorld textoColor = new HelloWorld("Hello, World!");

        textoColor.imprimirConColor(ROJO);
        textoColor.imprimirConColor(VERDE);
        textoColor.imprimirConColor(AZUL);
    }
}

