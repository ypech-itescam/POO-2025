package CharlyKeb.EjerciciosDeClase;

public class Color {
    private String color;
    private String colorAnci;

    public Color(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "verde":
                this.color = "\u001B[32m";
                break;
            case "azul":
                this.color = "\u001B[34m";
                break;
            default:
                System.out.println("El color no se encuentra dentro de las opciones.");
                this.color = "\u001B[00m";
                break;
        }

    }

    public String getColorAnci() {
        colorAnci = getColor();
        return colorAnci;
    }
}
