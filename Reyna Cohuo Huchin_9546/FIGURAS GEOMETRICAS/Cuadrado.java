public class Cuadrado extends FiguraGeometrica{
    
    private double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        setLado(lado);
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    //metodo para CalcularArea
    public double calcularArea(){
        return lado*lado;
    }
    //metodo para CalcularPerimetro
    public double calcularPerimetro(){
        return 4 *lado;
    }
    //metodo toString
    public String tString(){
        return "Cuadrado: \r\n" +
        "Lado =" + lado +"\r\n"+
        "Area: =" + calcularArea() +"\r\n"+
        "Perimetro =" + calcularPerimetro() + "\r\n";
    }
}
