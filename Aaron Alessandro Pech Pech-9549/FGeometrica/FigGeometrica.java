public class FigGeometrica {
    private String nombre;
    private String  color;

    public FigGeometrica(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }
    public String  getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre= nombre.equals("") ? "Sin nombre" : nombre;
    }
    public void setColor(String color) {
        this.color= color.equals("") ? "Sin color" : color;
    }

    public double calcularArea() {
        return 0;
    }
    public double calcularPerimetro() {
        return 0;
    }
}