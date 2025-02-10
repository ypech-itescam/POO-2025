public class Color {
    private String nombre;
    private String color;

    public Color() {
        setNombre("ROJO");
        setColor("ROJO");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "negro": this.color = "\033[30m"; break;
            case "rojo": this.color = "\033[31m"; break;
            case "verde": this.color = "\033[32m"; break;
            case "amarillo": this.color = "\033[33m"; break;
            case "azul": this.color = "\033[34m"; break;
            case "morado": this.color = "\033[35m"; break;
            case "cyan": this.color = "\033[36m"; break;
            case "blanco": this.color = "\033[37m"; break;
            default: this.color = "\u001B[0m"; break;
        }
    }

    public String getColor() {
        return color;
    }

    public void cambiaMayus() {
        this.nombre = this.nombre.toUpperCase();
    }

    public void cambiaMin() {
        this.nombre = this.nombre.toLowerCase();
    }

    public String mostrar() {
        return getColor() + getNombre() + "\u001B[0m";
    }   
}