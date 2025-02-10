public class Lapicero {
    private String marca;
    private String color;
    private String tipoTinta;
    private double grosorPunta;
    private String materialCuerpo;

    public Lapicero(String marca, String color, String tipoTinta, double grosorPunta, String materialCuerpo) {
        this.marca = marca;
        this.color = color;
        this.tipoTinta = tipoTinta;
        this.grosorPunta = grosorPunta;
        this.materialCuerpo = materialCuerpo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTipoTinta() {
        return tipoTinta;
    }

    public double getGrosorPunta() {
        return grosorPunta;
    }

    public String getMaterialCuerpo() {
        return materialCuerpo;
    }

    public static void main(String[] args) {
        Lapicero miLapicero = new Lapicero("Bic", "Azul", "Gel", 0.7, "Plástico");
        System.out.println("Marca: " + miLapicero.getMarca());
        System.out.println("Color: " + miLapicero.getColor());
        System.out.println("Tipo de tinta: " + miLapicero.getTipoTinta());
        System.out.println("Grosor de la punta: " + miLapicero.getGrosorPunta());
        System.out.println("Material del cuerpo: " + miLapicero.getMaterialCuerpo());
    }
}