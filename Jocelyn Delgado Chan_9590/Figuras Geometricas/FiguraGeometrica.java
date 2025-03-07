public class FiguraGeometrica{
    private String nombre;
    private String color;


    public FiguraGeometrica(String nombre, String color){
        setNombre(nombre);
        setColor(color);
    }
    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double calcularPerimetro(){
        return 0;
    }
    public double calcularArea(){
        return 0;
    }
    public String toString(){
        return "FiguraGeometrica{" + "nombre='" + nombre + \' +, color='" + color + \'}";
    }
}



