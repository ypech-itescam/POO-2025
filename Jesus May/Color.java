public class Color{
    private String color;
    private String colorAnsi;

     public Color(String color){
        setColor(color);
     }

     public void setColor(String color) {
         switch (color) {
            case "negro":
            this.color = color;
                colorAnsi = "\033[30m";
                break;
            case "rojo":
            this.color = color;
                colorAnsi = "\033[31m";
                break;
            case "verde":
            this.color = color;
                colorAnsi = "\033[32m";
                break;
            case "amarillo":
            this.color = color;
                colorAnsi = "\033[33m";
                break;
            case "azul":
            this.color = color;
                colorAnsi = "\033[34m";
                break;
            default:
            this.color = color;
                colorAnsi = "\033[37m";
        };
     }

     public String getColor() {
         return color;
     }

     public String getColorAnsi() {
         return colorAnsi;
     }
}
