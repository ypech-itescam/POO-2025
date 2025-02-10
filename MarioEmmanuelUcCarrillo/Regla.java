public class Regla {
    private double longitud;
    private String unidad;
    private String color;

    public Regla(double longitud, String unidad, String color) {
        this.longitud = longitud;
        this.unidad = unidad;
        this.color = color;
    }

    public void medir() {
        System.out.println("La regla de color " + this.color + " está midiendo. Tiene una longitud de " + this.longitud + " " + this.unidad + ".");
    }

    public static void main(String[] args) {
    
        Regla miRegla = new Regla(30, "centímetros", "azul");

        miRegla.medir();
    }
}
