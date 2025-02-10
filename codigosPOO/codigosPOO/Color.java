public class Color {
    private String color;
    private String coloransi;

    public Color(String color){
        setColor(color);
        
    }

    public void setColor(String color){
        switch (this.color = color.toLowerCase()) {
            case "negro":this.coloransi="\033[30m";break;
            case "rojo":this.coloransi="\033[31m"; break;
            case "verde":this.coloransi="\033[32m";break;          
            case "amarillo":this.coloransi="\033[33m";break;
            case "azul":this.coloransi="\033[34m"; break;
            case "morado":this.coloransi="\033[35m"; break;
            case "cyan":this.coloransi="\033[36m";break;
            case "blanco":this.coloransi="\033[37m";break;
            default: this.coloransi="\u001B[0m";break;
        }
    }
    public String getColor(){
        return color;
    }
    public String getColorAnsi(){
        return coloransi;
    }

    public String resetColor(){
        return (this.coloransi="\u001B[0m");
    }
}

