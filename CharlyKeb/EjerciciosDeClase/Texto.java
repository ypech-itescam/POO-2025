package CharlyKeb.EjerciciosDeClase;

public class Texto {
    // Atributos
    private String color;
    private String texto;
    private double size;

    public Texto(String color, String texto, double size) {
        setColor(color);
        setTexto(texto);
        setSize(size);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "verde":
                this.color = "\u001B[32m";
                break;
            case "rojo":
                this.color = "\u001B[31m";
                break;
            case "azul":
                this.color = "\u001B[34m";
                break;
            case "cian":
                this.color = "\u001B[36m";
                break;
            case "morado":
                this.color = "\u001B[35m";
                break;
            default:
                System.out.println("El color no se está disponible");
                this.color = "\u001B[00m";
                break;
        }
    }

    public String getTexto() {

        return getColor() + texto + "\u001B[00m";
    }

    public void setTexto(String texto) {
        this.texto = texto.equals("") ? "HelloWorldR" : texto;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size < 0 ? 10 : size;
    }
}
