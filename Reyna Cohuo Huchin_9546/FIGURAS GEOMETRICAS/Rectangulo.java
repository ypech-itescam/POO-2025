public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;

    public Rectangulo(String nombre, String color,double base, double altura){
        super(nombre, color);
        setBase(base);
        setAltura(altura);
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base= base;

    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    //metodo para calcular Area
    public double calcularArea(){
        return base*altura;
    }
    //metodo para calcular Perimetro 
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
    //metodo toString
    public String toString(){
        return "Rectangulo: \r\n" +
        "Base =" + base + "\r\n" +
        "Altura =" + altura +"r\n" +
        "Area =" + calcularArea() + "\r\n"+
        "Perimetro =" + calcularPerimetro() + "\r\n";
    }
    
}
