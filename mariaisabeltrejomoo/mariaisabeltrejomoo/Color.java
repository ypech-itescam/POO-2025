package mariaisabeltrejomoo;
public class Color {
    private String color;
    private String colorANSI;

    public Color(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.equals(" ")) {
            this.color= color;
            switch (color){
                case "negro":
                    this.colorANSI = "\u001B[30m";
                    break;
                case "rojo":
                    this.colorANSI = "\u001B[31m";
                    break;
                case "verde":
                    this.colorANSI = "\u001B[32m";
                    break;
                case "amarillo":
                    this.colorANSI = "\u001B[33m";
                    break;
                case "azul":
                    this.colorANSI = "\u001B[34m";
                    break;
                case "magenta":
                    this.colorANSI = "\u001B[35m";
                    break;
                case "cyan":
                    this.colorANSI = "\u001B[36m";
                    break;
                default:
                    this.color = "blanco";
                    this.colorANSI = "\u001B[37m";
                    break;
            }
        }
    }

    public String getColorANSI() {
        return colorANSI;
    }

    public void setColorANSI(String colorANSI) {
        this.colorANSI = colorANSI;
    }
}