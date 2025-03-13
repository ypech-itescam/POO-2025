public class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        setNombre(nombre);
        setColor(color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular área
    public double calcularArea() {
        return 0.0;
    }

    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 0.0;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Color: " + getColor() +
               ", Tipo: " + getClass().getSimpleName();
    }
}
