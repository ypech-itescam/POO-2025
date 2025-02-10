public class HolaMundoOO {
    private String text;
    private String color;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printHolaMundoOO() {
        // Códigos de escape ANSI para colores
        String reset = "\u001B[0m";
        String coloredText = color + text + reset;
        System.out.println(coloredText);
    }

    // Método para establecer el color según un número
    public void setColorByNumber(int colorNumber) {
        switch (colorNumber) {
            case 1:
                setColor("\u001B[31m"); // Rojo
                break;
            case 2:
                setColor("\u001B[32m"); // Verde
                break;
            case 3:
                setColor("\u001B[33m"); // Amarillo
                break;
            case 4:
                setColor("\u001B[34m"); // Azul
                break;
            default:
                setColor("\u001B[0m"); // Color predeterminado (reset)
        }
    }

    public static void main(String[] args) {
        HolaMundoOO hello = new HolaMundoOO();
        hello.setText("Hola Mundo");

        // Imprimir "Hola Mundo" en varios colores utilizando números
        hello.setColorByNumber(1); // Rojo
        hello.printHolaMundoOO();

        hello.setColorByNumber(2); // Verde
        hello.printHolaMundoOO();

        hello.setColorByNumber(3); // Amarillo
        hello.printHolaMundoOO();

        hello.setColorByNumber(4); // Azul
        hello.printHolaMundoOO();
    }
}
