public class Color{
    private String color;
    private String coloransi;
    public Color(String color){
        setColor(color);
    }
    public void setColor(String color){
        this.color = color;
        switch (color = color.toLowerCase()) {
            case ("negro"): this.coloransi = "\033[30m";break;
            case ("rojo"):this.coloransi = "\033[31m";break;
            case("verde"):this.coloransi = "\033[32m";break;
            case("amarillo"):this.coloransi = "\033[33m";break;
            case("azul"):this.coloransi = "\033[34m";break;
            case("magenta"):this.coloransi = "\033[35m";break;
            case("cian"):this.coloransi = "\033[36m";break;
            case("blanco"):this.coloransi = "\033[37m";break;
            default:this.coloransi = "\u001B[0m"; this.color = "blanco"; break;
        }
    }
    public String getColorAnsi(){
        return coloransi;
    }
    public String getColor(){
        return color;
    }

    public String reset(){
        return "\u001B[0m";
    }

    
}