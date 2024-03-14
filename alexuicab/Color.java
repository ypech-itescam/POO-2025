public class Color{
    private String color;
    private String coloransi;
    public Color(String color){
        setColor(color);
    }
    public void setColor(String color){
        this.color = color;
        switch (color) {
            case ("black"): this.coloransi = "\033[30m";break;
            case ("red"):this.coloransi = "\033[31m";break;
            case("green"):this.coloransi = "\033[32m";break;
            case("yellow"):this.coloransi = "\033[33m";break;
            case("blue"):this.coloransi = "\033[34m";break;
            case("magenta"):this.coloransi = "\033[35m";break;
            case("cyan"):this.coloransi = "\033[36m";break;
            case("white"):this.coloransi = "\033[37m";break;
            default:this.coloransi = "\u001B[0m"; this.color = "blanco"; break;
        }
    }
    public String getColorAnsi(){
        return coloransi;
    }
    public String getColor(){
        return color;
    }

}