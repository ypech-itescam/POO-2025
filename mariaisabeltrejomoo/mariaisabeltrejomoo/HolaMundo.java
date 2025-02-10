package mariaisabeltrejomoo;
public class HolaMundo{
    private String saludoI;
    private Color c;

    public HolaMundo(String saludoI) {
        c= new Color("azul");
        setSaludoI(saludoI);
    }

    public String getSaludoI() {
        return saludoI;
    }

    public void setSaludoI(String saludoI) {
        this.saludoI = saludoI.equals(" ") ? "Hola Mundo" : saludoI;
    }

    public Color getColor() {
        return c;
    }

    public void setColorI(String color) {
        this.c.setColor(color);
    }

    public void mostrar() {
        System.out.println(c.getColorANSI()+saludoI);
    }
}
