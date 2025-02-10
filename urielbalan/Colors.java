public class Color{
    private String color;
    private String colorAnsi;

     public Color(String Color){
        setColor(color);
     }

     public void setColor(String color) {
         this.color = color;
         switch (color.toLowerCase()) {
            case "negro":
                this.colorHex = "\033[30m";
                break;
            case "rojo":
                this.colorHex = "\033[31m";
                break;
            case "verde":
                this.colorHex = "\033[32m";
                break;
            case "amarillo":
                this.colorHex = "\033[33m";
                break;
            case "azul":
                this.colorHex = "\033[34m";
                break;
            default:
                this.colorHex = "\033[37m";
        };
     }

     public String getColor() {
         return color;
     }

     public void setColorAnsi(String colorAnsi) {
         this.colorAnsi = colorAnsi;
     }

     public String getColorAnsi() {
         return colorAnsi;
     }
}
