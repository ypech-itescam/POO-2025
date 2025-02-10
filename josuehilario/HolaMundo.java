public class HolaMundo {

    public static void main(String[] args) {
      
        imprimirEnColor("Hola Mundo", Color.ROJO);
        imprimirEnColor("Hello World", Color.AZUL);
        imprimirEnColor("Bonjour le monde", Color.VERDE);
    }

    public static void imprimirEnColor(String mensaje, Color color) {
        String codigoColor = color.getCodigo();
        String colorPredeterminado = "\u001B[0m";

        System.out.println(codigoColor + mensaje + colorPredeterminado);
    }
}

enum Color {
    ROJO("\u001B[31m"),
    AZUL("\u001B[34m"),
    VERDE("\u001B[32m");

    private final String codigo;

    Color(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
