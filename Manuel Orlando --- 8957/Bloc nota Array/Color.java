public class Color{
    private String color;
    private String colorAnsi;
    public Color(String nom){
        setColor(nom);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c.equals("")? "rojo":c;
        switch (c.toLowerCase()) {
            case "rojo":
                this.colorAnsi = "\u001B[31m";
                break;
            case "verde":
                this.colorAnsi = "\u001B[32m";
                break;
            case "amarillo":
                this.colorAnsi = "\u001B[33m";
                break;
            case "azul":
                this.colorAnsi = "\u001B[34m";
                break;
            case "magenta":
                this.colorAnsi = "\u001B[35m";
                break;
            case "cyan":
                this.colorAnsi = "\u001B[36m";
                break;
            case "blanco":
                this.colorAnsi = "\u001B[37m";
                break;
            case "gris":
                this.colorAnsi  = "\u001B[90m";
                break;
            case "negro":
                this.colorAnsi = "\u001B[30m";
                break;
            case "rosa":
                this.colorAnsi = "\u001B[95m";
                break;
            case "naranja":
                this.colorAnsi  = "\u001B[38;5;208m";
                break;
            case "turquesa":
                this.colorAnsi = "\u001B[38;5;45m";
                break;
            case "violeta":
                this.colorAnsi = "\u001B[38;5;165m";
                break;
            default:
                this.colorAnsi = "\u001B[30m";
                break;
        }
    }
    public String getColorAnsi(){
        return colorAnsi;
    } 
}
