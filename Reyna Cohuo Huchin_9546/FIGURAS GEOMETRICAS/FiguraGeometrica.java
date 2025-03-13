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
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;

    }
    //metodo para calcular area
    public double calcularArea(){
        return 0.0;
    }
    //metodo para calcular perimetro
    public double calcularPerimetro(){
        return 0.0;

    }
    //metodo toString
    public String toString(){
        return "Nombre:" + getNombre()+ "Color:" + getColor() +
        super.getClass();
    }

    }
