public abstract class FiguraGeometrica {
    protected String nombre;
    protected String color;
    protected double area;
    protected double perimetro;


    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public double calcularVolumen() {
        return 0; 
    }
}

