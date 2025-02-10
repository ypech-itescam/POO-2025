public class HolaMundo {
    public String Texto;
    public String Color;
    public Double Tamaño;

    public HolaMundo(String Texto, String Color, Double Tamaño) {
        this.Texto = Texto;
        this.Color = Color;
        this.Tamaño = Tamaño;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Double Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void imprimirConColor(String Color) {
        System.out.println(Texto + Color + Tamaño);
    }
}
